/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Booking;

import Control.IOFile;
import Control.Management;
import Hall.WeddingHall;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 *
 * @author ttthu
 */
public class BookingManagement implements Management {

    private List<Booking> list;

    public BookingManagement() {
        list = new ArrayList<>();
    }

    // Thêm nhiều sảnh 
    public void add(Booking... h) {
        this.list.addAll(Arrays.asList(h));
    }

    // Thêm một sảnh nhập từ bàn phím
    @Override
    public void add() {
        Booking h = new Booking();
        h.input();
        this.list.add(h);

    }

    // Xuất danh sách thue sanh
    @Override
    public void printList() {
        this.list.forEach(h -> h.print());
    }

    // Xóa thue 
    public void remove(Booking h) {
        this.list.remove(h);
    }

    @Override
    public void remove(String kw) {
        this.list.removeIf(s -> s.getNameEvent().contains(kw));
    }

    // Tra cứu thuê theo tên
    public List<Booking> find(String kw) {
        return list.stream().filter(h -> h.getNameEvent().contains(kw)).collect(Collectors.toList());
    }

    // Ghi file
    @Override
    public void writeFile(String fileName) {
        IOFile.write(fileName, list);

    }

    // Đọc file
    @Override
    public void readFile(String fileName) {
        setList(IOFile.read(fileName));

    }

    @Override
    public void upDate(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double priceSum() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setList(List<Booking> list) {
        this.list = list;
    }

}
