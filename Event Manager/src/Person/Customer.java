/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;


/**
 *
 * @author ttthu
 */
public class Customer extends Person {

    private static int count = 0;
    private int id;

    {
        this.id = count++;
    }
    public Customer(String name, String adress, String numberPhone) {
        super(name, adress, numberPhone);
    }

    public Customer() {
        super();
    }

    public void print() {
        System.out.println(" --- Thong Tin Khach Hang ---");
        System.out.println("ID CUSTOMER: " + this.id);
        super.print();
    }

}
