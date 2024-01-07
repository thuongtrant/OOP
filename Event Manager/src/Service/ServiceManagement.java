/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Control.Configuration;
import Control.IOFile;
import Control.Management;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 *
 * @author ttthu
 */
public class ServiceManagement implements Management, Serializable {

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
                    System.out.println("Lua chon khong hop le. Vui long nhap lai!!!");
                    continue;
            }

            System.out.print("Ban co muon dich vu khac khong? (Y/N): ");
            luaChon = Configuration.sc.nextLine();
        } while (luaChon.equalsIgnoreCase("Y"));
    }

    // Xuat danh sach
    @Override
    public void printList() {
        this.list.forEach(h -> h.print());
    }

    // Xoa dựa theo đối tượng truyền vào
    public void remove(Service h) {
        this.list.remove(h);
    }

    // Xóa dựa theo tên
    @Override
    public void remove(String kw) {
        this.list.removeIf(s -> s.getName().contains(kw));
    }

    // Tìm kiếm dựa theo tên
    public List<Service> findService(String kw) {
        return list.stream().filter(h -> h.getName().contains(kw)).collect(Collectors.toList());
    }

    // Tính tổng dịch vụ
    @Override
    public double priceSum() {
        return this.list.stream().flatMapToDouble(p -> DoubleStream.of(p.calculatePrice())).sum();
    }

    // Cập nhật thông tin dựa trên tên 
    @Override
    public void upDate(String id) {
//        int ID = Integer.parseInt(id);
        Service existingService = findServiceById(id);
        if (existingService != null) {
            System.out.println("Thong tin hien tai: ");
            existingService.print();
            if (existingService instanceof ServiceKaraoke) {
                ServiceKaraoke s = new ServiceKaraoke();
                s.input();
                existingService.setName(s.getName());
                ((ServiceKaraoke) existingService).setTime(s.getTime());

            } else if (existingService instanceof ServiceDecoration) {
                ServiceDecoration d = new ServiceDecoration();
                d.input();
                existingService.setName(d.getName());
            } else if (existingService instanceof ServiceSinger) {
                ServiceSinger s = new ServiceSinger();
                s.input();
                existingService.setName(s.getName());
                ((ServiceSinger) existingService).setSingerName(s.getSingerName());
                ((ServiceSinger) existingService).setCountSong(s.getCountSong());

            }

        } else {
            System.out.println("Khong tim thay !!!");
        }

    }

    // Hàm trả về đối tượng cần tìm (Hỗ trợ hàm upDate() )
    private Service findServiceById(String kw) {
        for (Service m : list) {
            if (m.getName().equalsIgnoreCase(kw)) {
                return m;
            }
        }
        return null;
    }

    public void setList(List<Service> list) {
        this.list = list;
    }

    @Override
    public void writeFile(String fileName) {
        IOFile.write(fileName, list);
    }

    @Override
    public void readFile(String fileName) {
        setList(IOFile.read(fileName));

    }

}
