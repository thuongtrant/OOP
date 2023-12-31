/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.InputMismatchException;
import Control.Configuration;

/**
 *
 * @author ttthu
 */
public class ServiceKaraoke extends Service {

    private int time;
    private final double price = 20;
    private int id = count++;
    private static int count = 0;

    public ServiceKaraoke() {
        super("Karaoke");
    }

    public ServiceKaraoke(int time) {
        super("Karaoke");
        this.time = time;
    }

    @Override
    public void input() {
        try {
            System.out.println("Thoi gian thue: ");
            this.time = Configuration.sc.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Vui long nhap so!");

        }

    }

    @Override
    public void print() {
        super.print();
        System.out.println("Thoi gian thue: " + this.time);
    }

    @Override
    public double calculatePrice() {
        return price * time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
