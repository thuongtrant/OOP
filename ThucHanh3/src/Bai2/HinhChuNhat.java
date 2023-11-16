/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author ttthu
 */
 class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    
    public double tinhDienTich(){
        return chieuDai*chieuRong;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" + "Dien tich =" + tinhDienTich() + ", Chu vi = " + tinhChuVi() + '}';
    }
    
    public double tinhChuVi(){
        return (chieuDai + chieuRong) / 2;
    }
    
    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    
    
}
 class HinhVuong extends HinhChuNhat{
    
    public HinhVuong(double canh) {
        super(canh, canh);
    }
    
     @Override
    public String toString() {
        return "Hinh vuong{" + "Dien tich =" + tinhDienTich() + ", Chu vi = " + tinhChuVi() + '}';
    }
}