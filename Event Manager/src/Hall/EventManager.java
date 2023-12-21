/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Hall;

import Hall.Time.TimeOfDay;
import Hall.Time.DayOfWeek;
import java.util.Scanner;
/**
 *
 * @author ttthu
 */
public class EventManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WeddingHall h1 = new WeddingHall("A", 1110, 2, DayOfWeek.MONDAY, TimeOfDay.MORNING);
        WeddingHall h2 = new WeddingHall("B", 2220, 5, DayOfWeek.TUESDAY, TimeOfDay.EVENING);
        WeddingHall h3 = new WeddingHall("C", 3333, 2, DayOfWeek.SUNDAY, TimeOfDay.EVENING);
        WeddingHallManagement list = new WeddingHallManagement();
        list.addHall(h1,h2,h3);
//        list.addHall();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap ten sanh can tim");
//        String kw = sc.nextLine();
//        list.findHall(kw);
//        System.out.println("Nhap ten sanh can xoa");
//        String name = sc.nextLine();
//        list.removeHall(name);
        list.printList();
        
        
    }
    
}
