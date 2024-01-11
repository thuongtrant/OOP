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
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
        h.bookingEvent();
        this.list.add(h);
    }

    // Xuất danh sách đặt tiệc
    public void printList() {
        this.list.forEach(h -> h.print());
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

    public void sortHallByRentalCount() {
        //Lấy danh sách sảnh được thuê trong danh sách booking
        List<WeddingHall> halls = new ArrayList<>();
        for (Booking booking : list) {
            halls.addAll(booking.getListHall().getList());
        }

        // Đếm số lần thuê của sảnh dựa theo tên
       halls.forEach(hall -> 
       halls.stream().filter(otherHall -> hall.getName().equals(otherHall.getName()))
       .forEach(WeddingHall::increaseCountRental));
       
        Collections.sort(halls, Comparator.comparing(WeddingHall::getCountRental).reversed());

        // In ra danh sách đã sắp xếp
        Set<String> printedNames = new HashSet<>();
        for (WeddingHall hall : halls) {
            String hallName = hall.getName();
            if (!printedNames.contains(hallName)) {
                hall.printForCountRental();
                printedNames.add(hallName);
            }
        }
        
    }

    public void sortHallByRentalCount(int year) {

        List<WeddingHall> hallByYear = new ArrayList<>();
        for (Booking booking : list) {
            if (booking.getDateRental().getYear() == year) {
                hallByYear.addAll(booking.getListHall().getList());
            }
        }

        // Đếm số lần thuê của sảnh dựa theo tên
       hallByYear.forEach(hall -> 
       hallByYear.stream().filter(otherHall -> hall.getName().equals(otherHall.getName()))
       .forEach(WeddingHall::increaseCountRental));
       
        Collections.sort(hallByYear, Comparator.comparing(WeddingHall::getCountRental).reversed());

        // In ra danh sách đã sắp xếp
        Set<String> printedNames = new HashSet<>();
        for (WeddingHall hall : hallByYear) {
            String hallName = hall.getName();
            if (!printedNames.contains(hallName)) {
                hall.printForCountRental();
                printedNames.add(hallName);
            }
        }
    }

    public void reportRevenueByMonth() {

        IntStream.range(1, 13)
                //Ánh xạ mỗi tháng thành một đối tượng String chứa thông tin thống kê doanh thu của tháng đó.
                .mapToObj(month -> {
                    List<Booking> bookings = list.stream()
                            .filter(booking -> booking.getDateRental().getMonthValue() == month)
                            .collect(Collectors.toList());

                    DoubleSummaryStatistics totalRevenue = bookings.stream()
                            .collect(Collectors.summarizingDouble(Booking::totalRentalPrice));

                    return "Thang " + month + ": \n"
                            + "  Tong doanh thu: " + totalRevenue.getSum() + "\n"
                            + "  Trung binh doanh thu: " + totalRevenue.getAverage() + "\n"
                            + "  So luong don dat tiec: " + totalRevenue.getCount() + "\n"
                            + "  Doanh thu cao nhat: " + totalRevenue.getMax() + "\n"
                            + "  Doanh thu thap nhat: " + totalRevenue.getMin();
                })
                .forEach(System.out::println);
    }

    public void reportRevenueByQuarter() {
        IntStream.range(1, 5)
                .mapToObj(quarter -> {
                    List<Booking> bookings = list.stream()
                            .filter(booking -> (booking.getDateRental().getMonthValue() - 1) / 3 + 1 == quarter)
                            .collect(Collectors.toList());

                    DoubleSummaryStatistics totalRevenue = bookings.stream()
                            .collect(Collectors.summarizingDouble(Booking::totalRentalPrice));

                    return "Quy " + quarter + ": \n"
                            + "  Tong doanh thu: " + totalRevenue.getSum() + "\n"
                            + "  Trung binh doanh thu: " + totalRevenue.getAverage() + "\n"
                            + "  So luong don dat tiec: " + totalRevenue.getCount() + "\n"
                            + "  Doanh thu cao nhat: " + totalRevenue.getMax() + "\n"
                            + "  Doanh thu thap nhat: " + totalRevenue.getMin();
                })
                .forEach(System.out::println);
    }

}
