/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Menu;

/**
 *
 * @author ttthu
 */
import Service.Configuration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

/**
 *
 * @author ttthu
 */
public class MenuManagement {
    List<MenuItem> list;

    public MenuManagement() {
        list = new ArrayList<>();
    }
      // Them 
   public void addMenu(MenuItem...m){
       this.list.addAll(Arrays.asList(m));
   }
   public void addMenu(MenuItem m ){
       this.list.add(m);
   }
   public void addMenu(){
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
    public void printList(){
        this.list.forEach(h -> h.print());
    }
    
    // Xoa 
    public void removeMenu(MenuItem m){
        this.list.remove(m);
    }
    
    public void removeMenu(String kw){
        this.list.removeIf(s -> s.getName().equals(kw));
    }
    
    // Tinh tong dich vu
    public double priceMenu(){
        return this.list.stream().flatMapToDouble(p -> DoubleStream.of(p.calculatePrice())).sum();
    }
}

