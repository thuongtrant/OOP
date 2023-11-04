/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.thuchanh1;

import java.util.Scanner;

/**
 *
 * @author ttthu
 */
public class Bai1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int n = (int) (Math.random() * 100 + 1);
        System.out.println("Nhap vao con so: ");
        Scanner scan = new Scanner(System.in);
        int number;
        do {
            number = scan.nextInt();
            if (number > n) {
                System.out.println("Lon hon");
            } else if (number < n) {
                System.out.println("Nho hon");
            } else {
                System.out.println("Chinh xac");
            }
        } while (number != n);
    }
}
