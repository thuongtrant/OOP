/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;
import Control.Configuration;
import Control.Management;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 *
 * @author ttthu
 */
public class ServiceManagement implements Management{

    List<Service> list;

    public ServiceManagement() {
        list = new ArrayList<>();
    }

    // Them 
    public void add(Service... s) {
        this.list.addAll(Arrays.asList(s));
    }

    @Override
    public void add() {
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
    public void remove(Service h) {
        this.list.remove(h);
    }

    @Override
    public void remove(String kw) {
        this.list.removeIf(s -> s.getName().equals(kw));
    }

       // Tim kiem
    public List<Service> findMenu(String kw) {
        return list.stream().filter(h -> h.getName().contains(kw)).collect(Collectors.toList());
    }
    
    
    // Tinh tong dich vu
    @Override
    public double priceSum() {
        return this.list.stream().flatMapToDouble(p -> DoubleStream.of(p.calculatePrice())).sum();
    }

      @Override
    public void upDate(String id) {
//        int ID = Integer.parseInt(id);
          Service existingService = findServiceById(id);
        if(existingService != null){
            System.out.println("Thong tin hien tai: ");
            existingService.print();
            if(existingService instanceof ServiceKaraoke){
                ServiceKaraoke s = new ServiceKaraoke();
                s.input();
                existingService.setName(s.getName());
                ((ServiceKaraoke) existingService).setTime(s.getTime());
                
            }else if(existingService instanceof ServiceDecoration){
                ServiceDecoration d = new ServiceDecoration();
                d.input();
                existingService.setName(d.getName());
            }else if(existingService instanceof ServiceSinger){
                ServiceSinger s = new ServiceSinger();
                s.input();
                existingService.setName(s.getName());
                ((ServiceSinger) existingService).setSingerName(s.getSingerName());
                ((ServiceSinger) existingService).setCountSong(s.getCountSong());
            
            }
            
        }else {
            System.out.println("Khong tim thay !!!");
        }
      
    }

    private Service findServiceById(String kw) {
        for (Service m : list) {
            if (m.getName().equalsIgnoreCase(kw)) {
                return m;
            }
        }
        return null;
    }

}
