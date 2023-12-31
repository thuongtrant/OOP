/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

/**
 *
 * @author ttthu
 */
public class Main {

    public static void main(String[] args) {
        MenuItem m1 = new Food();
        MenuItem m2 = new Drink();
        MenuManagement list = new MenuManagement();
        m1.input();
        m2.input();
        list.add(m1, m2);
        list.printList();
        System.out.println("tim kiem");
//        list.findMenu("a").forEach(h -> h.print());
        list.upDate("ga");
        list.printList();
    }
}
