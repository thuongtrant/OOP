/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestAbstract;

/**
 *
 * @author ttthu
 */
abstract class M {

    protected double m1, m2, m3;
    protected static int soMon = 0;
    private int mon;

    public M(double m1, double m2, double m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.mon = ++soMon;
    }

    abstract double cal();

    abstract String formula();

    public void show() {
        System.out.println("Diem mon " + mon + " he so 2");
        System.out.println("Diem 3 mon: " + this.m1 + ", " + this.m2 + ", " + this.m3);
        System.out.println(formula() + cal());
    }

    public static void main(String[] args) {
        M v1 = new A(7, 6, 8.5);
        M v2 = new B(8, 7, 5.5);
        v1.show();
        v2.show();
    }
}

class A extends M {

    public A(double m1, double m2, double m3) {
        super(m1,m2,m3);
    }

    @Override
    public double cal() {
        return (m1 * 2 + m2 + m3) / 4;
    }

    @Override
    public String formula() {
        return "(m1*2 + m2 + m3)/4 = ";
    }
   
}

class B extends M {

    public B(double m1, double m2, double m3) {
        super(m1,m2,m3);
    }

    @Override
    public double cal() {
        return (m1 + m2 * 2 + m3) / 4;
    }

    @Override
    public String formula() {
        return "(m1 + m2*2 + m3)/4 = ";
    }
}
