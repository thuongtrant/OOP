/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.Scanner;

/**
 *
 * @author ttthu
 */
public abstract class Service {

    
    private String name;
    private double price;
    Scanner sc = new Scanner(System.in);

    public Service(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Service() {
    }

    public void input() {
        System.out.println("Ten: ");
        this.name = sc.nextLine();
        System.out.println("Gia: ");
        this.price = sc.nextDouble();
    }

    public void print() {
        
        System.out.println("Ten: " + this.name);
        System.out.println("Gia: " + this.price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
