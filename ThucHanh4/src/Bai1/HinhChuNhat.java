/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author ttthu
 */
public class HinhChuNhat extends Hinh{
    private double chieuDai, chieuRong;

    public HinhChuNhat(String ten, double chieuDai, double chieuRong) {
        super(ten);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    double tinhDienTich() {
        return chieuDai * chieuRong;
    }

    @Override
    double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof HinhChuNhat){
            HinhChuNhat h = (HinhChuNhat) obj;
            return super.equals(obj) && this.chieuDai == h.chieuDai &&
                    this.chieuRong == h.chieuRong;
        }    
        return false;
    }
    
}
