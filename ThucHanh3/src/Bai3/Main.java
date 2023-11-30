/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import static Bai3.SanPham.scan;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ttthu
 */
public class Main {

    public static void main(String[] args) {
//        QuanLySanPham ql = new QuanLySanPham();
//        try (Scanner scan = new Scanner(System.in)) {
//            SanPham sp1 = new Sach();
//            sp1.nhap();
//            SanPham sp2 = new BangDia();
//            sp2.nhap();
//            ql.themSanPham(sp1);
//            ql.themSanPham(sp2);
//            ql.hienThi();
//            VanPhongPham vp1 = new VanPhongPham();
//            vp1.nhap();
//            ql.themVanPhongPham(vp1);
//        }

        Scanner scan = new Scanner(System.in);
        QuanLySanPham quanLySanPham = new QuanLySanPham();

        int luaChon;
        do {
            System.out.println("MENU");
            System.out.println("1. Them san pham");
            System.out.println("2. Xoa san pham");
            System.out.println("3. Cap nhat san pham");
            System.out.println("4. Tim kiem san pham");
            System.out.println("5. Sap xep san pham theo gia giam");
            System.out.println("6. Xem danh sach san pham");
            System.out.println("7. Thoat");
            luaChon = scan.nextInt();
            scan.nextLine();
            switch (luaChon) {
                case 1:

                    System.out.println("Chon loai san pham:");
                    System.out.println("1. Sach");
                    System.out.println("2. Bang dia");
                    System.out.print("Nhap lua chon cua ban: ");
                    int loaiSanPham = scan.nextInt();
                    SanPham sanPham;
                    if (loaiSanPham == 1) {
                        SanPham s = new Sach();
                        s.nhap();
                        quanLySanPham.themSanPham(s);
                        System.out.println("San pham duoc them thanh cong.");
                    } else if (loaiSanPham == 2) {
                        SanPham b = new BangDia();
                        b.nhap();
                        quanLySanPham.themSanPham(b);
                        System.out.println("San pham duoc them thanh cong.");
                    } else {
                        System.out.println("Lua chon khong hop le. Vui long nhap lai");
                        continue;
                    }

                    break;

                case 2:
                    // Xoá sản phẩm
                    System.out.print("Nhap ma san pham hoac ten san pham can xoa: ");
                    String tuKhoaXoa = scan.next();
                    quanLySanPham.xoaSanPham(tuKhoaXoa);
                    System.out.println("San pham duoc xoa thanh cong.");
                    break;
                case 3:
                    // Cập nhật sản phẩm
                    System.out.println("");
                    System.out.println("Ma: ");
                    String maSanPham = scan.nextLine();
                    System.out.println("Ten");
                    String tenSanPham = scan.nextLine();
                    System.out.println("Nha san xuat: ");
                    String nhaSanXuat = scan.nextLine();
                    System.out.println("Gia ban:");
                    double giaSanPham = scan.nextDouble();
                    quanLySanPham.capNhatSanPham(maSanPham, tenSanPham, nhaSanXuat, giaSanPham);
                    break;
                case 4:
                     //Tìm kiếm sản phẩm
                    System.out.print("Nhap tu khoa can tim kiem: ");
                    String tuKhoa = scan.nextLine();
                    quanLySanPham.timKiem(tuKhoa).forEach(h -> h.xuat());
                    break;
                case 5:
                    // Sắp xếp sản phẩm
                    quanLySanPham.sapXepSanPham();
                    System.out.println("Danh sach san pham sau khi sap xep:");
                    quanLySanPham.hienThi();
                    break;
                case 6:
                    quanLySanPham.hienThi();
                    break;
                case 7:
                    break;
                    
            }
        } while (luaChon != 7);
    }

}
