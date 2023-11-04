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
public class Person {
    private String name;
    private String gender;
    private String birthday;
    private String address;

    public Person() {
    }

    public Person(String name, String gender, String birthday, String address) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void inputInfor() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap ten");
        name = scan.nextLine();
        
        System.out.println("Nhap gioi tinh");
        gender = scan.nextLine();
        
        System.out.println("Nhap ngay sinh");
        birthday = scan.nextLine();
        
        System.out.println("Nhap dia chi");
        address = scan.nextLine();
        
    }
    public void showInfor() {
        System.out.print("Ten: " + name + "; Gioi tinh: " 
                + gender + "; Ngay sinh: " + birthday + "; Dia chi: " + address);
    }

    
}
