/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.Scanner;

/**
 *
 * @author ttthu
 */
public class SanPham {
    public static Scanner scan = new Scanner(System.in);
    private String maSanPham;
    private String tenSanPham;
    private String moTaSanPham;
    private String nhaSanXuat;
    private double giaSanPham;

    public SanPham(String maSanPham, String tenSanPham, String moTaSanPham, String nhaSanXuat, double giaSanPham) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.moTaSanPham = moTaSanPham;
        this.nhaSanXuat = nhaSanXuat;
        this.giaSanPham = giaSanPham;
    }

    public void nhap(){
        System.out.println("");
        System.out.println("Ma: ");
        this.maSanPham = scan.nextLine();
        System.out.println("Ten");
        this.tenSanPham = scan.nextLine();
        System.out.println("Nha san xuat: ");
        this.nhaSanXuat = scan.nextLine();
        System.out.println("Gia ban:");
        String giaSanPham = scan.nextLine();
        this.giaSanPham = Double.parseDouble(giaSanPham);
    }
    
    public void xuat(){
        System.out.println("Ten: " + this.tenSanPham);
        System.out.println("Ma: " + this.maSanPham);
        System.out.println("Nha san xuat: " + this.nhaSanXuat);
        System.out.println("Gia ban: " + this.giaSanPham);
    }
    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getMoTaSanPham() {
        return moTaSanPham;
    }

    public void setMoTaSanPham(String moTaSanPham) {
        this.moTaSanPham = moTaSanPham;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    @Override
    public String toString() {
        return "SanPham{" + "maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", moTaSanPham=" + moTaSanPham + ", nhaSanXuat=" + nhaSanXuat + ", giaSanPham=" + giaSanPham + '}';
    }
    
    
}
