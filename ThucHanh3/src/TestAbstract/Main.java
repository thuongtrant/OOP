/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestAbstract;

/**
 *
 * @author ttthu
 */
abstract  class A {
    abstract void show1();
}

abstract class B extends A {
    @Override
    void show1() {
        System.out.print("B");
    }

    abstract void show2();
}

class C extends B {
    @Override
    void show2() {
        System.out.print("C");
    }
}

public class Main {
    public static void main(String[] args) {
        A a1 = new C();
        a1.show1();  // Kết quả: B

        B b1 = new C();
        b1.show2();  // Kết quả: C
    }
}

