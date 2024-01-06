/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author ttthu
 */
public abstract class Service implements Serializable{

    private String name;
    private int id;
    private double price;
    
    public Service(String name) {
        this.name = name;
    }
    
    public abstract double calculatePrice(); 
    public void input(){
    
    }

    public void print(){
        System.out.printf("Dich vu %s\nMa:%s\nGia: %.2f\n", this.getName(), this.getId(), this.calculatePrice());
    }

    @Override
    public String toString() {
        return String.format("Dich vu %s\nMa:", this.getName(), this.getId());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  

  

}
