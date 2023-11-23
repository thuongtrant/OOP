/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2_Bai7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.DoubleStream;

/**
 *
 * @author ttthu
 */
public class Student {
    private static int count = 0;
    private int id = count++;
    private String name;
    private String country;
    private LocalDate birthDay;
    private double[] mark;

    public Student() {
    }
    
    public Student(String name, String country ,LocalDate birthDay){
        this.name = name;
        this.country = country;
        this.birthDay = birthDay;
    }
    
    public Student(String name, String country, String birthDay){
        this.name = name;
        this.country = country;
        this.birthDay = LocalDate.parse(birthDay, DateTimeFormatter.ofPattern(CauHinh.DATE_PATTER));
    }
    
    public void inputStudent(){
        System.out.println("Name: ");
        this.name = CauHinh.sc.nextLine();
        System.out.println("Country: ");
        this.country = CauHinh.sc.nextLine();
        System.out.println("BirthDay: ");
        String birthDay = CauHinh.sc.nextLine();
        this.birthDay = LocalDate.parse(birthDay, DateTimeFormatter.ofPattern(CauHinh.DATE_PATTER));
    }
    
    public void prinStudent(){
        System.out.println("Name: " + this.name);
        System.out.println("Country: " + this.country);
        System.out.println("BirthDay: " + this.birthDay);
        
        if(this.mark != null){
            for(double x : this.mark){
                System.out.printf("%.1f\t", x);
            }
            System.out.printf("Average Mark: %.1f\t", this.averageMark());
        
        }
    }
    
    public void inputMarkStudent(){
        this.mark = new double[CauHinh.SUBJECT];
        for(int i = 0; i< CauHinh.SUBJECT; i++){
            System.out.println("Mon " + i+1);
            mark[i] = Double.parseDouble(CauHinh.sc.nextLine());
        }
    }
    
     
    public double averageMark(){
        return DoubleStream.of(this.mark).average().getAsDouble();
    }
    
    public boolean isAward(){
        for(double x : this.mark)
            if(x < 5)
                return false;
        return averageMark() >= 8;
    }
    
    public int compareMark(Student h){
        double average1 = this.averageMark();
        double average2 = h.averageMark();
        if(average1 > average2)
            return 1;
        else if(average1 < average2)
            return -1;
        return 0;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Student.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public double[] getMark() {
        return mark;
    }

    public void setMark(double[] mark) {
        this.mark = mark;
    }
    
}
