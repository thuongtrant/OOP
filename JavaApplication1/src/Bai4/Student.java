/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

import java.util.Scanner;

/**
 *
 * @author ttthu
 */
public class Student extends Person {
    private String rollNo;
    private float mark;
    private String email;

    public Student() {
    }
    @Override 
    public void showInfor() {
        super.showInfor();
        System.out.println("; rollNo: " + rollNo + "; mark: " + mark + "; email: " + email);
        System.out.println("");
    }
    @Override
    public void inputInfor() {
        super.inputInfor();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Nhap ma sinh vien: ");
        while(true) {
            String rollNoInput = scan.nextLine();
            boolean check = setRollNo(rollNoInput);
            if(check){
                    break;
            }
        }
        
        System.out.println("Nhap diem");
            mark = Float.parseFloat(scan.nextLine());
            
        System.out.println("Nhap email");
        while(true) {
            String emailInput = scan.nextLine();
            boolean check = setEmail(emailInput);
            if(check) {
                break;
            }
        }
    }
    public String getRollNo() {
        return rollNo;
    }

    public boolean setRollNo(String rollNo) {
        if (rollNo != null && rollNo.length() == 8) {
            this.rollNo = rollNo;
            return true;
        } else {
            System.err.println("Nhap lai ma sinh vien");
            return false;
        }
        
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if(email != null && email.contains("@") && !email.contains(" ")) {
            this.email = email;
            return true;
        } else {
            System.err.println("Nhap lai dia chi email: ");
            return false;
        }
        
    }
    public boolean isSchoolarhip() {
         return mark>=8;
    }
}
