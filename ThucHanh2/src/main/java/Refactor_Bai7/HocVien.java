/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Refactor_Bai7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.DoubleStream;

/**
 *
 * @author ttthu
 */
public class HocVien {
    private static int dem = 0;
    private int maHV = dem++;
    private String tenHV;
    private LocalDate ngaySinhHV;
    private String queHV;
    private double[] diemHV;

    public HocVien() {
    }

    public HocVien(String tenHV, LocalDate ngaySinhHV, String queHV) {
        this.tenHV = tenHV;
        this.ngaySinhHV = ngaySinhHV;
        this.queHV = queHV;
    }
    
     public HocVien(String tenHV, String ngaySinhHV, String queHV) {
        this.tenHV = tenHV;
        this.ngaySinhHV = LocalDate.parse(ngaySinhHV, DateTimeFormatter.ofPattern(CauHinh.DATE_PATTER));
        this.queHV = queHV;
    }
    
    public void nhap1Hv(){
        System.out.println("Ten: ");
        this.tenHV = CauHinh.sc.nextLine();
        System.out.println("Ngay sinh: ");
        String ngaySinhHV = CauHinh.sc.nextLine();
        this.ngaySinhHV = LocalDate.parse(ngaySinhHV, DateTimeFormatter.ofPattern(CauHinh.DATE_PATTER));
        System.out.println("Que Quan: ");
        this.queHV = CauHinh.sc.nextLine();
    }
    
    public void xuat1Hv() {
        System.out.printf("Ma: = %s\n", this.maHV);
        System.out.printf("Ho va Ten: = %s\n", this.tenHV);
        System.out.printf("Que Quan: = %s\n", this.queHV);
        System.out.printf("Ngay Sinh: = %s\n", this.ngaySinhHV.format(DateTimeFormatter.ofPattern(CauHinh.DATE_PATTER)));
        if(this.diemHV != null){
            for(double x : this.diemHV){
                System.out.printf("%.1f\t",x);
            }
            System.out.printf("Diem trung binh: %.1f\t", this.tinhDiemTB());
        }
        
    }
    
    public void nhapDiemHv(){
        this.diemHV = new double[CauHinh.SO_MON];
        for(int i = 0; i < CauHinh.SO_MON; i++){
            System.out.printf("Mon thu %d = ", i+1);
            this.diemHV[i] = Double.parseDouble(CauHinh.sc.nextLine());
        }
    
    }

    public double tinhDiemTB(){
       return DoubleStream.of(this.diemHV).average().getAsDouble();
    }
    
    public boolean isHocBong(){
        for(double x : this.diemHV){
            if(x < 5)
                return false;
        }
        return this.tinhDiemTB() >= 8.0;
    }
    
    public int soSanhDiem(HocVien h){
        double tb1 = this.tinhDiemTB();
        double tb2 = h.tinhDiemTB();
        if(tb1 > tb2)
            return 1;
        else if(tb1 < tb2)
            return -1;
        return 0;
    }
    
   
    
    public static int getDem() {
        return dem;
    }

    public static void setDem(int dem) {
        HocVien.dem = dem;
    }

    public int getMaHV() {
        return maHV;
    }

    public void setMaHV(int maHV) {
        this.maHV = maHV;
    }

    public String getTenHV() {
        return tenHV;
    }

    public void setTenHV(String tenHV) {
        this.tenHV = tenHV;
    }

    public LocalDate getNgaySinhHV() {
        return ngaySinhHV;
    }

    public void setNgaySinhHV(LocalDate ngaySinhHV) {
        this.ngaySinhHV = ngaySinhHV;
    }

    public String getQueHV() {
        return queHV;
    }

    public void setQueHV(String queHV) {
        this.queHV = queHV;
    }

    public double[] getDiemHV() {
        return diemHV;
    }

    public void setDiemHV(double[] diemHV) {
        this.diemHV = diemHV;
    }
}
