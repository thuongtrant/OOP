/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author ttthu
 */
public class Main {
    public static void main(String[] args) {
        Service s1 = new Karaoke("Karaoke", 100, 2);
        Service s2 = new Decoration("Deco",200);
        ServiceManagement list = new ServiceManagement();
        list.addService(s1,s2);
        list.printList();
    }
}
