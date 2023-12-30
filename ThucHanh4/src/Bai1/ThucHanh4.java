/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai1;

/**
 *
 * @author ttthu
 */
public class ThucHanh4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Hinh h1 = new HinhChuNhat("Chu nhat",4,2);
        Hinh h2 = new HinhVuong("Vuong",3);
        Hinh h3 = new TamGiac("Ttam giac",2, 3, 4);
        Hinh h4 = new TamGiacCan("Tam giac can", 3, 4);
        Hinh h5 = new TamGiacDeu("Tam giac deu",3);
        
        QuanLyHinh ds = new QuanLyHinh();
        ds.them(h1, h2, h3, h4, h5);
        ds.hienThi();
        System.out.println("----- Sap xep giam -----");
        ds.xepGiamDienTich();
        ds.hienThi();
        System.out.println("----- Sap xep tang -----");
        ds.xepTangTheoTen();
        ds.hienThi();
        System.out.println("----- Xoa -----");
        ds.xoa("Tam");
        ds.hienThi();
        System.out.println("----- Tim theo loai -----");
        ds.timTheoLoai("Bai1.HinhVuong").forEach(h -> System.out.println(h));
        System.out.println("----- Tim hinh -----");
        System.out.println(ds.timHinh(new HinhVuong("HV",3)));
        System.out.println("----- Trung binh dien tich -----");
        System.out.println(ds.tinhDtTb());
    }
    
}
