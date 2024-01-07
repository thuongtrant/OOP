/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Booking.Booking;
import Hall.Time.*;
import Hall.*;
import Menu.*;
import Menu.MenuManagement;
import Service.*;
import java.util.ArrayList;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.List;

/**
 *
 * @author ttthu
 */
public class Main {

    public static void main(String[] args) {

//        ServiceManagement list = new ServiceManagement();
//        MenuManagement j = new MenuManagement();
//        WeddingHall h1 = new WeddingHall("A", 1110, 2, DayOfWeek.MONDAY, TimeOfDay.MORNING);
//        WeddingHall h2 = new WeddingHall("B", 2220, 5, DayOfWeek.TUESDAY, TimeOfDay.EVENING);
//        WeddingHall h3 = new WeddingHall("C", 3333, 2, DayOfWeek.SUNDAY, TimeOfDay.EVENING);
//        WeddingHallManagement listHall = new WeddingHallManagement();
        //  listHall.addHall(h1,h2,h3);
//        list.addHall();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap ten sanh can tim");
//        String kw = sc.nextLine();
//        list.findHall(kw);
//        System.out.println("Nhap ten sanh can xoa");
//        String name = sc.nextLine();
//        list.removeHall(name);
        // listHall.printList();
//        while(true){
//        System.out.println("Ban muon them dich vu nao");
//        System.out.println("1. Karaoke");
//        System.out.println("2. Decoration");
//        System.out.println("3. Singer");
//        System.out.println("4. Xem tat ca cac dich vu.");
//        System.out.println("5. Them thuc an");
//        System.out.println("6. Them thuc uong");
//        System.out.println("7. Xem tat ca menu.");
//        int choose = Configuration.sc.nextInt();
//        Configuration.sc.nextLine();
//        if(choose == 1){
//            Service s = new ServiceKaraoke();
//            s.input();
//            s.print();
//            list.addService(s);
//        } else if(choose == 2){
//            Service s = new ServiceDecoration();
//            s.input();
//            s.print();
//            list.addService(s);
//        }else if(choose == 3){
//            Service s = new ServiceSinger();
//            s.input();
//            s.print();
//            list.addService(s);
//        }else if(choose == 4){
//            list.printList();
//            System.out.println("Gia tong cac dich vu");
//            System.out.println(list.priceService());
//            
//        }else if(choose == 5){
//            MenuItem m = new Food();
//            m.input();
//            m.print();
//            listMenu.addMenu(m);
//        }else if(choose == 6){
//             MenuItem d = new Drink();
//             d.input();
//             d.print();
//             listMenu.addMenu(d);
//        }else if(choose == 7){
//            list.printList();
//            System.out.println("Gia tong cac dich vu");
//            System.out.println(listMenu.priceMenu());
//            
//        }else if(choose == 9){
//            break;
//        }
//    }

     
//         
//        Service s = new ServiceKaraoke(3);
//        Service d = new ServiceDecoration();
//        Service k = new ServiceSinger("Lisa", 3);
        ServiceManagement l = new ServiceManagement();
        l.add();
//        l.add(s, d, k);
        l.printList();
//        l.upDate("Karaoke");
//        l.printList();

    }

}
