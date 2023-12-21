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
public class NhanVien {

    private static int dem = 0;
    private int maSo;
    private String hoTen;
    private String cmnd;
    protected final double luong = 100;

    {
        this.maSo = ++dem;
    }

    public NhanVien() {
    }
 
    public NhanVien(String hoTen, String cmnd) {
        this.hoTen = hoTen;
        this.cmnd = cmnd;
    }

    public double tinhLuong(int soNgayCong) {
        return this.luong * soNgayCong;
    }

    public void nhapNV(Scanner scan) {
        System.out.println("Ho ten: ");
        this.hoTen = scan.nextLine();
        System.out.println("CMND: ");
        this.cmnd = scan.nextLine();
    }

    @Override
    public String toString() {
        return "NhanVien{" + "hoTen=" + hoTen + ", cmnd=" + cmnd + '}';
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

}
