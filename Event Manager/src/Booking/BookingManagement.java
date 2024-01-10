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
import java.util.stream.IntStream;

/**
 *
 * @author ttthu
 */
public class BookingManagement {

    private List<Booking> list;
    

    public BookingManagement() {
        list = new ArrayList<>();
    }
    
    //Thêm sảnh
    public void add() {
        Booking h = new Booking();
        h.BookingEvent();
        this.list.add(h);
    }

    // Xuất danh sách đặt tiệc
    public void printList() {
        this.list.forEach(h -> h.print());
    }

    // Xóa đặt tiệc 
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
    
   
    
 public void reportRevenueByMonth() {
        // Calculate revenue by month
        System.out.println("Revenue by Month:");
        IntStream.range(1, 13)
                .mapToObj(month -> {
                    List<Booking> bookings = list.stream()
                            .filter(booking -> booking.getDateRental().getMonthValue() == month)
                            .collect(Collectors.toList());
                    double totalRevenue = bookings.stream()
                            .mapToDouble(Booking::totalRentalPrice)
                            .sum();
                    return "Thang: " + totalRevenue;
                })
                .forEach(System.out::println);

        
    }
 public void reportRevenueByQuarter(){
 // Calculate revenue by quarter
        System.out.println("Revenue by Quarter:");
        IntStream.range(1, 5)
                .mapToObj(quarter -> {
                    List<Booking> bookings = list.stream()
                            .filter(booking -> (booking.getDateRental().getMonthValue() - 1) / 3 + 1 == quarter)
                            .collect(Collectors.toList());
                    double totalRevenue = bookings.stream()
                            .mapToDouble(Booking::totalRentalPrice)
                            .sum();
                    return "Quy %-3d:" + quarter + ": " + totalRevenue;
                })
                .forEach(System.out::println);
 }
}
