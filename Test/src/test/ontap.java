/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author ttthu
 */
//class A {
//
//    protected int x;
//
//    public A() {
//        this.x = 10;
//    }
//
//    private void inc1() {
//        this.x += 1;
//    }
//
//    protected void inc2() {
//        this.inc1();
//        this.x += 2;
//    }
//
//    public final void show() {
//        System.out.println(this.x);
//    }
//
//}
//
//class B extends A {
//
//    public void inc1() {
//        this.x += 3;
//    }
//
//    public void inc2() {
//        super.inc2();
//    }
//}
//class C extends B {
//    public void inc1(){
//        this.x +=5;
//    }
//}
//public class ontap {
//
//    public static void main(String[] args) {
//        B a1 = new B();
//        a1.inc1(); //13
//        a1.inc2();
//        a1.show(); //16
//        
//        A a3 = new C();
//        a3.inc2();
//        a3.show(); //13
//        
//        B a2 = new C();
//        a2.inc1(); //15
//        a2.inc2();
//        a2.show(); //18
//    }
//}
//abstract class Calculator {
//
//    protected double a, b;
//
//    public Calculator(double a, double b) {
//        this.a = a;
//        this.b = b;
//    }
//
//    abstract double operator();
//
//    abstract String operatorStr();
//
//    public void display() {
//        System.out.printf(
//                "%.1f %s %.1f = %.1f",
//                this.a, this.operatorStr(),
//                this.b, this.operator());
//    }
//}
//
//class PowCal extends Calculator {
//
//    public PowCal(double a, double b) {
//        super(a, b);
//    }
//
//    public double operator() {
//        return Math.pow(a, b);
//    }
//
//    public String operatorStr() {
//        return " ^ ";
//    }
//
//    public void display() {
//        System.out.println("== PHEP LUY THUA ==");
//        super.display();
//    }
//}
//
//class AddCal extends Calculator {
//
//    public AddCal(double a, double b) {
//        super(a, b);
//    }
//
//    public double operator() {
//        return a + b;
//    }
//
//    public String operatorStr() {
//        return " + ";
//    }
//    public void display(){
//        System.out.println("\n== PHEP CONG ==");
//        super.display();
//    }
//
//}
//
//class tester {
//
//    public static void main(String[] args) {
//        Calculator c1 = new PowCal(2, 5);
//        c1.display();
//        Calculator c2 = new AddCal(2, 5);
//        c2.display();
//    }
//}


