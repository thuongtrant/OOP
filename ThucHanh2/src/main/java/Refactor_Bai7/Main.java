/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Refactor_Bai7;

import java.io.FileNotFoundException;
import java.time.LocalDate;

/**
 *
 * @author ttthu
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        HocVien h1 = new HocVien("Tran", LocalDate.of(2004, 03, 23), "NamDinh");
        HocVien h2 = new HocVien("Nguyen", LocalDate.of(2000,03,12), "Binh Phuoc");
        QuanLyHocVien ql = new QuanLyHocVien();
        ql.themHV(h1,h2);
        //ql.themHV();
        ql.docDsHv();
        ql.nhapDiemDs();
        ql.hienThiDs();
        
        System.out.println("== SAP XEP ===");
        ql.sapXepDiem();
        ql.hienThiDs();
        System.out.println("=== HOC BONG ===");
        //ql.timHB().forEach(h -> h.hienThiDs());
    }
}
