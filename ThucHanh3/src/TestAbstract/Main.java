/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestAbstract;

/**
 *
 * @author ttthu
 */
public class Main {
    public static void main(String[] args) {
        NhanVien nv = new NhanVienA();
        NhanVien nvb = new NhanVienB();
        NhanVien nvd = new NhanVienD(3,5);
        System.out.println("Nhan Vien A: " + nv.tinhLuong());
        System.out.println("Nhan vien B: " + nvb.tinhLuong());
        System.out.println("Nhan vien D: " + nvd.tinhLuong());
    }
}
