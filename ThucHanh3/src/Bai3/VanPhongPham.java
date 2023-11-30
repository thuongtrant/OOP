/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author ttthu
 */
public class VanPhongPham extends SanPham{

    private String congDung;

    public VanPhongPham() {
        super(null, null, null, null, 0);
    }
    
    public VanPhongPham(String maSanPham, String tenSanPham, String moTaSanPham, String nhaSanXuat, double giaSanPham, String congDung) {
        super(maSanPham, tenSanPham, moTaSanPham, nhaSanXuat, giaSanPham);
        this.congDung = scan.nextLine();
    }
     @Override
     public void nhap(){
       super.nhap();
        System.out.println("Cong dung: ");
        String congDung = scan.nextLine();
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("So trang: " + this.congDung);
    }
   
}
