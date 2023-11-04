/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author ttthu
 */
public class HinhChuNhat {
    private Diem toaDoTrai;
    private Diem toaDoPhai;

    public HinhChuNhat(Diem toaDoTrai, Diem toaDoPhai) {
        this.toaDoTrai = toaDoTrai;
        this.toaDoPhai = toaDoPhai;
    }

    public Diem getToaDoTrai() {
        return toaDoTrai;
    }

    public void setToaDoTrai(Diem toaDoTrai) {
        this.toaDoTrai = toaDoTrai;
    }

    public Diem getToaDoPhai() {
        return toaDoPhai;
    }

    public void setToaDoPhai(Diem toaDoPhai) {
        this.toaDoPhai = toaDoPhai;
    }
    public double tinhDienTich(){
        double chieuDai = Math.abs(toaDoTrai.getX() -  toaDoPhai.getX());
        double chieuRong = Math.abs(toaDoTrai.getY() -  toaDoPhai.getY());
        return chieuDai*chieuRong;
    }
    public double tinhChuVi(){
        double chieuDai = Math.abs(toaDoTrai.getX() -  toaDoPhai.getX());
        double chieuRong = Math.abs(toaDoTrai.getY() -  toaDoPhai.getY());
        return (chieuDai+chieuRong)*2;
    }
    public void hienThiThongTin(){
        System.out.println("Diem tren trai " + toaDoTrai.getX() + ", " + toaDoTrai.getY());
        System.out.println("Diem tren phai " + toaDoPhai.getX() + ", " + toaDoPhai.getY());
        System.out.println("Diện tích: " + tinhDienTich());
        System.out.println("Chu vi: " + tinhChuVi());
    
    }
}
