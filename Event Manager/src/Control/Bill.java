package Control;


import Booking.Booking;

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

    public Bill(Booking booking) {
        this.booking = booking;
    }

    public void xuatHoaDon() {
        System.out.println("===== HOA DON =====");
        System.out.println("Thong tin khach hang:");
        booking.getCustomer().print();

        System.out.println("Ten bua tiec: " + booking.getNameEvent());

        System.out.println("Thong tin sanh thue:");
        booking.getListHall().printList();

        System.out.println("Thong tin danh sach menu:");
        booking.getListMenu().printList();

        System.out.println("Thong tin danh sach dich vu:");
        booking.getListService().printList();

        System.out.println("Gia tong menu: " + booking.getListMenu().priceSum());
        System.out.println("Gia tong dich vu: " + booking.getListService().priceSum());
        System.out.println("Gia tong: " + booking.totalRentalPrice());

        System.out.println("===== KET THUC HOA DON =====");
    }
}
