/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author ttthu
 */
 class TamGiac {
    private double a, b , c;

     public TamGiac(double a, double b, double c) {
         if (isTamGiac(a, b, c)) {
             this.a = a;
             this.b = b;
             this.c = c;
         } else {
             System.out.println("Khong phai tam giac. Hay nhap lai gia tri: ");
         }

     }
    private boolean isTamGiac(double a, double b, double c) {
          return a + b > c && a + c > b && b + c > a;
      }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public double tinhDienTich(){
        double p = tinhChuVi() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    
    public double tinhChuVi(){
        return a + b + c;
    }

    @Override
    public String toString() {
        return "TamGiac{" + "Chu vi = " + tinhChuVi() + ", Dien tich = " + tinhDienTich() + '}';
    }
    
    
}


class TamGiacCan extends TamGiac{
    
    public TamGiacCan(double ab, double c) {
        super(ab, ab, c);
    }
    
      @Override
    public String toString() {
        return "TamGiacCan{" + "Chu vi = " + tinhChuVi() + ", Dien tich = " + tinhDienTich() + '}';
    }
}

class TamGiacDeu extends TamGiac{
    
    public TamGiacDeu(double abc) {
        super(abc, abc, abc);
    }
    
      @Override
    public String toString() {
        return "TamGiacDeu{" + "Chu vi = " + tinhChuVi() + ", Dien tich = " + tinhDienTich() + '}';
    }
}