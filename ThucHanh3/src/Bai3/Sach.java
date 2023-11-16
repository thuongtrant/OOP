/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author ttthu
 */
public class Sach extends SanPham {
    private int soTrang;

    public Sach(String maSanPham, String tenSanPham, String moTaSanPham, String nhaSanXuat, double giaSanPham, int soTrang) {
        super(maSanPham, tenSanPham, moTaSanPham, nhaSanXuat, giaSanPham);
        this.soTrang = soTrang;
    }
    
    @Override
    public String toString(){
        return super.toString() + "So trang: " + soTrang;
    }
}
