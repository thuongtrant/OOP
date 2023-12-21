/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author ttthu
 */
public class Decoration extends Service {

    protected int idDeco;
    protected static int countDeco = 0;

    public Decoration(String name, double price) {
        super(name, price);
    }

    public Decoration() {
        idDeco = countDeco++;
    }

    @Override
    public void print() {
        System.out.println("Ma: " + this.idDeco);
        super.print();
    }
}
