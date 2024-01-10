/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hall;

import Control.IOFile;
import Hall.Time.DayOfWeek;
import Hall.Time.TimeOfDay;
import java.io.FileNotFoundException;

/**
 *
 * @author ttthu
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        WeddingHall w = new WeddingHall();
        WeddingHall w1 = new WeddingHall("A", 1, 1000, "22/12/2023", DayOfWeek.MONDAY, TimeOfDay.MORNING);
        WeddingHall w2 = new WeddingHall("B", 2, 2000, "11/11/2022", DayOfWeek.TUESDAY, TimeOfDay.AFTERNOON);
        WeddingHall w3 = new WeddingHall("C", 3, 3000, "11/10/2023", DayOfWeek.SUNDAY, TimeOfDay.EVENING);
        WeddingHall w4 = new WeddingHall("A", 2, 1000, "22/12/2023", DayOfWeek.MONDAY, TimeOfDay.MORNING);

        WeddingHallManagement list = new WeddingHallManagement();
        list.add(w1, w2, w3,w4);
        list.printList();
        String kw = Control.Configuration.sc.nextLine();
        
//        list.remove("a");
//        System.out.println("Sau khi xoa");
//        list.printList();

//        list.upDate("S001");
//        list.printList();

//        System.out.println("tim");
//        list.findHall("A").forEach(h -> h.print());

//        list.add();
//        list.writeFile("src/Hall/hall");
//        list.readFile("src/Hall/hall");

//        list.add();
//        list.printList();
//        System.out.println("Tra cuu theo nam");
//        list.findHallByYear(2023).forEach(h -> h.print());

//list.printList();
    }
}
