/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ttthu
 */
public class QuanLyNhanVien {
    private List<NhanVien> ds ;

    public QuanLyNhanVien() {
        this.ds = new ArrayList<>();
    }
 
    public void themNV(NhanVien v){
        this.ds.add(v);
    }
    
    public void themNV(Scanner scan, String loaiNV){
        NhanVien nv = null;
        switch (loaiNV.toUpperCase()) {
            case "A":
                nv = new NhanVienA();
                break;
            case "B":
                nv = new NhanVienB();
                break;
            case "C":
                nv = new NhanVienC();
                break;
        }
        nv.nhapNV(scan);
        this.ds.add(nv);
    }
}
