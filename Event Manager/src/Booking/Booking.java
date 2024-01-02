/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Booking;

import Hall.WeddingHall;
import Hall.WeddingHallManagement;
import Menu.MenuManagement;
import Service.ServiceManagement;
import Control.Configuration;
import Person.*;
import Service.ServiceManagement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ttthu
 */
public class Booking {
    private String nameEvent;
    private WeddingHall hall = new WeddingHall();
    private Customer customer = new Customer();
    ServiceManagement listService= new ServiceManagement();
    MenuManagement listMenu = new MenuManagement();
    WeddingHallManagement listHall= new WeddingHallManagement();

    public Booking() {
    }

    public void input() {
        System.out.println("Vui long nhap thong tin cua ban: ");
        customer.input();
        
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
        customer.print();
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
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

    
}
