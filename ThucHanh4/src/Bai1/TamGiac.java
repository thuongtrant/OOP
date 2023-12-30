/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author ttthu
 */
public class TamGiac extends Hinh {

    private double a, b, c;

    public TamGiac(String ten,double a, double b, double c) {
        super(ten);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double tinhDienTich() {
        double p = tinhChuVi() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    double tinhChuVi() {
        return a + b + c;
    }
@Override
    public boolean equals(Object obj) {
        if(obj instanceof TamGiac){
            TamGiac h = (TamGiac) obj;
            return super.equals(obj) && this.a == h.a &&
                    this.b == h.c && this.c == h.c;
        }    
        return false;
    }
}
