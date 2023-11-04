/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;
import java.util.Scanner;
/**
 *
 * @author ttthu
 */
public class SinhVien {
     private int ma;
    private String ten;
    private double diemLT;
    private double diemTH;
    Scanner scan = new Scanner(System.in);
    
    public SinhVien() {
    }

    public SinhVien(int ma, String ten, double diemLT, double diemTH) {
        this.ma = ma;
        this.ten = ten;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }
    public void nhapDuLieu() {
        System.out.println("Nhap ma: ");
        ma = Integer.parseInt(scan.nextLine());
        System.out.println("Nhap ten");
        ten = scan.nextLine();
        System.out.println("Nhap diem LT");
        diemLT = scan.nextDouble();
        System.out.println("Nhap diem TH");
        diemTH = scan.nextDouble();
    }
    public double tinhDiemTB() {
        double lt = getDiemLT();
        double th = getDiemTH();
        return (lt+th *2)/3;
    }

     @Override
    public String toString() {
        double tb = tinhDiemTB();
        String res = String.format("%-10d%-20s%-15.2f%-15.2f%-15.2f\n", ma, ten, diemLT, diemTH, tb);
        return res;
    }
    
}

