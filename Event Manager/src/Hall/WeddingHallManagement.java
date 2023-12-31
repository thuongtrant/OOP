/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hall;

import Control.Management;
import Hall.Time.*;
import Control.Configuration;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.zip.DataFormatException;

/**
 *
 * @author ttthu
 */
public class WeddingHallManagement implements Management {

    private List<WeddingHall> list;

    public WeddingHallManagement() {
        list = new ArrayList<>();
    }

    // Them 
    public void add(WeddingHall... h) {
        this.list.addAll(Arrays.asList(h));
    }

    @Override
    public void add() {
        WeddingHall h = new WeddingHall();
        h.input();
        this.list.add(h);
    }

    // Xuat danh sach
    public void printList() {
        this.list.forEach(h -> h.print());
    }

    // Xoa 
    public void remove(WeddingHall h) {
        this.list.remove(h);
    }

    @Override
    public void remove(String kw) {
        this.list.removeIf(s -> s.getName().equals(kw));
    }

    // Cap nhat 
//    public void upDate(String name, int floor, int capacity, DayOfWeek dayOfWeek, TimeOfDay timeOfDay) {
//        for (WeddingHall h : list) {
//            if (h.getName().equals(name)) {
//                h.print();
//                h = new WeddingHall(name, floor, capacity, dayOfWeek, timeOfDay);
//            }
//        }
//    }
    // Tim kiem
    public List<WeddingHall> findHall(String kw) {
        return list.stream().filter(h -> h.getName().contains(kw)).collect(Collectors.toList());
    }

    @Override
    public double priceSum() {
        return this.list.stream().flatMapToDouble(p -> DoubleStream.of(p.calculateRentalPrice())).sum();
    }

    // Sap xep danh sach giam dan theo so lan duoc thue
   

    // Phương thức cập nhật thông tin sảnh cưới dựa trên id và người dùng nhập liệu mới từ bàn phím
    @Override
    public void upDate(String id) {
        WeddingHall existingWeddingHall = findWeddingHallById(id);

        if (existingWeddingHall != null) {
            // Hiển thị thông tin hiện tại của sảnh cưới
            System.out.println("Thong tin sanh cuoi hien tai:");
            existingWeddingHall.print();
            // Nhập liệu mới từ người dùng
            WeddingHall updatedWeddingHall = new WeddingHall();
            updatedWeddingHall.input();

            // Cập nhật thông tin sảnh cưới
            existingWeddingHall.setName(updatedWeddingHall.getName());
            existingWeddingHall.setFloor(updatedWeddingHall.getFloor());
            existingWeddingHall.setCapacity(updatedWeddingHall.getCapacity());
            existingWeddingHall.setDateRental(updatedWeddingHall.getDateRental());
            existingWeddingHall.setDayOfWeek(updatedWeddingHall.getDayOfWeek());
            existingWeddingHall.setTimeOfDay(updatedWeddingHall.getTimeOfDay());

        } else {
            System.out.println("Khong tim thay sanh cuoi voi ID:  " + id);
        }
    }

    private WeddingHall findWeddingHallById(String id) {
        for (WeddingHall weddingHall : list) {
            if (weddingHall.getId().equals(id)) {
                return weddingHall;
            }
        }
        return null;
    }

    

}
