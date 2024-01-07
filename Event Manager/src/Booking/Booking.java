/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Booking;

import Paymentt.Bill;
import Hall.WeddingHall;
import Hall.WeddingHallManagement;
import Menu.MenuManagement;
import Service.ServiceManagement;
import Control.Configuration;
import MyException.DateFormatException;
import Person.*;
import Service.ServiceManagement;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ttthu
 */
public class Booking implements Serializable {

    private LocalDate dateRental;
    private String nameEvent;
//    private CustomerManagement listCustomer = new CustomerManagement();
//    private ServiceManagement listService = new ServiceManagement();
//    private MenuManagement listMenu = new MenuManagement();
//    private WeddingHallManagement listHall = new WeddingHallManagement();
//    private Customer customer = new Customer();
//    private Bill b = new Bill(this);
    private CustomerManagement listCustomer ;
    private ServiceManagement listService; 
    private MenuManagement listMenu ;
    private WeddingHallManagement listHall ;
    private Customer customer ;
    private Bill b ;
        private final String re = "\\d{2}/\\d{2}/\\d{4}";


    public Booking() {
        this.nameEvent = nameEvent;
        listCustomer = new CustomerManagement();
        listService = new ServiceManagement();
        listMenu = new MenuManagement();
        listHall = new WeddingHallManagement();
        customer = new Customer();
        b = new Bill(this);
    }

    public void input() {
        System.out.println("Vui long nhap thong tin cua ban: ");
        listCustomer.add();

        System.out.println("Ten bua tiec: ");
        this.nameEvent = Configuration.sc.nextLine();

        System.out.println("Nhap thong tin sanh thue: ");
        this.listHall.add();

        //Nhập thông tin danh sách menu
        this.listMenu.add();

        // Nhập thông tin danh sách dịch vụ
        this.listService.add();

    }

    public void print() {
        listCustomer.prinList();
        System.out.println("Name event: " + this.nameEvent);
        listHall.printList();
        listMenu.printList();
        listService.printList();
        System.out.println("Gia tong menu");
        System.out.println(listMenu.priceSum());
        System.out.println("Gia tong dich vu");
        System.out.println(listService.priceSum());
        System.out.println("Gia tong: " + totalRentalPrice());
    }

    public void printSortedHallsByBookings() {
        listHall.countAndSort();
    }

    public double totalRentalPrice() {
        return listMenu.priceSum() + listHall.priceSum() + listService.priceSum();
    }
    
    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public CustomerManagement getListCustomer() {
        return listCustomer;
    }

    public void setListCustomer(CustomerManagement listCustomer) {
        this.listCustomer = listCustomer;
    }

    public ServiceManagement getListService() {
        return listService;
    }

    public void setListService(ServiceManagement listService) {
        this.listService = listService;
    }

    public MenuManagement getListMenu() {
        return listMenu;
    }

    public void setListMenu(MenuManagement listMenu) {
        this.listMenu = listMenu;
    }

    public WeddingHallManagement getListHall() {
        return listHall;
    }

    public void setListHall(WeddingHallManagement listHall) {
        this.listHall = listHall;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer c) {
        this.customer = c;
    }

    public LocalDate getDateRental() {
        return dateRental;
    }

    public String dateBooking() {
        String date = this.dateRental.format(DateTimeFormatter.ofPattern(Configuration.DATE_PATTER));
        return date;
    }

    public void setDateRental(LocalDate dateRental) {
        this.dateRental = dateRental;
    }

    public void thueSanh() {
        // Nhập thông tin khách hàng
        customer.input();
        System.out.println("Ten bua tiec: ");
        this.nameEvent = Configuration.sc.nextLine();
        while (true) {
            try {
                // Nhập ngày đặt thuê
                System.out.println("Ngay thue (dd/mm/yyyy): ");
                String dateRental = Configuration.sc.nextLine();
                if (dateRental.matches(re)) {
                    this.dateRental = LocalDate.parse(dateRental, DateTimeFormatter.ofPattern(Configuration.DATE_PATTER));
                    break;
                } else {
                    throw new DateFormatException();
                }
            } catch (DateFormatException d) {
                System.out.println("Vui long nhap dung dinh dang");
            } catch (Exception e) {
                System.out.println("Vui long nhap dung dinh dang");
            }
        }
        int luaChon;
        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Dat sanh cuoi");
            System.out.println("2. Dat menu");
            System.out.println("3. Dat dich vu");
            System.out.println("4. Xuat hoa don thanh toan");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon :");
            while (true) {
                try {
                    luaChon = Configuration.sc.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Hay nhap tu (0-7)");
                }
            }
            Configuration.sc.nextLine(); // Đọc bỏ ký tự Enter

            switch (luaChon) {
                case 1:
                    // Gọi các phương thức quản lý sảnh cưới
                    quanLySanhCuoiMenu(listHall);
                    break;
                case 2:
                    // Gọi các phương thức quản lý dịch vụ
                    quanLyMenu(listMenu);
                    break;
                case 3:
                    // Gọi các phương thức quản lý thực đơn
                    quanLyDichVu(listService);
                    break;
                case 4:
                    // Gọi phương thức cho thuê sảnh cưới
                    b.payment();
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh. Cam on ban da su dung.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai!.");
            }
        } while (luaChon != 0);
    }

    private static void quanLySanhCuoiMenu(WeddingHallManagement quanLyNhaHang) {
        boolean exitSubMenu = false;
        while (!exitSubMenu) {
            System.out.println("::: Menu Hall :::");
            System.out.println("1. Them sanh ");
            System.out.println("2. Cap nhat sanh");
            System.out.println("3. Xoa sanh");
            System.out.println("4. Tra cuu sanh theo ten");
            System.out.println("5. Tra cuu sanh theo suc chua");
            System.out.println("6. Tra cuu sanh theo vi tri sanh");
            System.out.println("7. Ghi file");
            System.out.println("8. Doc file");
            System.out.println("9. Xem danh sach sanh");
            System.out.println("Quay lai menu chinh");
            System.out.println("Moi ban chon (0-9)");
            int choose = Configuration.sc.nextInt();
            Configuration.sc.nextLine();
            switch (choose) {
                case 0:
                    exitSubMenu = true;
                    break;
                case 1:
                    quanLyNhaHang.add();
                    break;
                case 2:
                    System.out.println("Nhap ID sanh muon cap nhat");
                    String upDate = Configuration.sc.nextLine();
                    quanLyNhaHang.upDate(upDate);
                    break;
                case 3:
                    System.out.println("Nhap ten sanh muon xoa");
                    String remove = Configuration.sc.nextLine().toUpperCase();
                    quanLyNhaHang.remove(remove);
                    break;
                case 4:
                    System.out.println("Nhap ten sanh muon tim");
                    String findName = Configuration.sc.nextLine().toUpperCase();
                    quanLyNhaHang.findHall(findName).forEach(h -> h.print());
                    break;
                case 5:
                    System.out.println("Nhap suc chua cua sanh muon tim");
                    int capacity = Configuration.sc.nextInt();
                    quanLyNhaHang.findHall(capacity).forEach(h -> h.print());
                    break;
                case 6:
                    System.out.println("Tra cuu sanh theo vi tri");
                    int floor = Configuration.sc.nextInt();
                    quanLyNhaHang.findHallByFloor(floor).forEach(h -> h.print());
                    break;
                case 7:
                    System.out.println("Ghi file");
                    quanLyNhaHang.writeFile("src/Hall/hall");
                    break;
                case 8:
                    System.out.println("Doc file");
                    quanLyNhaHang.readFile("src/Hall/hall");
                    break;
                case 9:
                    quanLyNhaHang.printList();
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai!.");
            }
        }
    }

    private static void quanLyMenu(MenuManagement quanLyMenu) {
        boolean exitSubMenu = false;
        while (!exitSubMenu) {
            System.out.println("::: Menu Food :::");
            System.out.println("1. Them menu ");
            System.out.println("2. Cap nhat menu");
            System.out.println("3. Xoa menu");
            System.out.println("4. Tra cuu menu theo ten");
            System.out.println("5. Ghi file");
            System.out.println("6. Doc file");
            System.out.println("7. Xem danh sach menu");
            System.out.println("0. Quay lai menu chinh");
            System.out.println("Moi ban chon (0-7)");
            int choose = Configuration.sc.nextInt();
            Configuration.sc.nextLine();
            switch (choose) {
                case 0:
                    exitSubMenu = true;
                    break;
                case 1:
                    quanLyMenu.add();
                    break;
                case 2:
                    System.out.println("Nhap ten menu muon cap nhat");
                    String upDate = Configuration.sc.nextLine();
                    quanLyMenu.upDate(upDate);
                    break;
                case 3:
                    System.out.println("Nhap ten mon an/thuc uong muon xoa");
                    String remove = Configuration.sc.nextLine();
                    quanLyMenu.remove(remove);
                    break;
                case 4:
                    System.out.println("Nhap ten mon an/thuc uong muon tim");
                    String findName = Configuration.sc.nextLine();
                    quanLyMenu.findMenu(findName).forEach(h -> h.print());
                    break;
                case 5:
                    System.out.println("Ghi file");
                    quanLyMenu.writeFile("src/Menu/menu");
                    break;
                case 6:
                    System.out.println("Doc file");
                    quanLyMenu.readFile("src/Menu/menu");
                    break;
                case 7:
                    quanLyMenu.printList();

            }
        }
    }

    private static void quanLyDichVu(ServiceManagement quanLyDichVu) {
        boolean exitSubMenu = false;
        while (!exitSubMenu) {
            System.out.println(" ::: Menu Service ::: ");
            System.out.println("1. Them dich vu ");
            System.out.println("2. Cap nhat dich vu");
            System.out.println("3. Xoa dich vu");
            System.out.println("4. Tra cuu dich vu theo ten");
            System.out.println("5. Ghi file");
            System.out.println("6. Doc file");
            System.out.println("7. Xem danh sach dich vu");
            System.out.println("0. Quay lai menu chinh");
            System.out.println("Moi ban chon (0-7)");
            int choose = Configuration.sc.nextInt();
            Configuration.sc.nextLine();
            switch (choose) {
                case 0:
                    exitSubMenu = true;
                    break;
                case 1:
                    quanLyDichVu.add();
                    break;
                case 2:
                    System.out.println("Nhap ten menu muon cap nhat");
                    String upDate = Configuration.sc.nextLine();
                    quanLyDichVu.upDate(upDate);
                    break;
                case 3:
                    System.out.println("Nhap ten dich vu muon xoa");
                    String remove = Configuration.sc.nextLine();
                    quanLyDichVu.remove(remove);
                    break;
                case 4:
                    System.out.println("Nhap ten dich vu muon tim");
                    String findName = Configuration.sc.nextLine();
                    quanLyDichVu.findService(findName).forEach(h -> h.print());
                    break;
                case 5:
                    System.out.println("Ghi file");
                    quanLyDichVu.writeFile("src/Service/service");
                    break;
                case 6:
                    System.out.println("Doc file");
                    quanLyDichVu.readFile("src/Service/service");
                    break;
                case 7:
                    quanLyDichVu.printList();

            }
        }
    }
}
