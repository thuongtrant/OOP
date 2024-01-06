/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Booking;

import Control.IOFile;
import Control.Management;
import Hall.WeddingHall;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 *
 * @author ttthu
 */
public class BookingManagement {

    private List<Booking> list;
    private double[] revenueByMonth = new double[12];
    private double[] revenueByQuarter = new double[4];
    

    public BookingManagement() {
        list = new ArrayList<>();
    }

    // Thêm nhiều sảnh 
    public void add(Booking... h) {
        this.list.addAll(Arrays.asList(h));
    }

    // Thêm một sảnh nhập từ bàn phím
//    @Override
//    public void add() {
//        Booking h = new Booking();
//        h.input();
//        this.list.add(h);
//    }
   
    public void add() {
        Booking h = new Booking();
        h.thueSanh();
        this.list.add(h);
    }

    // Xuất danh sách thue sanh
  
    public void printList() {
        this.list.forEach(h -> h.print());
    }

   
    // Xóa thue 
    public void remove(Booking h) {
        this.list.remove(h);
    }

    public void remove(String kw) {
        this.list.removeIf(s -> s.getNameEvent().contains(kw));
    }

    // Tra cứu thuê theo tên
    public List<Booking> find(String kw) {
        return list.stream().filter(h -> h.getNameEvent().contains(kw)).collect(Collectors.toList());
    }

    // Ghi file
    
    public void writeFile(String fileName) {
        IOFile.write(fileName, list);

    }

    // Đọc file
    
    public void readFile(String fileName) {
        setList(IOFile.read(fileName));

    }
  

    public void setList(List<Booking> list) {
        this.list = list;
    }

    public List<Booking> getList() {
        return list;
    }
     public void reportRevenue() {
        for (Booking booking : list) {
            int month = booking.getDateRental().getMonthValue() - 1;
            int quarter = (month / 3);

            double totalRevenue = booking.totalRentalPrice();

            revenueByMonth[month] += totalRevenue;
            revenueByQuarter[quarter] += totalRevenue;
        }
    }

    public void printRevenueByMonth() {
        System.out.println("Doanh thu theo thang:");
        for (int i = 0; i < revenueByMonth.length; i++) {
            System.out.println("Thang " + (i + 1) + ": " + revenueByMonth[i] + " VND");
        }
    }

    public void printRevenueByQuarter() {
        System.out.println("Doanh thu theo quy:");
        for (int i = 0; i < revenueByQuarter.length; i++) {
            System.out.println("Quy " + (i + 1) + ": " + revenueByQuarter[i] + " VND");
        }
    }
    // Tính tổng số lần thuê cho mỗi sảnh
    private Map<String, Integer> calculateTotalRentalCount() {
        Map<String, Integer> rentalCountMap = new HashMap<>();
        for (Booking booking : list) {
            for (WeddingHall hall : booking.getListHall().getList()) {
                String hallName = hall.getName();
                int currentCount = rentalCountMap.getOrDefault(hallName, 0);
                rentalCountMap.put(hallName, currentCount + 1);
            }
        }
        return rentalCountMap;
    }

    // In danh sách sảnh và số lần được đặt thuê
    public void printRentalCount() {
        Map<String, Integer> rentalCountMap = calculateTotalRentalCount();
        rentalCountMap.forEach((hallName, count)
                -> System.out.println("Sanh " + hallName + ", so lan thue : " + count));
    }

    // Tra cứu theo năm
    public void findHallRentalCountByYear(int year) {
        Map<String, Integer> rentalCountMap = calculateTotalRentalCount();
        rentalCountMap.entrySet().stream()
                .filter(entry -> list.stream()
                .anyMatch(booking -> booking.getListHall().getList().stream()
                .anyMatch(hall -> hall.getName().equals(entry.getKey())
                && booking.getDateRental().getYear() == year)))
                .forEach(entry -> System.out.println("Sanh " + entry.getKey() + ", so lan thue: " + entry.getValue()));
    }

}
