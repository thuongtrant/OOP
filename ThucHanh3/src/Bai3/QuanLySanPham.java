/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ttthu
 */
public class QuanLySanPham {

    private List<SanPham> danhSachSanPham = new ArrayList<>();

    public void themSanPham(SanPham s) {
        danhSachSanPham.add(s);
    }

    public void xoaSanPham(SanPham s) {
        this.danhSachSanPham.remove(s);
    }

    public void xoaSanPham(String maSanPham) {
        danhSachSanPham.removeIf(s -> s instanceof SanPham && ((SanPham) s).getMaSanPham().equals(maSanPham));
    }

    public void capNhatSanPham(String maSanPham, String tenMoi, String moTaMoi, double giaMoi) {
        for (SanPham sanPham : danhSachSanPham) {
            if (sanPham instanceof SanPham && ((SanPham) sanPham).getMaSanPham().equals(maSanPham)) {
                sanPham.setTenSanPham(tenMoi);
                sanPham.setMoTaSanPham(moTaMoi);
                sanPham.setGiaSanPham(giaMoi);
                break;
            }
        }
    }

    public List<SanPham> timKiemSanPham(String tuKhoa) {
        List<SanPham> ketQuaTimKiem = new ArrayList<>();
        for (SanPham sanPham : danhSachSanPham) {
            if (sanPham instanceof SanPham
                    && (((SanPham) sanPham).getTenSanPham().contains(tuKhoa)
                    || ((SanPham) sanPham).getMoTaSanPham().contains(tuKhoa))) {
                ketQuaTimKiem.add(sanPham);
            }

        }
        return ketQuaTimKiem;
    }

    public List<SanPham> timKiemSanPham(double giaMin, double giaMax) {
        List<SanPham> ketQuaTimKiem = new ArrayList<>();
        for (SanPham sanPham : danhSachSanPham) {
            if (sanPham instanceof SanPham
                    && ((SanPham) sanPham).getGiaSanPham() >= giaMin
                    && ((SanPham) sanPham).getGiaSanPham() <= giaMax) {
                ketQuaTimKiem.add(sanPham);
            }
        }
        return ketQuaTimKiem;
    }
    
    public void sapXepSanPham(){
        Collections.sort(danhSachSanPham, Comparator.comparingDouble(SanPham::getGiaSanPham).reversed());
    }
    
    public void hienThiDS(){
        for(SanPham sanPham:danhSachSanPham)
            System.out.println(sanPham.toString());
    }
    
    
}
