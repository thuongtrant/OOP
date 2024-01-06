/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.io.Serializable;

/**
 *
 * @author ttthu
 */
public class ServiceDecoration extends Service{

    private static int count = 0;
    private final double price = 20;
    private int id = count ++;

    public ServiceDecoration() {
        super("Decoration");
    }

    @Override
    public double calculatePrice(){
        return price;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
}
