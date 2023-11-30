/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_2;

/**
 *
 * @author ttthu
 */
public class Ellipse extends Hinh{
    private double bkTrucLon;
    private double bkTrucBe;

    public Ellipse(double bkTrucLon, double bkTrucBe) {
        this.bkTrucLon = bkTrucLon;
        this.bkTrucBe = bkTrucBe;
    }
    @Override
    public double tinhDienTich(){
        return Math.PI*bkTrucBe*bkTrucLon;
    }
    
    public double tinhChuVi(){
        return Math.PI*2*Math.sqrt(Math.pow(bkTrucBe, 2)+Math.pow(bkTrucLon, 2)/2);
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
    
    public String layTen(){
        return "Hinh Ellipse";
    }
    
    @Override
    public void hienThi(){  
        System.out.printf("%s\nDien tich: %.1f\n", this.layTen(), this.tinhDienTich());
    }
}
