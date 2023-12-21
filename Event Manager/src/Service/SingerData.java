/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.Scanner;

/**
 *
 * @author ttthu
 */
public class SingerData {
    private String name;
    private int song;
    Scanner sc = new Scanner(System.in);
   
    public SingerData(String name, int song) {
        this.name = name;
        this.song = song;
    }

    public SingerData() {
    }

    public void input(){
        System.out.println("Nhap so luong ca si: ");
        int numSinger = sc.nextInt();
        for(int i = 0;i<numSinger;i++){
            System.out.println("Nhap ten ca si thu: " + i+1);
            this.name = sc.nextLine();
            System.out.println("So bai: ");
            this.song = sc.nextInt();
        }
    }
    
    public void output(){
            System.out.println("Ca si: " + name);
            System.out.println("So bai hat: " + name);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSong() {
        return song;
    }

    public void setSong(int song) {
        this.song = song;
    }
    
    
}
