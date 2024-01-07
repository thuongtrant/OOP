package Paymentt;

import Booking.Booking;
import Booking.BookingManagement;
import Control.Configuration;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.OffsetTime;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ttthu
 */
public class Bill implements Serializable {

    private Booking booking;
    private Payment p;
    private int idBill;
    private LocalDate ngayTao;

    public Bill(Booking booking) {
        this.booking = booking;
    }

    public void payment() {
        System.out.println("Ban muon thanh toan bang hinh thuc nao: ");
        System.out.println("1. The");
        System.out.println("2. Tien mat");
        int choose = Configuration.sc.nextInt();
        // Lấy giá trị của tổng hóa đơn
        double totalPrice = booking.totalRentalPrice();
        switch (choose) {
            case 1:
                Payment card = new Card();
                xuatHoaDon();
                System.out.println("*** Gia can thanh toan: " + card.totalRentalPrice(totalPrice) + "VND ***");
                System.out.println("===== KET THUC HOA DON =====");

                break;
            case 2:
                Payment cash = new Cash();
                xuatHoaDon();
                System.out.println("*** Gia can thanh toan: " + cash.totalRentalPrice(totalPrice) + "VND ***");
                System.out.println("===== KET THUC HOA DON =====");

            default:
                throw new AssertionError();
        }

    }

    public void xuatHoaDon() {

        System.out.println("===== HOA DON =====");
        System.out.println("ID BILL : " + this.idBill);
        System.out.println("Ngay tao: " + ngayTao.now());
        System.out.println("--- Thong tin khach hang ---");
        booking.getCustomer().print();
        System.out.println("Ngay thue: " + booking.dateBooking());
        System.out.println("Ten bua tiec: " + booking.getNameEvent());

        System.out.println("--- Thong tin sanh thue ---");
        booking.getListHall().printList();

        System.out.println("--- Thong tin danh sach menu ---");
        booking.getListMenu().printList();

        System.out.println("--- Thong tin danh sach dich vu ---");
        booking.getListService().printList();
        System.out.println("*** Gia thue sanh = " + booking.getListHall().priceSum() + "VND ***");
        System.out.println("*** Gia tong menu = " + booking.getListMenu().priceSum() + "VND ***");
        System.out.println("*** Gia tong dich vu: " + booking.getListService().priceSum() + "VND ***");
        System.out.println("*** Gia tong: " + booking.totalRentalPrice() + "VND ***");

    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public int getIdBill() {
        return idBill;
    }

    public void setIdBill(int idBill) {
        this.idBill = idBill;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

}
