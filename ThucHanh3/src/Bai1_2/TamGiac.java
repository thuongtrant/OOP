/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_2;

/**
 *
 * @author ttthu
 */
public class TamGiac extends Hinh{

    private double a, b, c;

    public TamGiac(double a, double b, double c) throws Exception {
        if(isTamGiac(a, b, c)){
            this.a = a;
            this.b = b;
            this.c = c;
        } else {
            throw new Exception("Invalid data!");
        }

    }

     public boolean isTamGiac(double a, double b, double c) {
          return a + b > c && a + c > b && b + c > a;
      }

    public double tinhChuVi() {
        return a + b + c;
    }

    @Override
    public double tinhDienTich() {
        double p = tinhChuVi() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public String layTen() {
        return "Tam giac";
    }

    @Override
    public void hienThi() {
        System.out.printf("%s\nDien tich: %.1f\n", this.layTen(), this.tinhDienTich());
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

}
