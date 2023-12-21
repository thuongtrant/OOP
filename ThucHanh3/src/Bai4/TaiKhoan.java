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
    public static int dem = 0;
    private String soTk;
    private String tenTk;
    protected double soTien;
    private String soDt;
    private String email;
    private LocalDate ngayTaoTk;
    private boolean trangThaiTk;

    {
        this.soTk = String.format("%06d", dem++);
    }
    public TaiKhoan(String tenTk, double soTien) {
        this.tenTk = tenTk;
        this.soTien = soTien;
    }
    public boolean isDaoHan(){
        return true;
    }
   
    public void rutTien(double st){
        if(this.isDaoHan() && this.soTien >= st)
            this.soTien -= st;
    }
     
    public void nopTien(double st){
        if(this.isDaoHan())
            this.soTien += st;
    }
   
    public double tinhLai(){
        return (this.soTien * 0.0001) /12;
    }
    
    public void capNhatDaoHan(){
    
    }

    public void hienThi(){
        System.out.printf("So tai khoan: %s\nTen tai khoan: %s\nSo tien: %.1f\n"
                , this.soTk, this.tenTk, this.soTien);
        System.out.println("Tien lai: " + this.tinhLai());
    }

    public static int getDem() {
        return dem;
    }

    public static void setDem(int dem) {
        TaiKhoan.dem = dem;
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

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
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
