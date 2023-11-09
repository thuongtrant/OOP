/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ttthu
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        DanhSachHV danhSachHV = new DanhSachHV();

        try (Scanner scan = new Scanner(new File("HocVien.txt"))) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            while (scan.hasNextLine()) {
                String hoTen = scan.nextLine();
                String queQuan = scan.nextLine();
                Date ngaySinh = dateFormat.parse(scan.nextLine());

                HocVien hv = new HocVien(hoTen, queQuan, ngaySinh);
                danhSachHV.themHV(hv);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        danhSachHV.nhapDiem(1, 9.0, 8.5, 9.5);
        danhSachHV.nhapDiem(2, 8.5, 7.0, 8.0);
        danhSachHV.nhapDiem(3, 7.0, 6.5, 7.5);

        // Hiển thị danh sách học viên
        danhSachHV.hienThiDS();
        HocVien hocVien1 = danhSachHV.timKiemHV(1);
        if (hocVien1 != null) {
            System.out.println(hocVien1.toString());
        }

        HocVien hocVien2 = danhSachHV.timKiemHV("Nguyen Van B");
        if (hocVien2 != null) {
            System.out.println(hocVien2.toString());
        }

        HocVien hocVien3 = danhSachHV.timKiemTheoQueQuan("Ha Noi");
        if (hocVien3 != null) {
            System.out.println(hocVien3.toString());
        }

        // Sắp xếp danh sách học viên theo điểm
        danhSachHV.sapXepTheoDiem();
        System.out.println("Danh sách học viên sau khi sắp xếp theo điểm:");
        danhSachHV.hienThiDS();

        // Xuất danh sách học viên có học bổng ra tập tin hocbong.txt
        danhSachHV.dsDatHocBong();

        // Thống kê độ tuổi của học viên
        danhSachHV.thongKeDoTuoi();
    }
}
