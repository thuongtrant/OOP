/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5_6;

/**
 *
 * @author ttthu
 */
public class Main {
    public static void main(String[] args) {
       PhanSo[] mangPhanSo = new PhanSo[3];
       mangPhanSo[0] = new PhanSo(1,2);
       mangPhanSo[1] = new PhanSo(3,4);
       mangPhanSo[2] = new PhanSo(2,5);
       
        System.out.println("Cac phan so trong mang");
        for(PhanSo ps : mangPhanSo)
            System.out.println(ps);
        
        PhanSo tong = new PhanSo();
        for(PhanSo ps : mangPhanSo)
            tong = tong.congPS(ps);
        
        System.out.println("Tong cac phan so trong mang = " + tong);
        
        PhanSo maxPS = mangPhanSo[0];
        for(PhanSo ps : mangPhanSo)
            if(ps.lonHon(maxPS))
                maxPS = ps;
        
        System.out.println("Phan so lon nhat trong mang la: " + maxPS);
                
        
        
        DsPhanSo dsPhanSo = new DsPhanSo();
        dsPhanSo.themPhanSo(new PhanSo(1,2));
        dsPhanSo.themPhanSo(new PhanSo(3,4));
        dsPhanSo.themPhanSo(new PhanSo(2,5));
        
        System.out.println("Danh sach phan so");
        dsPhanSo.hienThiDanhSach();
        
        System.out.println("Tong cac phan tu trong danh sach " + dsPhanSo.tinhTongPS());
        
        System.out.println("Phan so lon nhat trong danh sach " + dsPhanSo.timMaxPS());
        
        System.out.println("Phan so nho nhat trong danh sach " + dsPhanSo.timMinPS());
        
        dsPhanSo.sapXepDanhSach();
        System.out.println("Danh sach phan so sau khi sap xep");
        dsPhanSo.hienThiDanhSach();
        
    }
}
