/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author ttthu
 */
//public class Parent {
//
//    protected static int x;
//
//    public Parent() {
//        x = 0;
//    }
//
//    public void show() {
//        System.out.println(x);
//    }
//
//    protected void inc1() {
//        x++;
//    }
//
//    public void inc2() {
//        this.inc1();
//        x += 2;
//    }
//}
//class Child extends Parent{
//    public void inc1(){
//        x += 3;
//    }
//    public void inc2(){
//        super.inc2();
//        x += 4;
//    }
//}
//class test{
//    public static void main(String[] args) {
//        Parent o1 = new  Parent();
//        o1.inc2();
//        o1.show(); //3
//        Child o2 = new Child();
//        o2.inc1();
//        o2.show();//
//        Parent o3 = new Child();
//        o3.inc2(); 
//        o3.show();
//    }
//}
//public abstract class Parent {
//
//    protected static int x;
//
//    public Parent(int x) {
//        this.x = x;
//    }
//
//    public abstract void inc();
//
//    public void cal() {
//        System.out.println(this.x);
//        this.inc();
//    }
//
//}
//
//class Child extends Parent {
//
//    public Child(int x) {
//        super(x);
//        this.x = x;
//    }
//
//    public void inc() {
//        x += 10;
//    }
//
//    public void cal() {
//        System.out.println(this.x);
//        this.inc();
//        System.out.println(this.x);
//
//    }
//}
//
//class test {
//
//    public static void main(String[] args) {
//        Parent p = new Child(10);
//        p.cal();
//    }
//}
