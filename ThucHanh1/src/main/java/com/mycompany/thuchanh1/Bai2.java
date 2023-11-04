/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thuchanh1;

import java.util.Scanner;

/**
 *
 * @author ttthu
 */
public class Bai2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("n= ");
        int n = scan.nextInt();
        System.out.println("x=");
        double x = scan.nextDouble();
        double gt = 0;
        for(int i = 0; i < n; i++){
            System.out.printf("a%d = ", i);
            double a = scan.nextDouble();
            gt += a*Math.pow(x,i);
        }System.out.printf("Gt = %.2f", gt);
    }
}
