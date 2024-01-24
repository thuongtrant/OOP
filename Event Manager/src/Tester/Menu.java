/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tester;

/**
 *
 * @author ttthu
 */
import Paymentt.Bill;
import Booking.*;
import Control.*;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Booking booking = new Booking();
        BookingManagement listBooking = new BookingManagement();
        int luaChon;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Dat tiec");
            System.out.println("2. Sap xep danh sach thue sanh");
            System.out.println("3. Sap xep danh sach thue sanh (Tra cuu theo nam)");
            System.out.println("4. Bao cao doanh thu theo thang");
            System.out.println("5. Bao cao doanh thu theo quy");
            System.out.println("6. Ghi file");
            System.out.println("7. Doc file");
            System.out.println("8. Xuat danh sach da dat");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon :");
            while (true) {
                try {
                    luaChon = Configuration.sc.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Hay nhap tu 0-7");
                }
            }
            Configuration.sc.nextLine(); 

            switch (luaChon) {
                case 1:
                    listBooking.add();
                    break;
                case 2:
                    System.out.println("\n ::: SAP XEP DANH SACH THUE SANH :::");
                    listBooking.sortHallByRentalCount();
                    break;
                case 3:
                    System.out.println("Nhap nam muon tra cuu: ");
                    int year = Configuration.sc.nextInt();
                    listBooking.sortHallByRentalCount(year);
                    break;
                case 4:
                    System.out.println("\n ::: TONG KE THEO THANG :::");
                    listBooking.reportRevenueByMonth();
                    break;
                case 5:
                    System.out.println("\n ::: THONG KE THEO QUY ::: ");
                    listBooking.reportRevenueByQuarter();
                    break;
                case 6:
                    listBooking.writeFile("src/Booking/listBooking");
                    System.out.println("Ghi file thanh cong");
                    break;
                case 7:
                    listBooking.readFile("src/Booking/listBooking");
                    break;
                case 8:
                    System.out.println("\n ::: DANH SACH BOOKING ::: ");
                    listBooking.printList();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh. Cam on ban da su dung");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!!!");
            }
        } while (luaChon != 0);
    }

}
