/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author ttthu
 */
public class BangDia extends SanPham{
    private int thoiGianPhat;

    public BangDia(String maSanPham, String tenSanPham, String moTaSanPham, String nhaSanXuat, double giaSanPham, int thoiGianPhat) {
        super(maSanPham, tenSanPham, moTaSanPham, nhaSanXuat, giaSanPham);
        this.thoiGianPhat = thoiGianPhat;
    }
    
    @Override
    public String toString(){
        return super.toString() + "Thoi gian phat: " + thoiGianPhat;
    }
}
