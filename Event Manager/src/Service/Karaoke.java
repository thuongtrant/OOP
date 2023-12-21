/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

/**
 *
 * @author ttthu
 */
public class Karaoke extends Service{
    private int time;
    protected int idKara;
    protected static int countKara = 0;

    public Karaoke(String name, double price,int time) {
        super(name, price);
        this.time = time;
        idKara = countKara++;
    }
    
    @Override
    public void input(){
        super.input();
        System.out.println("Thoi gian thue: " );
        this.time = sc.nextInt();
    }
    
    @Override
    public void print(){
        System.out.println("Ma: " + this.idKara);
        super.print();
        System.out.println("Thoi gian thue: " + this.time);
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
