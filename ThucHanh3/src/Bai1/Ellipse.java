/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author ttthu
 */
public class Ellipse {
    private double bkTrucLon;
    private double bkTrucBe;

    public Ellipse(double bkTrucLon, double bkTrucBe) {
        this.bkTrucLon = bkTrucLon;
        this.bkTrucBe = bkTrucBe;
    }
    
    public double tinhDienTich(){
        return Math.PI*bkTrucLon*bkTrucBe;
    }
    
    public double tinhChuVi(){
        return 2*Math.PI*Math.sqrt(((Math.pow(bkTrucBe,2) + Math.pow(bkTrucLon,2)))/2);
    }

    public double getBkTrucLon() {
        return bkTrucLon;
    }

    public void setBkTrucLon(double bkTrucLon) {
        this.bkTrucLon = bkTrucLon;
    }

    public double getBkTrucBe() {
        return bkTrucBe;
    }

    public void setBkTrucBe(double bkTrucBe) {
        this.bkTrucBe = bkTrucBe;
    }

    @Override
    public String toString() {
        return "Hinh Ellipse{" + "Dien tich = " + tinhDienTich() + ", Chu vi = " + tinhChuVi() + '}';
    }
    
    
}
