/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author ttthu
 */
//class Parent {
//    protected static int x;
//    public Parent(){
//        x = 0;
//    }
//    public final void show(){
//        System.out.println(x);
//    }
//    protected void inc1(){
//        x++;
//    }
//    private void inc2(){
//        x += 2;
//    }
//    public void inc(){
//        this.inc1();
//        this.inc2();
//        x += 2;
//    }
//}
//class Child extends Parent{
//    public void inc1(){
//        x += 5;
//    }
//    public void inc2(){
//        x += 10;
//    }
//}
//public class it_2023 {
//    public static void main(String[] args) {
//        Parent o1 = new Parent();
//        o1.inc();
//        o1.show(); //5
//        
//        Child o2 = new Child();
//        o2.inc1();
//        o2.show(); //5
//        
//        Parent o3 = new Child();
//        o3.inc();
//        o3.show(); //9
//    }
//}
//interface IParent {
//
//    void inc();
//}
//
//class Parent implements IParent {
//
//    protected int x;
//
//    public Parent(int y) {
//        this.x = y;
//    }
//
//    public final void show() {
//        this.inc();
//        System.out.println(x + 10);
//    }
//
//    public void inc() {
//        x += 5;
//    }
//
//}
//
//class Child extends Parent {
//
//    public Child(int x) {
//        super(x);
//    }
//
//    public void inc() {
//        x += -10;
//    }
//}
//
//public class it_2023 {
//
//    public static void main(String[] args) {
//        Parent o1 = new Parent(5);
//        o1.show();
//        Parent o2 = new Child(5);
//        o2.show();
//    }
//}
class NhanVien implements Cloneable {

    private static int count = 0;
    private String id;
    private String ten;
    private BoPhan boPhan;

    {
        id = String.format("NV%05d", ++count);
    }

    public NhanVien(String ten, BoPhan boPhan) {
        this.ten = ten;
        this.boPhan = boPhan;
    }

    public BoPhan getBoPhan() {
        return boPhan;
    }

    @Override
    protected Object clone() {
        try {
            NhanVien cloned = (NhanVien) super.clone();
            cloned.boPhan = (BoPhan) this.boPhan.clone();

            return cloned;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public void hienThi() {
        System.out.println(id + "-" + this.ten + "-" + this.boPhan.getTen());
    }
}

class BoPhan implements Cloneable {

    public BoPhan(String ten) {
        this.ten = ten;
    }

    private String ten;

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTen() {
        return ten;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class it_2023 {

    public static void main(String[] args) throws CloneNotSupportedException {
        BoPhan b1 = new BoPhan("Ban hang");
        NhanVien n1 = new NhanVien("A", b1);
        NhanVien n2 = (NhanVien) n1.clone();
        n2.getBoPhan().setTen("Maketing");
        n1.hienThi();
        n2.hienThi();
    }
}
