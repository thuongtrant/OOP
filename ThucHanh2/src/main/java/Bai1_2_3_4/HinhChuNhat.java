/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_2_3_4;

/**
 *
 * @author ttthu
 */
public class HinhChuNhat {
    private Diem trenTrai;
    private Diem duoiPhai;

    public HinhChuNhat(Diem trenTrai, Diem duoiPhai) throws Exception {
        if (duoiPhai.getX() > trenTrai.getX() && duoiPhai.getY() < trenTrai.getY()) {

            this.trenTrai = trenTrai;
            this.duoiPhai = duoiPhai;
        } else {
            throw new Exception("Invalid input");
        }
    }

    public Diem getToaDoTrai() {
        return trenTrai;
    }

    public void setToaDoTrai(Diem toaDoTrai) {
        this.trenTrai = toaDoTrai;
    }

    public Diem getToaDoPhai() {
        return duoiPhai;
    }

    public void setToaDoPhai(Diem toaDoPhai) {
        this.duoiPhai = toaDoPhai;
    }
    public double tinhDienTich(){
        double chieuDai = Math.abs(trenTrai.getX() -  duoiPhai.getX());
        double chieuRong = Math.abs(trenTrai.getY() -  duoiPhai.getY());
        return chieuDai*chieuRong;
    }
    public double tinhChuVi(){
        double chieuDai = Math.abs(trenTrai.getX() -  duoiPhai.getX());
        double chieuRong = Math.abs(trenTrai.getY() -  duoiPhai.getY());
        return (chieuDai+chieuRong)*2;
    }
    public void hienThiThongTin(){
        System.out.println("Diem tren trai (" + trenTrai.getX() + ", " + trenTrai.getY() + ")");
        System.out.println("Diem tren phai (" + duoiPhai.getX() + ", " + duoiPhai.getY() + ")");
        System.out.println("S =  " + tinhDienTich());
        System.out.println("C = " + tinhChuVi());
    
    }
}
