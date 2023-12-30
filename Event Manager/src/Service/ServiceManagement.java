/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;

/**
 *
 * @author ttthu
 */
public class ServiceManagement {

    List<Service> list;

    public ServiceManagement() {
        list = new ArrayList<>();
    }

    // Them 
    public void addService(Service... s) {
        this.list.addAll(Arrays.asList(s));
    }

    public void addService() {
        String luaChon = null;
        do {
            System.out.println("1. Karaoke");
            System.out.println("2. Decoration");
            System.out.println("3. Singer");
            System.out.print("Chon loai dich vu: ");
            int service = Configuration.sc.nextInt();
            Configuration.sc.nextLine(); // Đọc bỏ dòng newline

            switch (service) {
                case 1:
                    Service karaoke = new ServiceKaraoke();
                    karaoke.input();
                    list.add(karaoke);
                    break;
                case 2:
                    Service decoration = new ServiceDecoration();
                    decoration.input();
                    list.add(decoration);
                    break;
                case 3:
                    Service singer = new ServiceSinger();
                    singer.input();
                    list.add(singer);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Mời nhập lại.");
                    continue;
            }

            System.out.print("Ban co muon dich vu khac khong? (Y/N): ");
            luaChon = Configuration.sc.nextLine();
        } while (luaChon.equalsIgnoreCase("Y"));
    }

    // Xuat danh sach
    public void printList() {
        this.list.forEach(h -> h.print());
    }

    // Xoa 
    public void removeService(Service h) {
        this.list.remove(h);
    }

    public void removeService(String kw) {
        this.list.removeIf(s -> s.getName().equals(kw));
    }

    // Tinh tong dich vu
    public double priceService() {
        return this.list.stream().flatMapToDouble(p -> DoubleStream.of(p.calculatePrice())).sum();
    }
}
