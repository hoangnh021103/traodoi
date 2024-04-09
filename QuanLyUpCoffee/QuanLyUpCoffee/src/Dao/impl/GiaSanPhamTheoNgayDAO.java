/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
public class GiaSanPhamTheoNgayDAO {
public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = getConnection(); // Kết nối tới cơ sở dữ liệu

            // Cập nhật giá sản phẩm cho một ngày cụ thể
            String idSanPham = "SP001";
            Date ngay = Date.valueOf("2024-04-10");
            int giaMoi = 120000;
            updateGiaSanPhamTheoNgay(connection, idSanPham, ngay, giaMoi);
            System.out.println("Cập nhật giá thành công!");
        } catch (SQLException e) {
            System.out.println("Lỗi khi cập nhật giá: " + e.getMessage());
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Lỗi khi đóng kết nối: " + e.getMessage());
            }
        }
    }

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=UPCOFFEE3";
        String username = "sa";
        String password = "123456";
        return DriverManager.getConnection(url, username, password);
    }

    public static void updateGiaSanPhamTheoNgay(Connection connection, String idSanPham, Date ngay, int giaMoi) throws SQLException {
        String query = "UPDATE GiaSanPhamTheoNgay SET Gia = ? WHERE ID_SanPham = ? AND Ngay = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, giaMoi);
            statement.setString(2, idSanPham);
            statement.setDate(3, ngay);
            statement.executeUpdate();
        }
    }
}
