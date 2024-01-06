/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.List;
import java.util.InputMismatchException;
import Control.Configuration;
import java.io.Serializable;

/**
 *
 * @author ttthu
 */
public class ServiceSinger extends Service{

    private static int count = 0;
    private int id = count++;
    private String singerName;
    private int countSong;
    private final double price = 50;

    public ServiceSinger(String singerName, int countSong) {
        super("Singer");
        this.singerName = singerName;
        this.countSong = countSong;
    }

    public ServiceSinger() {
        super("Singer");
    }

    @Override
    public void input() {
        System.out.println("Ten: ");
        this.singerName = Configuration.sc.nextLine();
        try {

            System.out.println("So bai: ");
            this.countSong = Configuration.sc.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Vui long nhap so!!!");

        } catch(Exception e){
            System.out.println("Vui long nhap dung dinh dang!");
        }
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Ca si: " + this.singerName);
        System.out.println("So bai: " + this.countSong);
    }

    @Override
    public double calculatePrice() {
        return price * countSong;
    }

    public String getSingerName() {
        return singerName;
    }

    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    public int getCountSong() {
        return countSong;
    }

    public void setCountSong(int countSong) {
        this.countSong = countSong;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
