/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListStudent61;

import java.util.Scanner;

/**
 *
 * @author ttthu
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ListStudents dssv = new ListStudents();
        int choose;
        do {
            System.out.println("Menu");
            System.out.println("Chon: ");
            System.out.println("1. Them sinh vien vao danh sach");
            System.out.println("2. In danh sach sinh vien");
            System.out.println("3. Kiem tra danh sach rong");
            System.out.println("4. Lay ra so luong sinh vien trong danh sach");
            System.out.println("5. Lam rong danh sach sinh vien");
            System.out.println("6. Tim kiem sinh vien bang ma sinh vien");
            System.out.println("7. Xoa mot sinh vien bang ma sinh vien");
            System.out.println("8. Tim kiem tat ca sv dua tren ten");
            System.out.println("9. Xuat ra danh sach sinh vien co diem tu cao den thap");
            System.out.println("0. Thoat");
            choose = scan.nextInt();
            scan.nextLine();
            switch(choose){
                case 1 -> {
                    System.out.println("Nhap ma sinh vien");
                    String id = scan.nextLine();
                    System.out.println("Nhap ho va ten");
                    String name = scan.nextLine();
                    System.out.println("Nhap nam sinh");
                    int birthYear = scan.nextInt();
                    System.out.println("Nhap diem trung binh");
                    float mark = scan.nextFloat();
                    Student s = new Student(id, name, birthYear, mark);
                    dssv.addStudent(s);
                }
                case 2 -> dssv.printList();
                case 3 -> System.out.println("Danh sach rong: " + dssv.checkEmpty());
                case 4 -> System.out.println("So luong danh sach sinh vien: " + dssv.countList());
                case 5 -> dssv.makeEmpty();
                case 6 -> {
                    System.out.println("Nhap ma sinh vien");
                    String id = scan.nextLine();
                    Student sv = new Student(id);
                    System.out.println("Kiem tra sinh vien co trong danh sach " + dssv.findStudent(sv));
                }
                case 7 -> {
                    System.out.println("Nhap ma sinh vien");
                    String id = scan.nextLine();
                    Student sv = new Student(id);
                    System.out.println("Kiem tra sinh vien co trong danh sach " + dssv.delStudent(sv));
                }
                case 8 -> {
                    System.out.println("Nhap ho va ten");
                    String name = scan.nextLine();
                    System.out.println("Ket qua tim kiem");
                    dssv.findName(name);
                }
                case 9 -> {
                    dssv.countList();
                    dssv.printList();
                }


            }
                
        }while(choose != 0);
    }
}
