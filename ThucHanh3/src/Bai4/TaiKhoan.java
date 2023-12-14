/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

import java.time.LocalDate;

/**
 *
 * @author ttthu
 */


public class TaiKhoan {
    public static int soTaiKhoan = 0;
    private String soTk;
    private String tenTk;
    private String soDt;
    private String email;
    private double soTien;
    private LocalDate ngayTaoTk;
    private boolean trangThaiTk;

    public TaiKhoan() {
    }

    public TaiKhoan(String tenTk, String soDt, String email, double soTien, LocalDate ngayTaoTk) {
        this.soTk = String.format("%06d", ++soTaiKhoan);
        this.tenTk = tenTk;
        this.soDt = soDt;
        this.email = email;
        this.soTien = soTien;
        this.ngayTaoTk = ngayTaoTk;
        this.trangThaiTk = true; // true: tài khoản không kỳ hạn, false: tài khoản có kỳ hạn
    }

    public void hienThi(){
        System.out.println("So tai khoan: " + soTk);
        System.out.println("Ten tai khoan: " + tenTk);
        System.out.println("So tien: " + soTien);
        System.out.println("Loai tai khoan: " );
    }

    
    
    public static int getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public static void setSoTaiKhoan(int soTaiKhoan) {
        TaiKhoan.soTaiKhoan = soTaiKhoan;
    }

    public String getSoTk() {
        return soTk;
    }

    public void setSoTk(String soTk) {
        this.soTk = soTk;
    }

    public String getTenTk() {
        return tenTk;
    }

    public void setTenTk(String tenTk) {
        this.tenTk = tenTk;
    }

    public String getSoDt() {
        return soDt;
    }

    public void setSoDt(String soDt) {
        this.soDt = soDt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    public LocalDate getNgayTaoTk() {
        return ngayTaoTk;
    }

    public void setNgayTaoTk(LocalDate ngayTaoTk) {
        this.ngayTaoTk = ngayTaoTk;
    }

    public boolean isTrangThaiTk() {
        return trangThaiTk;
    }

    public void setTrangThaiTk(boolean trangThaiTk) {
        this.trangThaiTk = trangThaiTk;
    }
    
    
}
