/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hall;

import Hall.Time.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import MyException.*;
import java.util.Scanner;
import Control.Configuration;
import java.io.Serializable;
import Control.IOFile;
import java.text.ParseException;
import java.util.InputMismatchException;
import java.util.Objects;
//import java.util.zip.DataFormatException;

/**
 *
 * @author ttthu
 */
public class WeddingHall implements Serializable {

    private static int count = 0; // biến đếm ID
    private String id;
    private String name;
    private double price;
    private int floor;
    private int capacity;
    private DayOfWeek dayOfWeek;
    private TimeOfDay timeOfDay;
    private int countRental = 1;

    {
        this.id = String.format("S%03d", count++);
    }

    public WeddingHall() {
    }

    public WeddingHall(String name, int floor, int capacity, String dateRental, DayOfWeek dayOfWeek, TimeOfDay timeOfDay) {
        this.name = name;
        this.price = price;
        this.floor = floor;
        this.capacity = capacity;
        this.dayOfWeek = dayOfWeek;
        this.timeOfDay = timeOfDay;
    }

    // Hàm nhập thông tin sảnh
    public void input() {
        System.out.println("Nhap Thong Tin Sanh: ");
        System.out.println("Ten: ");
        this.name = Configuration.sc.nextLine().toUpperCase();
        while (true) {
            try {
                System.out.println("Nhap ngay trong tuan (MONDAY, TUESDAY, etc.): ");
                this.dayOfWeek = DayOfWeek.valueOf(Configuration.sc.nextLine().toUpperCase());
                System.out.println("Nhap buoi trong ngay (MORNING, AFTERNOON, EVENING): ");
                this.timeOfDay = TimeOfDay.valueOf(Configuration.sc.nextLine().toUpperCase());
                System.out.println("Tang: ");
                this.floor = Configuration.sc.nextInt();
                System.out.println("Suc chua: ");
                this.capacity = Configuration.sc.nextInt();
                break;
            } catch (IllegalArgumentException e) {
                System.err.println("Vui long nhap dung !!!");
            } catch (InputMismatchException e) {
                System.err.println("Vui long nhap so!!!");
            } catch (Exception e) {
                System.out.println("Vui long nhap dung dinh dang!");
            }

        }

    }

    // Hàm xuất thông tin sảnh
    public void print() {
        System.out.println(" --- Thong Tin Sanh Thue --- ");
        System.out.println("Ma: " + this.id);
        System.out.println("Ten: " + this.name);
        System.out.println("Tang: " + this.floor);
        System.out.println("Suc chua: " + this.capacity);
        System.out.println("Ngay thue: " + this.dayOfWeek);
        System.out.println("Buoi thue: " + this.timeOfDay);
        System.out.println("Gia: " + calculateRentalPrice());
    }

    public void printForCountRental() {
        System.out.println("Ten: " + this.name);
        System.out.println("Duoc thue: " + this.countRental);
    }

    // Hàm tính giá thuê dựa trên ngày và buổi
    public double calculateRentalPrice() {
        return dayOfWeek.getDayPrice() * timeOfDay.getTimePrice();
    }

    // Điều kiện so sánh 2 đối tượng
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.name);
        hash = 61 * hash + this.floor;
        hash = 61 * hash + Objects.hashCode(this.dayOfWeek);
        hash = 61 * hash + Objects.hashCode(this.timeOfDay);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final WeddingHall other = (WeddingHall) obj;
        if (this.floor != other.floor) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.dayOfWeek != other.dayOfWeek) {
            return false;
        }
        return this.timeOfDay == other.timeOfDay;
    }

    public int increaseCountRental() {
        return countRental++;
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

    public int getCountRental() {
        return countRental;
    }

    public void setCountRental(int countRental) {
        this.countRental = countRental;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
