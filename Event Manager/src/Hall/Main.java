/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hall;

import Hall.Time.DayOfWeek;
import Hall.Time.TimeOfDay;

/**
 *
 * @author ttthu
 */
public class Main {

    public static void main(String[] args) {
       WeddingHall w = new WeddingHall();
       WeddingHall w1 = new WeddingHall("A", 20, 2, "22/12/2022", DayOfWeek.MONDAY, TimeOfDay.MORNING);
       WeddingHall w2 = new WeddingHall("B", 10, 1, "11/11/2011", DayOfWeek.TUESDAY, TimeOfDay.AFTERNOON);

        WeddingHallManagement list = new WeddingHallManagement();
        list.add(w1,w2);
        list.printList();
//        list.upDate("S001");
//        list.printList();
        System.out.println("tim");
        list.findHall("A").forEach(h -> h.print());
    }
}
