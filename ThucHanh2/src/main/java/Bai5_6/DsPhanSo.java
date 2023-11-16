/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author ttthu
 */
public class DsPhanSo {
     private List<PhanSo> danhSachPhanSo = new ArrayList<>();


    public void themPhanSo(PhanSo p){
        danhSachPhanSo.add(p);
    }
    
    public void hienThiDanhSach(){
        for(PhanSo ps : danhSachPhanSo)
            ps.hienThiPS();   
    }
    
    public void xoaPhanSo(PhanSo p){
        danhSachPhanSo.remove(p);
    }
    
    public void xoaPhanSo(int tuSo, int mauSo){
        PhanSo ps = new PhanSo(tuSo,mauSo);
        this.danhSachPhanSo.removeIf(p -> p.soSanhPS(ps) == 0);
    }
    
    public PhanSo timMax(){
        return this.danhSachPhanSo.stream().max((a,b) -> a.soSanhPS(b)).get();    
    }
    public PhanSo timMin(){
        return this.danhSachPhanSo.stream().min((a,b) -> a.soSanhPS(b)).get();
    }
    public PhanSo tinhTongPS(){
        PhanSo tong = new PhanSo();
        for(PhanSo ps: danhSachPhanSo)
            tong = tong.congPS(ps);
        
        tong.rutGon();
        return tong;
    }
    
  
      
     public void sapXepDanhSach() {
    this.danhSachPhanSo.sort((a, b) -> a.soSanhPS(b));
    }
}
