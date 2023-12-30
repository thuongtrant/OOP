/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hall;

import Hall.Time.TimeOfDay;
import Hall.Time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import Service.Configuration;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.zip.DataFormatException;
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
    private LocalDate dateRental;
    private DayOfWeek dayOfWeek;
    private TimeOfDay timeOfDay;
    private boolean isAvailable;
    private int countRental;
    public Scanner sc = new Scanner(System.in);
    
    {
        this.id = String.format("S%03d", count++);
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
    
    public void input()throws ParseException, DataFormatException {
        System.out.println("Ten: ");
        this.name = sc.nextLine();
        System.out.println("Ngay thue (dd/mm/yyyy): ");
        String dateRental = Configuration.sc.nextLine();
        this.dateRental = LocalDate.parse(dateRental, DateTimeFormatter.ofPattern(Configuration.DATE_PATTER));
        System.out.println("Enter day of week (MONDAY, TUESDAY, etc.): ");
        this.dayOfWeek = DayOfWeek.valueOf(sc.nextLine().toUpperCase());
        System.out.println("Enter time of day (MORNING, AFTERNOON, EVENING): ");
        this.timeOfDay = TimeOfDay.valueOf(sc.nextLine().toUpperCase());
        System.out.println("Tang: ");
        this.floor = sc.nextInt();
        System.out.println("Suc chua: ");
        this.capacity = sc.nextInt();
        
    }
     private static LocalDate parseDate(String dateStr) throws InputMismatchException {
        try {
            return LocalDate.parse(dateStr, DateTimeFormatter.ofPattern(Configuration.DATE_PATTER));
        } catch (Exception e) {
            throw new InputMismatchException("Định dạng ngày không hợp lệ.");
        }
    }

    private static DayOfWeek parseDayOfWeek(String dayOfWeekStr) throws InputMismatchException {
        try {
            return DayOfWeek.valueOf(dayOfWeekStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new InputMismatchException("Ngày trong tuần không hợp lệ.");
        }
    }

    private static TimeOfDay parseTimeOfDay(String timeOfDayStr) throws InputMismatchException {
        try {
            return TimeOfDay.valueOf(timeOfDayStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new InputMismatchException("Thời điểm trong ngày không hợp lệ.");
        }
    }
    public int calculateRentalPrice() {
        return dayOfWeek.getDayPrice() * timeOfDay.getTimePrice();
    }
    
    public void print() {
        System.out.println("Ma: " + this.id);
        System.out.println("Ten: " + this.name);
        System.out.println("Tang: " + this.floor);
        System.out.println("Suc chua: " + this.capacity);
        System.out.printf("Ngay thue: = %s\n", this.dateRental.format(DateTimeFormatter.ofPattern(Configuration.DATE_PATTER)));
        System.out.println("Ngay thue: " + this.dayOfWeek);
        System.out.println("Buoi thue: " + this.timeOfDay);
        System.out.println("Gia: " + calculateRentalPrice());
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

    public LocalDate getDateRental() {
        return dateRental;
    }

    public void setDateRental(LocalDate dateRental) {
        this.dateRental = dateRental;
    }
    
}
