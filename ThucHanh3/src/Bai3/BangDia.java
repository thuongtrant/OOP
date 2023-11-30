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

    public BangDia() {
        super(null, null, null, null, 0);
    }

    public BangDia(String maSanPham, String tenSanPham, String moTaSanPham, String nhaSanXuat, double giaSanPham, int thoiGianPhat) {
        super(maSanPham, tenSanPham, moTaSanPham, nhaSanXuat, giaSanPham);
        this.thoiGianPhat = thoiGianPhat;
    }
    
   @Override
     public void nhap(){
       super.nhap();
        System.out.println("Thoi gian phat: ");
        String thoiGianPhat = scan.nextLine();
        this.thoiGianPhat = Integer.parseInt(thoiGianPhat);
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Thoi gian phat: " + this.thoiGianPhat);
    }
}
