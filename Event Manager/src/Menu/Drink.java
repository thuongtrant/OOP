/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import Service.Configuration;
import Service.MenuItem;

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
        super.input();
        System.out.println("Hang san xuat: ");
        this.manufacturer = Configuration.sc.nextLine();
    }

    @Override
    public void print() {
        System.out.println("ID: " + this.id);
        super.print();
        System.out.println("Hang san xuat: " + this.manufacturer);
    }

    @Override
    public double calculatePrice() {
        return price;
    }

}
