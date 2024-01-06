package Paymentt;

import Booking.Booking;
import Booking.BookingManagement;
import Control.Configuration;
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
public class Bill {

    private Booking booking;
    private int idBill;
    private LocalDate ngayTao;

    public Bill(Booking booking) {
        this.booking = booking;
    }

//    public void payment() {
//        System.out.println("Ban muon thanh toan bang hinh thuc nao: ");
//        System.out.println("1. The");
//        System.out.println("2. Tien mat");
//        int choose = Configuration.sc.nextInt();
//        switch (choose) {
//            case 1:
//                Payment card = new Card();
//                xuatHoaDon();
//                System.out.println("Gia tong: " + card.totalRentalPrice());
//                break;
//            case 2:
//                Payment cash = new Cash();
//                xuatHoaDon();
//                System.out.println("Gia tong: " + cash.totalRentalPrice());
//            default:
//                throw new AssertionError();
//        }
//
//    }

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

        System.out.println("*** Gia tong menu = " + booking.getListMenu().priceSum());
        System.out.println("*** Gia tong dich vu: " + booking.getListService().priceSum());
        System.out.println("*** Gia tong: " + booking.totalRentalPrice());

//        System.out.println("===== KET THUC HOA DON =====");
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
