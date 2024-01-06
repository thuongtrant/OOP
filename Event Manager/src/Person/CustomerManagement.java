/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ttthu
 */
public class CustomerManagement implements Serializable{
    List<Customer> list;

    public CustomerManagement() {
        list = new ArrayList<>();
    }
    public void add(){
        Customer c = new Customer();
        c.input();
        this.list.add(c);
    }
    public void prinList(){
        this.list.forEach(h -> h.print());
    }
}
