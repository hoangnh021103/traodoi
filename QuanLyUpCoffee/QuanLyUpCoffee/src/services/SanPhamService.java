/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;
import model.SanPham;
import dao1.SanPhamDao;
import java.util.List;
/**
 *
 * @author Admin
 */
public class SanPhamService {
    SanPhamDao dao = new SanPhamDao();

    public void insert(SanPham sp) {
        dao.insert(sp);
    }

    public void update(SanPham sp) {
        dao.update(sp);
    }

    public void delete(SanPham sp) {
        dao.delete(sp.getId_sp());
    }
    public void themSanPham(SanPham sanPham, List<SanPham> danhSachSanPham) {
        danhSachSanPham.add(sanPham);
    }
    
    // Sửa thông tin sản phẩm
    public void suaSanPham(String id, SanPham sanPham, List<SanPham> danhSachSanPham) {
        for (int i = 0; i < danhSachSanPham.size(); i++) {
            if (danhSachSanPham.get(i).getId_sp().equals(id)) {
                danhSachSanPham.set(i, sanPham);
                break;
            }
        }
    }
    
    // Xóa sản phẩm
    public void xoaSanPham(String id, List<SanPham> danhSachSanPham) {
        for (int i = 0; i < danhSachSanPham.size(); i++) {
            if (danhSachSanPham.get(i).getId_sp().equals(id)) {
                danhSachSanPham.remove(i);
                break;
            }
        }
    }
}
