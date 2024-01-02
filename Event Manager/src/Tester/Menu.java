/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tester;

/**
 *
 * @author ttthu
 */
import Control.Bill;
import Booking.*;
import Control.*;
import Hall.*;
import Menu.MenuManagement;
import Service.ServiceManagement;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Booking quanLyChoThue = new Booking();
        WeddingHallManagement quanLyNhaHang = new WeddingHallManagement();
        MenuManagement quanLyMenu = new MenuManagement();
        ServiceManagement quanLyDichVu = new ServiceManagement();
        BookingManagement booking = new BookingManagement();
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Quan ly sanh cuoi");
            System.out.println("2. Quan ly menu");
            System.out.println("3. Quan ly dich vu");
            System.out.println("4. Dat tiec");
            System.out.println("5. Sap xep theo danh sach sanh thue");
            System.out.println("6. Xuat hoa don thanh toan");
            System.out.println("7. Bao cao doanh thu");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon :");

            luaChon = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ ký tự Enter

            switch (luaChon) {
                case 1:
                    // Gọi các phương thức quản lý sảnh cưới
                    quanLySanhCuoiMenu(quanLyNhaHang);
                    break;
                case 2:
                    // Gọi các phương thức quản lý dịch vụ
                    quanLyMenu(quanLyMenu);
                    break;
                case 3:
                    // Gọi các phương thức quản lý thực đơn
                    quanLyDichVu(quanLyDichVu);
                    break;
                case 4:
                    // Gọi phương thức cho thuê sảnh cưới
                    thueSanhCuoi(booking);
                    break;
                case 5:
                    // Gọi phương thức sắp xếp danh sách sảnh
                    quanLyNhaHang.sortHallByRentalCount();
                    break;
                case 6:
                    // Gọi phương thức xuất hoá đơn thanh toán
                    xuatHoaDonThanhToanMenu(quanLyChoThue);
                    break;
//                case 7:
//                    // Gọi phương thức báo cáo doanh thu
//                    baoCaoDoanhThuMenu(quanLyNhaHang, scanner);
//                    break;
                case 0:
                    System.out.println("Thoát chương trình. Cảm ơn bạn đã sử dụng!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (luaChon != 0);
    }

    // Các phương thức menu con có thể thêm tùy theo yêu cầu của bạn
    private static void quanLySanhCuoiMenu(WeddingHallManagement quanLyNhaHang) {
        boolean exitSubMenu = false;
        while (!exitSubMenu) {
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
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private static void quanLyMenu(MenuManagement quanLyMenu) {
        boolean exitSubMenu = false;
        while (!exitSubMenu) {
            System.out.println("1. Them menu ");
            System.out.println("2. Cap nhat menu");
            System.out.println("3. Xoa menu");
            System.out.println("4. Tra cuu menu theo ten");
            System.out.println("5. Ghi file");
            System.out.println("6. Doc file");
            System.out.println("7. Xem danh sach menu");
            System.out.println("0. Quay lai menu chinh");
            System.out.println("Moi ban chon (0-7");
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
            System.out.println("1. Them dich vu ");
            System.out.println("2. Cap nhat dich vu");
            System.out.println("3. Xoa dich vu");
            System.out.println("4. Tra cuu dich vu theo ten");
            System.out.println("5. Ghi file");
            System.out.println("6. Doc file");
            System.out.println("7. Xem danh sach dich vu");
            System.out.println("0. Quay lai menu chinh");
            System.out.println("Moi ban chon (0-7");
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

    private static void thueSanhCuoi(BookingManagement booking) {
        boolean exitSubMenu = false;
        while (!exitSubMenu) {
            System.out.println("1. Dat tiec ");
            System.out.println("2. Cap nhat tiec  ");
            System.out.println("3. Huy dat tiec");
            System.out.println("4. Tra cuu tiec da dat");
            System.out.println("5. Ghi file");
            System.out.println("6. Doc file");
            System.out.println("7. Xuat thong tin");
            System.out.println("0. Quay lai menu chinh");
            System.out.println("Moi ban chon (0-7");
            int choose = Configuration.sc.nextInt();
            Configuration.sc.nextLine();
            switch (choose) {
                case 0:
                    exitSubMenu = true;
                    break;
                case 1:
                    booking.add();
                    break;
                case 2:
                    System.out.println("Nhap ten tiec muon cap nhat");
                    String upDate = Configuration.sc.nextLine();
                    booking.upDate(upDate);
                    break;
                case 3:
                    System.out.println("Nhap ten tiec muon xoa");
                    String remove = Configuration.sc.nextLine();
                    booking.remove(remove);
                    break;
                case 4:
                    System.out.println("Nhap ten tiec muon tim");
                    String findName = Configuration.sc.nextLine();
                    booking.find(findName).forEach(h -> h.print());
                    ;
                    break;
                case 5:
                    System.out.println("Ghi file");
                    booking.writeFile("src/Booking/booking");
                    break;
                case 6:
                    System.out.println("Doc file");
                    booking.readFile("src/Booking/booking");
                    break;
                case 7:
                    booking.printList();
                    break;
            }
        }
    }
//
//    private static void sapXepDanhSachSanhMenu(QuanLyNhaHang quanLyNhaHang) {
//        // Gọi phương thức sắp xếp danh sách sảnh cưới từ đối tượng quanLyNhaHang
//        // Ví dụ:
//        // quanLyNhaHang.sapXepDanhSachSanh();
//    }

    private static void xuatHoaDonThanhToanMenu(Booking quanLyChoThue) {
        Bill b = new Bill(quanLyChoThue);
                    b.xuatHoaDon();
    }
}
