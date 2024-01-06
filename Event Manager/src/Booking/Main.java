/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Booking;

/**
 *
 * @author ttthu
 */
public class Main {

    public static void main(String[] args) {
        Booking b1 = new Booking();
        Booking b2 = new Booking();
        Booking b3 = new Booking();

//        b1.input();
//        b2.input();
//        b3.input();
//        b1.print();
        BookingManagement list = new BookingManagement();

//        list.add(b1);
//        list.printList();
//        list.writeFile("src/Booking/book");
//        list.readFile("src/Booking/booking");
//        list.printList();
        list.add();
        list.printList();
        System.out.println("----");


    }
}
