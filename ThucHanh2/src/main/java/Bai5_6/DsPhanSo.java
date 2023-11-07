/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5_6;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ttthu
 */
public class DsPhanSo {
     private ArrayList<PhanSo> danhSachPhanSo;

     public DsPhanSo() {
        danhSachPhanSo = new ArrayList<>();
    }

    public void themPhanSo(PhanSo p){
        danhSachPhanSo.add(p);
    }
    
    public void hienThiDanhSach(){
        for(PhanSo ps : danhSachPhanSo)
            System.out.println(ps);
    }
    
    public void xoaPhanSo(PhanSo p){
        danhSachPhanSo.remove(p);
    }
    
    public void xoaPhanSo(int tuSo, int mauSo){
        PhanSo ps = new PhanSo(tuSo,mauSo);
        danhSachPhanSo.remove(ps);
    }
    
    public PhanSo tinhTongPS(){
        PhanSo tong = new PhanSo();
        for(PhanSo ps: danhSachPhanSo)
            tong = tong.congPS(ps);
        
        tong.rutGon();
        return tong;
    }
    
    public PhanSo timMaxPS(){
        PhanSo maxPS = danhSachPhanSo.get(0);
        for(PhanSo ps: danhSachPhanSo)
            if(ps.lonHon(maxPS))
                maxPS = ps;
        
        return maxPS;
    }
    
      public PhanSo timMinPS(){
        PhanSo minPS = danhSachPhanSo.get(0);
        for(PhanSo ps: danhSachPhanSo)
            if(ps.nhoHon(minPS))
                minPS = ps;
        
        return minPS;
    }
      
     public void sapXepDanhSach() {
        Collections.sort(danhSachPhanSo, (ps1, ps2) -> {
            float value1 = (float) ps1.getTuSo() / ps1.getMauSo();
            float value2 = (float) ps2.getTuSo() / ps2.getMauSo();
            return Float.compare(value1, value2);
        });
    }
}
