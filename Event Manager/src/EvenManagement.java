/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ttthu
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
public class EvenManagement {

    public static void main(String[] args) {



        Booking b = new Booking();
        //b.input();
        //b.print();
         try {
            b.input();
        } catch (InputMismatchException | IllegalArgumentException e) {
            System.out.println("WTF: " + e.getMessage());
        }
         b.print();
         
         
    }

}

