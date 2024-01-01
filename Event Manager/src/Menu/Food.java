/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

import Control.Configuration;

/**
 *
 * @author ttthu
 */
public class Food extends MenuItem {

    private static int count = 0;
    private int id = count++;
    private boolean isVegetarian = false;

    public Food() {
    }

    public Food(String name, double price) {
        super(name, price);
    }

    public Food(String name, double price,boolean isVegetarian) {
        super(name, price);
        this.isVegetarian = isVegetarian;
    }

    @Override
    public double calculatePrice() {
        if (isVegetarian == true) {
            return price;
        } else {
            return price + 5;
        }
    }

    @Override
    public void input() {
        System.out.println("Mon an ");
        super.input();
        isVegetarian();
    }

    @Override
    public void print() {
        System.out.println("ID: " + id);
        super.print();
        System.out.println("Trang thai thuc an: " + (isVegetarian ? "Chay" : "Man"));
    }
    
    public boolean isVegetarian() {
        System.out.println("Mon ban chon an chay duoc khong (Y/N)");
        String kw = Configuration.sc.nextLine();
        if (kw.equalsIgnoreCase("Y")) {
            return isVegetarian = false;
        }
        return isVegetarian = true;
    }

    public void setIsVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }
    
    
      public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
