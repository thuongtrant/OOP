/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

/**
 *
 * @author ttthu
 */
public class Main {
    public static void main(String[] args) {
        TaiKhoan t1 = new TaiKhoan("A", 100);
        t1.tinhLai();
        t1.hienThi();
        TaiKhoanKyHan t2 = new TaiKhoanKyHan("B", 220, KyHan.MOT_TUAN);
        t2.tinhLai();
        t2.hienThi();
    }
}
