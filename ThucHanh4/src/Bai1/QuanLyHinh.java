/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 *
 * @author ttthu
 */
public class QuanLyHinh {
    private List<Hinh> list = new ArrayList<>();

    public QuanLyHinh() {
    }
    
    public void them(Hinh...h){
        this.list.addAll(Arrays.asList(h));
    }
    public void xoa(String kw){
        this.list.removeIf(h -> h.getName().contains(kw));
    }
    public void hienThi(){
        this.list.forEach(h -> System.out.println(h));
    }
    public void xepGiamDienTich(){
        this.list.sort(Comparator.comparing(Hinh::tinhDienTich).reversed());
    }
    public void xepTangTheoTen(){
        this.list.sort(Comparator.comparing(Hinh::getName).thenComparing(Hinh::tinhDienTich).reversed());
    }
   public List<Hinh> timTheoLoai(String classPath)throws ClassNotFoundException{
       Class c = Class.forName(classPath);
        return this.list.stream().filter(h -> c.isInstance(h)).collect(Collectors.toList());
   }
   public int timHinh(Hinh h){
       return this.list.indexOf(h);
   }
   public double tinhDtTb(){
   return this.list.stream().flatMapToDouble(t -> DoubleStream.of(t.tinhDienTich())).average().getAsDouble();
   }
}
