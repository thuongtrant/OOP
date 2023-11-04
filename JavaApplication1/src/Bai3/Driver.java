/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ttthu
 */
public class Driver {

    static Scanner scan = new Scanner(System.in);
    static ArrayList<Vehicle> list = new ArrayList<>();

    public static void main(String[] args) {
        int tiepTuc;
        do {

            System.out.print("1. Nhap thong tin \n2.Xuat thong tin\n3.Thoat\n Ban chon: ");
            int chon = scan.nextInt();
            switch (chon) {
                case 1:
                    Vehicle ptgt = new Vehicle();
                    System.out.print("Nhap so luong xe");
                    int sluong = scan.nextInt();
                    for (int i = 0; i < sluong; i++) {
                        ptgt.nhapDuLieu();
                        list.add(ptgt);
                    }
                    break;
                case 2:
                    System.out.printf("%-20s%-20s%-15s%-15s\n", "Chu xe", "Hang xe", "Gia Tri", "Dung Tich", "Thue");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.print(list.get(i).toString());
                    }
                    break;
                case 3:
                    break;
                default:
                    break;
            }
            System.out.print("Nhap 1 de tiep tuc: ");
            tiepTuc = scan.nextInt();
        } while (tiepTuc == 1);
    }
}
