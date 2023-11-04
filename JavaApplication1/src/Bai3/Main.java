/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author ttthu
 */
public class Main {

    public static void main(String[] args) {
        Vehicle xe1 = new Vehicle();
        xe1.nhapDuLieu();
        System.out.printf("%-20s%-20s%-15s%-15s\n", "Chu xe", "Hang xe", "Gia Tri", "Dung Tich", "Thue");
        System.out.println(xe1.toString());
    }
}
