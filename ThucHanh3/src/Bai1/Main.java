/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author ttthu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ban kinh truc lon = ");
        double bkTrucLonEllipse = scan.nextDouble();
        System.out.println("Ban kinh truc be = ");
        double bkTrucBeEllipse = scan.nextDouble();
        
        Ellipse ellipse = new Ellipse(bkTrucLonEllipse, bkTrucBeEllipse);
        ellipse.tinhDienTich();
        ellipse.tinhChuVi();
        System.out.println("Thong tin ellipse " + ellipse.toString());
        
        Circle circle = new Circle(2);
        circle.tinhDienTich();
        circle.tinhChuVi();
        System.out.println("Thong tin Circle " + circle.toString());
    }
    
}
