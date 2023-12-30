/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import Service.Configuration;

/**
 *
 * @author ttthu
 */
public abstract class MenuItem {
    protected String name;
    protected double price;

    public MenuItem() {
    }

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    public void input(){
        System.out.println("Ten: ");
        this.name = Configuration.sc.nextLine();
        System.out.println("Gia: ");
        this.price = Configuration.sc.nextDouble();
        Configuration.sc.nextLine();
        
    }
    
    public void print(){
        System.out.println("Ten: " + this.name);
        System.out.println("Gia: " + this.calculatePrice());
    }
    
     public abstract double calculatePrice(); 

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
