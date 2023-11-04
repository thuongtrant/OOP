/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author ttthu
 */
public class Diem {
    private double x;
    private double y;

    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void hienThiDiem() {
        System.out.println("Diem{" + "x=" + x + ", y=" + y + '}');
    }
    public double tinhKhoangCach(Diem diem){
        double khoangCach = Math.sqrt(Math.pow(this.x - diem.x, 2) + Math.pow(this.y - diem.y, 2));
        return khoangCach;
    }
    
}



