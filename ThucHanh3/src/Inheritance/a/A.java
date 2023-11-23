/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance.a;

/**
 *
 * @author ttthu
 */
public class A {

    protected static int count = 0;

    void inc() {
        count++;
    }

    public static void main(String[] args) {
        A a = new Inheritance.b.B();
        a.inc();
        System.out.println(A.count);
    }
}
