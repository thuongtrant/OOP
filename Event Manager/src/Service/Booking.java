/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Hall.WeddingHall;
import Hall.WeddingHallManagement;
import Menu.MenuManagement;
import Service.ServiceManagement;
import Control.Configuration;
import Person.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ttthu
 */
public class Booking {

    private String nameEvent;
    private WeddingHall hall;
    private Customer customer;
    ServiceManagement listService = new ServiceManagement();
    MenuManagement listMenu = new MenuManagement();
    WeddingHallManagement listHall = new WeddingHallManagement();

    public Booking(String nameEvent, WeddingHall hall) {
        this.nameEvent = nameEvent;
        this.hall = hall;
    }

    public Booking() {
    }

    public void input() {
        System.out.println("Name event: ");
        this.nameEvent = Configuration.sc.nextLine();
        hall = new WeddingHall();
        if (hall.isIsAvailable()) {
            hall.rent();
            System.out.println("Nhap thong tin sanh thue: ");
            this.listHall.add();
        } else {
            System.out.println("Sanh da duoc thue");
        }

        this.listMenu.add();
        this.listService.add();

    }

    public void print() {
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

    public double totalRentalPrice() {
        return listMenu.priceSum() + listHall.priceSum() + listService.priceSum();
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public WeddingHall getHall() {
        return hall;
    }

    public void setHall(WeddingHall hall) {
        this.hall = hall;
    }

}
