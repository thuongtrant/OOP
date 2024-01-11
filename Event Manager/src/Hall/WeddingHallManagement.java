/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hall;

import Control.Management;
import Hall.Time.*;
import Control.Configuration;
import Control.IOFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.zip.DataFormatException;

/**
 *
 * @author ttthu
 */
public class WeddingHallManagement implements Management, Serializable {

    private List<WeddingHall> list;

    public WeddingHallManagement() {
        list = new ArrayList<>();
    }

    // Thêm nhiều sảnh 
    public void add(WeddingHall... h) {
        this.list.addAll(Arrays.asList(h));
    }

    // Thêm một sảnh nhập từ bàn phím
    @Override
    public void add() {
        WeddingHall h = new WeddingHall();
        h.input();
        // Kiểm tra sảnh đã được thuê hay chưa
        if (list.contains(h)) {
            System.out.println("Xin loi! Sanh nay da duoc thue.");
        } else {
            this.list.add(h);
        }

    }

    public List<WeddingHall> getList() {
        return list;
    }

    // Xuất danh sách các sảnh
    @Override
    public void printList() {
        this.list.forEach(h -> h.print());
    }

    // Xóa sảnh 
    public void remove(WeddingHall h) {
        this.list.remove(h);
    }

    @Override
    public void remove(String kw) {
        this.list.removeIf(s -> s.getName().contains(kw));
    }

    // Tra cứu sảnh theo tên
    public List<WeddingHall> findHall(String kw) {
        return list.stream().filter(h -> h.getName().contains(kw)).collect(Collectors.toList());
        
    }

    // Tra cứu sảnh theo sức chứa
    public List<WeddingHall> findHall(int capacity) {
        return list.stream().filter(h -> h.getCapacity() == capacity).collect(Collectors.toList());
    }

    // Tra cứu sảnh theo vị trí sảnh
    public List<WeddingHall> findHallByFloor(int floor) {
        return list.stream().filter(h -> h.getFloor() == floor).collect(Collectors.toList());
    }

    // Tính tổng tiền thuê danh sách sảnh
    @Override
    public double priceSum() {
        return this.list.stream().flatMapToDouble(p -> DoubleStream.of(p.calculateRentalPrice())).sum();
    }

    // Cập nhật thông tin sảnh dựa trên id
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
            existingWeddingHall.setDayOfWeek(updatedWeddingHall.getDayOfWeek());
            existingWeddingHall.setTimeOfDay(updatedWeddingHall.getTimeOfDay());

        } else {
            System.out.println("Khong tim thay sanh cuoi voi ID:  " + id);
        }
    }

    // Hàm trả về đối tượng cần tìm (Hỗ trợ hàm upDate() )
    private WeddingHall findWeddingHallById(String id) {
        for (WeddingHall weddingHall : list) {
            if (weddingHall.getId().equals(id)) {
                return weddingHall;
            }
        }
        return null;
    }

    public void setList(List<WeddingHall> list) {
        this.list = list;
    }

    // Ghi file
    @Override
    public void writeFile(String fileName) {
        IOFile.write(fileName, this.list);

    }

    // Đọc file
    @Override
    public void readFile(String fileName) {
        setList(IOFile.read(fileName));
    }


    

}
