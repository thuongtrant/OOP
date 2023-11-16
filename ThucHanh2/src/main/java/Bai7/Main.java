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

        try (Scanner scan = new Scanner(new File("D:\\Users\\ttthu\\OneDrive\\Documents\\NetBeansProjects\\ThucHanh2\\src\\main\\java\\Bai7\\HocVien.txt"))) {
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
        danhSachHV.hienThiDS();

        System.out.println(":::::::::::::::::::::::::::");

        System.out.println("Sinh Vien Da Co Diem");

        danhSachHV.nhapDiem(0, 9.0, 8.5, 9.5);
        danhSachHV.nhapDiem(1, 8.5, 7.0, 8.0);

        danhSachHV.hienThiDS();

        System.out.println(":::::::::::::::::::::::::::");

        // Hiển thị danh sách học viên
        HocVien hocVien1 = danhSachHV.timKiemHV(1);
        if (hocVien1 != null) {
            System.out.println("Thay roi");
            System.out.println(hocVien1.toString());
        } else {
            System.out.println("Khong thay nha ");
        }

        HocVien hocVien2 = danhSachHV.timKiemHV("Nguyen Van A");
        if (hocVien2 != null) {
            System.out.println("Thay roi");
            System.out.println(hocVien2.toString());
        } else {
            System.out.println("Khong thay nha ");
        }

        HocVien hocVien3 = danhSachHV.timKiemTheoQueQuan("Ha Noi");
        if (hocVien3 != null) {
            System.out.println("Thay roi");
            System.out.println(hocVien3.toString());
        } else {
            System.out.println("Khong thay nha ");
        }

        System.out.println(":::::::::::::::::::::::::::");

        // Sắp xếp danh sách học viên theo điểm
        danhSachHV.sapXepTheoDiem();
        System.out.println("Danh sach hoc vien duoc sap xep theo diem:");
        danhSachHV.hienThiDS();

        System.out.println(":::::::::::::::::::::::::::");

        // Xuất danh sách học viên có học bổng ra tập tin hocbong.txt
        System.out.println("Danh sach hoc vien dat hoc bong");
        danhSachHV.dsDatHocBong();

        System.out.println(":::::::::::::::::::::::::::");

        System.out.println("Thong ke do tuoi hoc vien");
        // Thống kê độ tuổi của học viên
        danhSachHV.thongKeDoTuoi();
    }
}
