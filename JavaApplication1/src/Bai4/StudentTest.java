/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ttthu
 */
public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        int choose;
        Scanner scan = new Scanner(System.in);
        do {
            showMenu();
            System.out.println("Choose: ");
            choose = Integer.parseInt(scan.nextLine());
            
            switch(choose){
                case 1 -> {
                    int n;
                    System.out.println("Nhap so sinh vien");
                    n = Integer.parseInt(scan.nextLine());
                    for(int i=0;i<n;i++)
                    {
                        Student sv = new Student();
                        sv.inputInfor();
                        studentList.add(sv);
                    }
                }
                case 2 -> {
                    for(int i=0;i<studentList.size();i++)
                    {
                        studentList.get(i).showInfor();
                    }
                }
                case 3 -> {
                    int minIndex = 0, maxIndex = 0;
                    float minMark, maxMark;
                    minMark = studentList.get(0).getMark();
                    maxMark = studentList.get(0).getMark();
                    for(int i = 1; i < studentList.size(); i++)
                    {
                        if(studentList.get(i).getMark() < minMark) {
                            i = minIndex;
                            minMark = studentList.get(i).getMark();
                        }
                        if(studentList.get(i).getMark() > maxMark) {
                            i = maxIndex;
                            maxMark = studentList.get(i).getMark();
                        }
                    }
                    System.out.println("Sinh vien co diem trung binh cao nhat");
                    studentList.get(maxIndex).showInfor();
                    System.out.println("Sinh vien co diem trung binh thap nhat");
                    studentList.get(minIndex).showInfor();
                }
                case 4 -> {
                    System.out.println("Nhap ma sinh vien can tim");
                    String rollNoSearch = scan.nextLine();
                    int count = 0;
                     
                    for(Student student : studentList) {
                        if(student.getRollNo().equalsIgnoreCase(rollNoSearch)) {
                            student.showInfor();
                            count ++;
                        }
                    }
                    
                    if(count == 0) {
                        System.out.println("Khong tim thay sinh vien");
                    }
                }
                case 5 -> {
                    Collections.sort(studentList, (Student o1, Student o2) -> {
                        int cmp = o1.getName().compareTo(o2.getName());
                        if (cmp >= 0) {
                            return 1;
                        }
                        return -1;
                    });
                    
                    for(int i=0; i < studentList.size(); i++) {
                        studentList.get(i).showInfor();
                    }
                }
                case 6 -> { 
                     Collections.sort(studentList, (Student o1, Student o2) -> o1.getMark() >= o2.getMark()?-1:1);
                    
                    for(int i=0; i < studentList.size(); i++) {
                        studentList.get(i).isSchoolarhip();
                        studentList.get(i).showInfor();
                    }
                }
                    
            }
        } while(choose != 7);
    }
    static void showMenu() {
        System.out.println("1.Nhap vao N sinh vien");
        System.out.println("2.Hien thi thong tin sinh vien");
        System.out.println("3.Hien thi max va min theo diem trung binh");
        System.out.println("4.Tim kiem sinh vien theo ma sinh vien");
        System.out.println("5.Hiem thi tat ca sinh vien (A->Z)");
        System.out.println("6.Hien thi sinh vien duoc hoc bong");
        System.out.println("7.Thoat");
    }
}
