/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ttthu
 */
public class QuanLySanPham {

    private List<SanPham> danhSachSanPham = new ArrayList<>();

    public void themSanPham(SanPham s) {
        this.danhSachSanPham.add(s);
    }

    public void hienThi(){
        this.danhSachSanPham.forEach(s -> s.xuat());
    }
    
    public List<SanPham> timKiem(String kw){
        return danhSachSanPham.stream().filter(h -> h.getTenSanPham().contains(kw)).collect(Collectors.toList());
    }
    
    public void sapXepGianTheoGia(){
        this.danhSachSanPham.sort((sp1, sp2) -> {
           double k = sp1.getGiaSanPham() - sp2.getGiaSanPham();
           return -((k > 0) ? 1:(k < 0)?-1:0);
        });
    }
  
    public void themVanPhongPham(VanPhongPham vp) {
        this.danhSachSanPham.add(vp);
    }
    
    public void xoaSanPham(SanPham s) {
        this.danhSachSanPham.remove(s);
    }
   

    public void xoaSanPham(String maSanPham) {
        danhSachSanPham.removeIf(s -> s.getMaSanPham().equals(maSanPham));
    }

    public void capNhatSanPham(String maSanPham, String tenMoi, String moTaMoi, double giaMoi) {
        for (SanPham sanPham : danhSachSanPham) {
            if (sanPham.getMaSanPham().equals(maSanPham)) {
                sanPham.xuat();// Hiển thị thông tin sản phẩm trước khi cập nhật
                sanPham = new SanPham(maSanPham, tenMoi, moTaMoi, sanPham.getNhaSanXuat(), giaMoi);
                System.out.println("Thông tin sau khi cập nhật:");
                sanPham.xuat();
                return;
            }
        }
    }

//    public List<SanPham> timKiemSanPham(String tuKhoa) {
//        List<SanPham> ketQuaTimKiem = new ArrayList<>();
//        for (SanPham sanPham : danhSachSanPham) {
//            if (sanPham instanceof SanPham
//                    && (((SanPham) sanPham).getTenSanPham().contains(tuKhoa)
//                    || ((SanPham) sanPham).getMoTaSanPham().contains(tuKhoa))) {
//                ketQuaTimKiem.add(sanPham);
//            }
//
//        }
//        return ketQuaTimKiem;
//    }
//
//    public List<SanPham> timKiemSanPham(double giaMin, double giaMax) {
//        List<SanPham> ketQuaTimKiem = new ArrayList<>();
//        for (SanPham sanPham : danhSachSanPham) {
//            if (sanPham instanceof SanPham
//                    && ((SanPham) sanPham).getGiaSanPham() >= giaMin
//                    && ((SanPham) sanPham).getGiaSanPham() <= giaMax) {
//                ketQuaTimKiem.add(sanPham);
//            }
//        }
//        return ketQuaTimKiem;
//    }
//    
    public void sapXepSanPham(){
        Collections.sort(danhSachSanPham, Comparator.comparingDouble(SanPham::getGiaSanPham).reversed());
    }
    
   
    
    
}
