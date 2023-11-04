/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;
import java.util.Scanner;
/**
 *
 * @author ttthu
 */
public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;
    Scanner scan = new Scanner(System.in);
    public HinhChuNhat() {
    }
    
    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public void setChieuDai(double chieuDai) {
        this.chieuDai=chieuDai;
    }
    public double getChieuDai(){
        return chieuDai;
    }
    
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    public double getChieuRong(){
        return chieuRong;
    }
    public void nhapDuLieu() {
        System.out.println("Nhao vao chieu dai: ");
        this.chieuDai = scan.nextDouble();
        System.out.println("Nhao vao chieu rong: ");
         this.chieuRong = scan.nextDouble();
    }
    public double tinhDienTich() {
        double dai = getChieuDai();
        double rong = getChieuRong();
        return dai*rong;
    }
    public double tinhChuVi() {
        double dai = getChieuDai();
        double rong = getChieuRong();
        return (dai+rong)*2;
    }
      @Override
    public String toString() {
        String res = "Chieu dai: " + getChieuDai() + "\n"
                + "Chieu rong: " + getChieuRong() + "\n"
                + "Dien tich: " + tinhDienTich() + "\n"
                + "Chu vi: " + tinhChuVi();
        return res;
    }
    
}
