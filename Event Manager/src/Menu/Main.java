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
        MenuItem f1 = new Food("Ga nuong", 100,false);
        MenuItem f2 = new Food("Xoi", 10,true);
        MenuItem d1 = new Drink("Nuoc khoang", 10,"Aquavina");
        MenuItem d2 = new Drink("Tra sua", 20, "Koi");
        MenuManagement list = new MenuManagement();
        
        list.add(f1, f2,d1,d2);
//        list.printList();
//        System.out.println("tim kiem");
//        list.findMenu("a").forEach(h -> h.print());
//        list.upDate("ga");
//        list.printList();
        list.writeFile("src/Menu/menu.txt");
        list.readFile("src/Menu/menu.txt");
    }
}
