/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ttthu
 */
public class Main {

    public static void main(String[] args) {
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
            switch (luaChon) {
                case 1:
                    System.out.print("Nhập mã sản phẩm: ");
                    String maSanPham = scan.next();
                    System.out.print("Nhập tên sản phẩm: ");
                    String tenSanPham = scan.next();
                    System.out.print("Nhập mô tả sản phẩm: ");
                    String moTaSanPham = scan.next();
                    System.out.print("Nhập nhà sản xuất: ");
                    String nhaSanXuat = scan.next();
                    System.out.print("Nhập giá bán: ");
                    double giaBan = scan.nextDouble();

                    System.out.println("Chọn loại sản phẩm:");
                    System.out.println("1. Sách");
                    System.out.println("2. Băng đĩa");
                    System.out.print("Nhập lựa chọn của bạn: ");
                    int loaiSanPham = scan.nextInt();
                    SanPham sanPham;
                    if (loaiSanPham == 1) {
                        System.out.print("Nhập số trang của sách: ");
                        int soTrang = scan.nextInt();
                        sanPham = new Sach(maSanPham, tenSanPham, moTaSanPham, nhaSanXuat, giaBan, soTrang);
                    } else if (loaiSanPham == 2) {
                        System.out.print("Nhập độ dài phát của băng đĩa: ");
                        int doDaiPhat = scan.nextInt();
                        sanPham = new BangDia(maSanPham, tenSanPham, moTaSanPham, nhaSanXuat, giaBan, doDaiPhat);
                    } else {
                        System.out.println("Lựa chọn không hợp lệ. Không thể thêm sản phẩm.");
                        continue;
                    }

                    quanLySanPham.themSanPham(sanPham);
                    System.out.println("Sản phẩm đã được thêm thành công.");
                    break;

                case 2:
                    // Xoá sản phẩm
                    System.out.print("Nhập mã sản phẩm hoặc tên sản phẩm cần xoá: ");
                    String tuKhoaXoa = scan.next();
                    quanLySanPham.xoaSanPham(tuKhoaXoa);
                    System.out.println("Sản phẩm đã được xoá thành công.");
                    break;
                case 3:
                    // Cập nhật sản phẩm
                    System.out.print("Nhập mã sản phẩm cần cập nhật: ");
                    String maSanPhamCapNhat = scan.next();
                    System.out.print("Nhập tên mới: ");
                    String tenMoi = scan.next();
                    System.out.print("Nhập mô tả mới: ");
                    String moTaMoi = scan.next();
                    System.out.print("Nhập giá mới: ");
                    double giaMoi = scan.nextDouble();
                    quanLySanPham.capNhatSanPham(maSanPhamCapNhat, tenMoi, moTaMoi, giaMoi);
                    System.out.println("Sản phẩm đã được cập nhật thành công.");
                    break;
               
                    
                    
            }
        }while(luaChon != 7);
    }

}
