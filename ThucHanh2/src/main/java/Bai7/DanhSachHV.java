/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author ttthu
 */
public class DanhSachHV {
    private List<HocVien> danhSachHV = new ArrayList<>();
    
    public void themHV(HocVien hocVien){
        danhSachHV.add(hocVien);
    }
    
    public void nhapDiem(int maHV, double diemToan, double diemVan, double diemAnh){
        for(HocVien hv : danhSachHV){
            if(hv.getMaHV() == maHV){
                hv.nhapDiem(diemToan, diemVan, diemAnh);
                break;
            }
        }
    }
    
    public void hienThiDS(){
        for(HocVien hv : danhSachHV){
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Ma hoc vien: " + hv.getMaHV());
            System.out.println("Ho va ten: " + hv.getHoTen());
            System.out.println("Que quan: " + hv.getQueQuan());
            System.out.println("Ngay sinh: " + dateFormat.format(hv.getNgaySinh()));
            System.out.println("Diem toan: " + hv.getDiemToan());
            System.out.println("Diem van: " + hv.getDiemVan());
            System.out.println("Diem anh: " + hv.getDiemAnh());
            System.out.println("Diem TB: " + hv.tinhDiemTB());
        }
    }
    
    public HocVien timKiemHV(int maHV){
        for(HocVien hv : danhSachHV){
            if(hv.getMaHV() == maHV)
                return hv;
        }
        return null;
    }
    
       public HocVien timKiemHV(String hoTen){
        for(HocVien hv : danhSachHV){
            if(hv.getHoTen().equalsIgnoreCase(hoTen))
                return hv;
        }
        return null;
    }
       
        public HocVien timKiemTheoQueQuan(String queQuan){
        for(HocVien hv : danhSachHV){
            if(hv.getQueQuan().equalsIgnoreCase(queQuan))
                return hv;
        }
        return null;
    }   
        
    public void sapXepTheoDiem(){
        danhSachHV.sort(Comparator.comparingDouble(HocVien::tinhDiemTB).reversed());
    }
    
    public void dsDatHocBong() throws FileNotFoundException{
        try(PrintWriter writer = new PrintWriter("D:\\Users\\ttthu\\OneDrive\\Documents\\NetBeansProjects\\ThucHanh2\\src\\main\\java\\Bai7\\HocBong.txt")){
            for(HocVien hv : danhSachHV)
                if(hv.tinhDiemTB() >= 8.0 && hv.getDiemToan() > 5 && hv.getDiemAnh() > 5 && hv.getDiemVan() > 5)
                    writer.println(hv.getMaHV() + " - " + hv.getHoTen() + " - " + hv.tinhDiemTB());
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public void thongKeDoTuoi(){
        int coutUnder18 = 0;
        int count18to23 = 0;
        int countAbove24 = 0;
        
        for(HocVien hv : danhSachHV){
            Calendar cal = Calendar.getInstance();
            cal.setTime(hv.getNgaySinh());
            int yearOfBirth = cal.get(Calendar.YEAR);
            int currentYear = Calendar.getInstance().get(Calendar.YEAR);
            int age = currentYear - yearOfBirth;
            
            if(age < 18)
                coutUnder18++;
            else if(age >= 18 && age <=23)
                count18to23++;
            else
                countAbove24++;
        
            System.out.println("So luong hoc vien duoi 18 tuoi: " + coutUnder18);
            System.out.println("So luong hoc vien tu 18 den 23 tuoi:" + count18to23);
            System.out.println("So luong hoc vien tren 24tuoi: " + countAbove24);
    }

        }
    }

