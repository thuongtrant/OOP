/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

/**
 *
 * @author ttthu
 */
import Control.Management;
import Control.Configuration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 *
 * @author ttthu
 */
public class MenuManagement implements Management {

    List<MenuItem> list;

    public MenuManagement() {
        list = new ArrayList<>();
    }
    // Them 

    public void add(MenuItem... m) {
        this.list.addAll(Arrays.asList(m));
    }

    public void add(MenuItem m) {
        this.list.add(m);
    }

    @Override
    public void add() {
        String luaChon = null;
        do {
            System.out.println("1. Them thuc an");
            System.out.println("2. Them thuc uong");
            System.out.print("Chon loai mon: ");
            int loaiMon = Configuration.sc.nextInt();
            Configuration.sc.nextLine(); // Đọc bỏ dòng newline

            switch (loaiMon) {
                case 1:
                    Food monAn = new Food();
                    monAn.input();
                    list.add(monAn);
                    break;
                case 2:
                    Drink thucUong = new Drink();
                    thucUong.input();
                    list.add(thucUong);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Mời nhập lại.");
                    continue;
            }

            System.out.print("Ban co muon them mon khac khong? (Y/N): ");
            luaChon = Configuration.sc.nextLine();
        } while (luaChon.equalsIgnoreCase("Y"));

    }

    // Xuat danh sach
    public void printList() {
        this.list.forEach(h -> h.print());
    }

    // Xoa 
    public void remove(MenuItem m) {
        this.list.remove(m);
    }

    @Override
    public void remove(String kw) {
        this.list.removeIf(s -> s.getName().equals(kw));
    }

    // Tinh tong dich vu
    @Override
    public double priceSum() {
        return this.list.stream().flatMapToDouble(p -> DoubleStream.of(p.calculatePrice())).sum();
    }

    @Override
    public void upDate(String id) {
//        int ID = Integer.parseInt(id);
        MenuItem existingMenu = findMenuById(id);
        if(existingMenu != null){
            System.out.println("Thong tin hien tai: ");
            existingMenu.print();
            if(existingMenu instanceof Food){
                Food m = new Food();
                m.input();
                existingMenu.setName(m.getName());
                existingMenu.setPrice(m.getPrice());
//                ((Food) existingMenu).setIsVegetarian(m.isVegetarian());
                
            }else if(existingMenu instanceof Drink){
                Drink m = new Drink();
                m.input();
                existingMenu.setName(m.getName());
                existingMenu.setPrice(m.getPrice());
                ((Drink) existingMenu).setManufacturer(m.getManufacturer());
            }
            
        }else {
            System.out.println("Khong tim thay !!!");
        }
      
    }

    private MenuItem findMenuById(String kw) {
        for (MenuItem m : list) {
            if (m.getName().equalsIgnoreCase(kw)) {
                return m;
            }
        }
        return null;
    }

     // Tim kiem
    public List<MenuItem> findMenu(String kw) {
        return list.stream().filter(h -> h.getName().contains(kw)).collect(Collectors.toList());
    }
    
    
//    @Override
//    public void upDate(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
