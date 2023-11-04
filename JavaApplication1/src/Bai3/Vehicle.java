/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;
import java.util.Scanner;
/**
 *
 * @author ttthu
 */
public class Vehicle {
    private String chuXe;
    private String Hangxe;
    private double giaTri;
    private int dungTich;
    Scanner scan = new Scanner(System.in);

    public Vehicle() {
    }

    public Vehicle(String chuXe, String Hangxe, double giaTri, int dungTich) {
        this.chuXe = chuXe;
        this.Hangxe = Hangxe;
        this.giaTri = giaTri;
        this.dungTich = dungTich;
    }

    public String getChuXe() {
        return chuXe;
    }

    public void setChuXe(String chuXe) {
        this.chuXe = chuXe;
    }

    public String getHangxe() {
        return Hangxe;
    }

    public void setHangxe(String Hangxe) {
        this.Hangxe = Hangxe;
    }

    public double getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(double giaTri) {
        this.giaTri = giaTri;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }
    public void nhapDuLieu() {
        System.out.println("Ten chu xe: ");
        this.chuXe = scan.nextLine();
        System.out.println("Ten hang xe: ");
        this.Hangxe = scan.nextLine();
        System.out.println("Gia tri: ");
        this.giaTri = scan.nextDouble();
        System.out.println("Dung tich: ");
        this.dungTich = scan.nextInt();
    }
    public double tinhThue() {
        double gtri = getGiaTri();
        double dtich = getDungTich();
        if (dtich < 100) {
            return gtri / 100;
        } else if (dtich >= 100 && dtich <= 200) {
            return gtri / 100 * 3;
        } else {
            return gtri / 100 * 5;
        }
    }
   
        @Override
        public String toString() {
        String cx = getChuXe();
        String hx = getHangxe();
        double gt = getGiaTri();
        int dt = getDungTich();
        double thue = tinhThue();

        String res = String.format("%-20s%-20s%-15.3f%-15d%-15.3f\n", cx, hx, gt, dt, thue);

        return res;
    }
}
