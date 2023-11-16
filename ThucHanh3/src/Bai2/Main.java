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
public class Main {
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat(2,3);
        hinhChuNhat.tinhChuVi();
        hinhChuNhat.tinhDienTich();
        System.out.println("Thong tin hinh chu nhat: " + hinhChuNhat.toString());
        
        Scanner scanner = new Scanner(System.in);

        // Kiểm tra TamGiac
        System.out.print("a =  ");
        double a = scanner.nextDouble();
        System.out.print("b =  ");
        double b = scanner.nextDouble();
        System.out.print("c =  ");
        double c = scanner.nextDouble();

        TamGiac tamGiac = new TamGiac(a, b, c);
        tamGiac.tinhChuVi();
        tamGiac.tinhDienTich();
        System.out.println("Thong tin TamGiac: " + tamGiac.toString());

        // Kiểm tra TamGiacCan;

        TamGiacCan tamGiacCan = new TamGiacCan(a, b);
        tamGiacCan.tinhChuVi();
        tamGiacCan.tinhDienTich();
        System.out.println("Thong tin TamGiacCan: " + tamGiacCan.toString());
        
        TamGiacDeu tamGiacDeu = new TamGiacDeu(a);
        tamGiacDeu.tinhChuVi();
        tamGiacDeu.tinhDienTich();
        System.out.println("Thong tin TamGiacCan: " + tamGiacDeu.toString());
    }
}
