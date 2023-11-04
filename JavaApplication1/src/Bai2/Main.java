/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author ttthu
 */
public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(1,"Tran Thuong", 9, 10);
        SinhVien sv2 = new SinhVien(2, "Thuy Trang", 8,9);
        SinhVien sv3 = new SinhVien();
        sv3.nhapDuLieu();
        System.out.printf("%-10s%-20s%-15s%-15s%-15s\n", "Ma", "Ten", "Diem LT", "Diem TH", "Diem TB");
        System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        System.out.println(sv3.toString());
        
    }

   
}
