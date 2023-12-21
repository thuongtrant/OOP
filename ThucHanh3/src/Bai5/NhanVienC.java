/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

import java.util.Scanner;

/**
 *
 * @author ttthu
 */
public class NhanVienC extends NhanVien{
    private double phuCap;
    private final double HE_SO = 2.5;

    public NhanVienC(String hoTen, String cmnd, double phuCap) {
        super(hoTen, cmnd);
        this.phuCap = phuCap;
    }

    public NhanVienC() {
    }
    
    @Override
    public void nhapNV(Scanner scan){
        super.nhapNV(scan);
        System.out.println("Phu cap: ");
        phuCap = scan.nextDouble();
    }
    
    @Override
    public String toString(){
        String s = super.toString();
        s += String.format("Phu cap: %.1f\n", this.phuCap);
        return s;
    }
    
    @Override
    public double tinhLuong(int soNgayCong){
        return super.tinhLuong(soNgayCong) + this.phuCap;
    }
    
    public double getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(double phuCap) {
        this.phuCap = phuCap;
    }
    
    
}
