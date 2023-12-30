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
public class Food extends MenuItem{
    private static int count = 0;
    private int id = count++;
    private boolean isVegetarian = true;

    public Food() {
    }

    public Food(String name, double price) {
        super(name, price);
    }
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVegetarian() {
        System.out.println("Mon ban chon an chay duoc khong (Y/N)");
        String kw = Configuration.sc.nextLine();
        if(kw.equalsIgnoreCase("Y"))
            return isVegetarian = true;
        return isVegetarian = false;
    }

    public void setIsVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    @Override
    public double calculatePrice() {
        if(isVegetarian == true){
            return price ;
        }else
            return price + 5;
    }
    
    @Override
    public void input(){
        super.input();
        isVegetarian();
    }
    @Override
    public void print(){
        System.out.println("ID: " + id);
        super.print();
//        if(isVegetarian == true)
//            System.out.println("Chay");
//        else 
//            System.out.println("Khong Chay");
System.out.println("Trang thai thuc an: " + (isVegetarian ? "Chay" : "Man"));           
    }
}