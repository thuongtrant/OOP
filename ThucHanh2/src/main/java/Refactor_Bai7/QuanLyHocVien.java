/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Refactor_Bai7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author ttthu
 */
public class QuanLyHocVien {
    private List<HocVien> ds = new ArrayList<>();

    public QuanLyHocVien() {
    }
    
    public void themHV(HocVien...a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    public void themHV(){
        HocVien h = new HocVien();
        h.nhap1Hv();
        this.ds.add(h);
    }
    
    public void hienThiDs(){
        this.ds.forEach(h -> h.xuat1Hv());
    }
    
    public void nhapDiemDs(){
        this.ds.forEach(h -> 
        {System.out.printf("Nhap diem cho hoc vien %s\n ", h.getTenHV().toUpperCase());
        h.nhapDiemHv();
        });
    }
    
    public void docDsHv() throws FileNotFoundException{
        File f = new File("src/main/resources/hv.txt");
        try(Scanner scan = new Scanner(f)){
            while(scan.hasNext()){
                String t = scan.nextLine();
                String ns = scan.nextLine();
                String qq = scan.nextLine();
                HocVien h = new HocVien(t,ns,qq);
                this.ds.add(h);
            }
        }
    
    }
    
     public HocVien timKiem(int maHV){
         return this.ds.stream().filter(h -> h.getMaHV() == maHV).findFirst().get();
    }
     
     public List<HocVien> timKiem(String keyWord){
         return this.ds.stream().filter(h -> h.getTenHV().contains(keyWord)).collect(Collectors.toList());
     }
     
     public List<HocVien> timHB(){
         return this.ds.stream().filter(h -> h.isHocBong()).collect(Collectors.toList());
     }
     
     public void sapXepDiem(){
         this.ds.sort((h1,h2) -> -h1.soSanhDiem(h2));
     }
}
