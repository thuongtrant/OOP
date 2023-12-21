/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hall;

import Hall.Time.TimeOfDay;
import Hall.Time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author ttthu
 */
public class WeddingHall {
    private static int count = 0;
    private String id;
    private String name;
    private double price;
    private int floor;
    private int capacity;
    private DayOfWeek dayOfWeek;
    private TimeOfDay timeOfDay;
    private boolean isAvailable;
    private int countRental;
    public Scanner sc = new Scanner(System.in);
    
    {
        id = String.format("S%03d", count++);
    }
    
    public WeddingHall() {
    }

    public WeddingHall(String name, int floor, int capacity, DayOfWeek dayOfWeek, TimeOfDay timeOfDay) {
        this.name = name;
        this.floor = floor;
        this.capacity = capacity;
        this.dayOfWeek = dayOfWeek;
        this.timeOfDay = timeOfDay;
    }
    
    public void input(){
        System.out.println("Ten: ");
        this.name = sc.nextLine();
        System.out.println("Tang: ");
        this.floor = sc.nextInt();
        System.out.println("Suc chua: ");
        this.capacity = sc.nextInt();
        System.out.println("Enter day of week (MONDAY, TUESDAY, etc.): ");
        DayOfWeek dayOfWeek = DayOfWeek.valueOf(sc.nextLine().toUpperCase());
        System.out.println("Enter time of day (MORNING, AFTERNOON, EVENING): ");
        TimeOfDay timeOfDay = TimeOfDay.valueOf(sc.nextLine().toUpperCase());
    }
    private int calculateRentalPrice() {
        return dayOfWeek.getDayPrice() * timeOfDay.getTimePrice();
    }
    public void print() {
        System.out.println("Ma: " + this.id);
        System.out.println("Ten: " + this.name);
        System.out.println("Gia: " + calculateRentalPrice());
        System.out.println("Tang: " + this.floor);
        System.out.println("Suc chua: " + this.capacity);
        System.out.println("Ngay thue: " + this.dayOfWeek);
        System.out.println("Buoi thue: " + this.timeOfDay);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public TimeOfDay getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(TimeOfDay timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getCountRental() {
        return countRental;
    }

    public void setCountRental(int countRental) {
        this.countRental = countRental;
    }
    
    
}
