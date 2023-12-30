/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Hall.WeddingHall;
import Hall.WeddingHallManagement;
import Menu.MenuManagement;
import Service.ServiceManagement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ttthu
 */
public class Booking {

    private String nameEvent;
    private WeddingHall hall;
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
        System.out.println("Nhap thong tin sanh thue: ");
        this.listHall.addHall();
        this.listMenu.addMenu();
        this.listService.addService();

    }

    public void print() {
        System.out.println("Name event: " + this.nameEvent);
        listHall.printList();
        listMenu.printList();
        listService.printList();
        System.out.println("Gia tong menu");
        System.out.println(listMenu.priceMenu());
        System.out.println("Gia tong dich vu");
        System.out.println(listService.priceService());
        System.out.println("Gia tong: " + totalRentalPrice());
    }

    public double totalRentalPrice() {
        return listMenu.priceMenu() + listHall.priceRentalHall() + listService.priceService();
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
