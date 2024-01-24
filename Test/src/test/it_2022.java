/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author ttthu
 */
abstract class A{
    private int x;
    private A(){
        this.x = 10;
    }
    public A(int y){
        this();
        x += y;
    }
    protected abstract void show();
    public int getX(){
        return x;
    }
}
class B extends A{

    public B(int y) {
        super(y);
    }
    protected void show(){
        System.out.println(getX());
    }
}
public class it_2022 {
}
