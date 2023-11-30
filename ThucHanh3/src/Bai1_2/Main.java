/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_2;

import java.util.Arrays;

/**
 *
 * @author ttthu
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Ellipse e = new Ellipse(10,5);
        //e.hienThi();
        
        Circle c = new Circle(5);
        //c.hienThi();
        
        TamGiac t1 = new TamGiac(3, 4, 5);
        TamGiacCan t2 = new TamGiacCan(3,4);
        TamGiacDeu t3 = new TamGiacDeu(5);
        
        //t1.hienThi();
        //t2.hienThi();
        //t3.hienThi();
        
        
        Hinh[] a = {e, c, t1, t2, t3};
        Arrays.sort(a, (h1, h2) -> {
//            double d1, d2;
//            if (h1 instanceof Ellipse)
//                d1 = ((Ellipse) h1).tinhDienTich();
//            else
//                d1 = ((TamGiac) h1).tinhDienTich();
//            if (h2 instanceof Ellipse) {
//                d2 = ((Ellipse) h1).tinhDienTich();
//            } else {
//                d2 = ((TamGiac) h1).tinhDienTich();
//            }
            double d1 = h1.tinhDienTich();
            double d2 = h2.tinhDienTich();
            if (d1 > d2) {
                return 1;
            } else if (d1 < d2) {
                return -1;
            }
            return 0;
        });
        
        for(var x: a){
            x.hienThi();
        }
    }  
 }
