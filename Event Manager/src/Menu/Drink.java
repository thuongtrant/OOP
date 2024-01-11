/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import Control.Configuration;
import Menu.MenuItem;

/**
 *
 * @author ttthu
 */
public class Drink extends MenuItem {

    private static int count = 0;
    private int id = count++;
    private String manufacturer;

    public Drink() {
    }

    public Drink(String name, double price, String manufacturer) {
        super(name, price);
        this.manufacturer = manufacturer;
    }

    @Override
    public void input() {
        System.out.println("Thuc uong ");
        super.input();
        System.out.println("Hang san xuat: ");
        this.manufacturer = Configuration.sc.nextLine();
    }

    @Override
    public void print() {
        System.out.println(" --- Thong Tin Menu Thuc Uong ---");

        System.out.println("ID: " + this.id);
        super.print();
        System.out.println("Hang san xuat: " + this.manufacturer);
    }

    @Override
    public double calculatePrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
