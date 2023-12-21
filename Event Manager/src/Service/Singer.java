/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.List;

/**
 *
 * @author ttthu
 */
public class Singer extends Service{
    private String singer;
    private int countSong;
    List<SingerData> list;

    public Singer(String singer, int countSong) {
        this.singer = singer;
        this.countSong = countSong;
    }
    
    @Override
    public void input(){
        super.input();
        System.out.println("ca si: ");
        this.singer = sc.nextLine();
        System.out.println("So bai: ");
        this.countSong = sc.nextInt();
    }
    @Override
    public void print(){
    super.print();
        System.out.println("Ca si: " + this.singer);
        System.out.println("So bai: " + this.countSong);
    }
}
