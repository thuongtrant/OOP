/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ttthu
 */
//class A{
//    protected int value;
//    public A(int x){
//        this.value = x;
//    }
//    public A(){
//        this(1);
//    }
//    public void inc1(){
//        this.value += 1;
//    }
//    public void inc2(){
//        this.value += 2;
//    }
//    public final void show(){
//        System.out.println(this.value);
//    }
//}
//class B extends A{
//    public void inc2(){
//        this.inc1(); //a2: x = 3 ; a4: x = 8
//        this.value += 2; // a2: x = 5; a4: x = 10
//    }
//}
//class C extends B{
//    public C(int y){
//        this.value += y;
//    }
//    public void inc1(){
//        this.value +=4;
//    }
//    public void inc2(){
//        super.inc2();
//        super.inc1();
//    }
//}
//public class cs2021 {
//    public static void main(String[] args) {
//        C a1 = new C(10);
//        a1.inc1(); //14
//        a1.show();
//        
//        A a2 = new B(); // 1
//        a2.inc1(); //2
//        a2.inc2(); //5
//        a2.show();
//        
//        A a3 = new C(3);
//        a3.inc1(); // 7
//        a3.inc2(); // 10
//        a3.show();
//    }
//}
//interface IA {
//    void show();
//}
// class A implements IA {
//    protected String name;
//    public A(String name){
//        this.name = name;
//    }
//
//    @Override
//    public void show() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    
//}
//class B extends A {
//
//    public B(String name) {
//        super(name);
//    }
//    public void show(){
//        System.out.println(this.name);
//    }
//}



//interface IEm {
//
//    void output();
//
//    String getSortField();
//}
//
//class IEmployee implements IEm {
//
//    @Override
//    public void output() {
//    }
//
//    @Override
//    public String getSortField() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//
//}
//
//class Em implements IEm {
//    private static int dem;
//    private String id;
//    private String name;
//    {
//        id = String.format("SV%d-%d", LocalDate.now().getYear(), dem++);
//    }
//
//    public Em(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public void output() {
//        System.out.println("id: " + id);
//        System.out.println("name: " + name);
//    }
//
//    @Override
//    public String getSortField() {
//        return id;
//    }
//}
//
//class Leader extends Em {
//    private String role;
//
//    public Leader(String name, String role) {
//        super(name);
//        this.role = role;
//    }
//
//    @Override
//    public void output() {
//        super.output();
//        System.out.println("Role: " + role);
//    }
//
//
//}
//
//class EmployeeManager {
//
//    private List<IEm> em = new ArrayList<>();
//
//    public void addEmployee(IEmployee e) {
//        this.em.add(e);
//    }
//
//    public void output() {
//        this.em.forEach(e -> e.output());
//    }
//    public void sort(){
//        this.em.sort((e1, e2) -> {
//            String id = e1.getSortField();
//            String id2 = e2.getSortField();
//            return -id.compareTo(id2);
//        });
//    }
//}
//class ontapcs{
//
//    public static void main(String[] args) {
//        EmployeeManager m = new EmployeeManager();
//        m.addEmployee(new Em("A"));
//        m.addEmployee(new Leader("LA", "Director"));
//        m.addEmployee(new Em("B"));
//        m.sort();
//        m.output();
//    }
//
//}