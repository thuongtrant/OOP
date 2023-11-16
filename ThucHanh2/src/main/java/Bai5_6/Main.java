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
            ps.hienThiPS();
        
        PhanSo tong = new PhanSo();
        for(PhanSo ps : mangPhanSo)
            tong = tong.congPS(ps);
        
        System.out.println("Tong cac phan so trong mang = ");
        tong.rutGon().hienThiPS();
        
        PhanSo maxPS = mangPhanSo[0];
        for(int i = 1; i < mangPhanSo.length; i++)
            if(maxPS.soSanhPS(mangPhanSo[i]) == -1)
                maxPS = mangPhanSo[i];
        
        System.out.println("Phan so lon nhat trong mang la: ");
        maxPS.hienThiPS();
                
        
        
        DsPhanSo dsPhanSo = new DsPhanSo();
        dsPhanSo.themPhanSo(new PhanSo(1,2));
        dsPhanSo.themPhanSo(new PhanSo(3,4));
        dsPhanSo.themPhanSo(new PhanSo(2,5));
        
        System.out.println("Danh sach phan so");
        dsPhanSo.hienThiDanhSach();
        
        System.out.println("Tong cac phan tu trong danh sach " );
        dsPhanSo.tinhTongPS().hienThiPS();
        
        System.out.println("Phan so lon nhat trong danh sach ");
        dsPhanSo.timMax().hienThiPS();
        
        System.out.println("Phan so nho nhat trong danh sach ");
        dsPhanSo.timMin().hienThiPS();
        
        dsPhanSo.sapXepDanhSach();
        System.out.println("Danh sach phan so sau khi sap xep");
        dsPhanSo.hienThiDanhSach();
        
    }
}
