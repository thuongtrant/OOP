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
            System.out.println("===== MENU =====");
            System.out.println("1. Dat tiec");
            System.out.println("2. Sap xep danh sach thue sanh");
            System.out.println("3. Bao cao doanh thu theo thang");
            System.out.println("4. Bao cao doanh thu theo quy");
            System.out.println("5. Ghi file");
            System.out.println("6. Doc file");
            System.out.println("7. Xuat danh sach da dat");
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
            Configuration.sc.nextLine(); // Đọc bỏ ký tự Enter

            switch (luaChon) {
                case 1:
                    listBooking.add();
                    break;
                case 2:
                    listBooking.printRentalCount();
                    break;
                case 3:
                    listBooking.reportRevenue();
                    listBooking.printRevenueByMonth();
                    break;
                case 4:
                    listBooking.printRevenueByQuarter();
                    break;
                case 5:
                    listBooking.writeFile("src/Booking/listBooking");
                    break;
                case 6:
                    listBooking.readFile("src/Booking/listBooking");
                    break;
                case 7:
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
