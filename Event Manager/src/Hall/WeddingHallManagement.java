/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hall;

import Hall.Time.TimeOfDay;
import Hall.Time.DayOfWeek;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.zip.DataFormatException;

/**
 *
 * @author ttthu
 */
public class WeddingHallManagement {
    private List<WeddingHall> list;

    public WeddingHallManagement() {
        list = new ArrayList<>();
    }

    // Them 
   public void addHall(WeddingHall...h){
       this.list.addAll(Arrays.asList(h));
   }
    
    public void addHall() throws ParseException, DataFormatException{
        WeddingHall h = new WeddingHall();
        h.input();
        this.list.add(h);
    }
    
    // Xuat danh sach
    public void printList(){
        this.list.forEach(h -> h.print());
    }
    
    // Xoa 
    public void removeHall(WeddingHall h){
        this.list.remove(h);
    }
    
    public void removeHall(String kw){
        this.list.removeIf(s -> s.getName().equals(kw));
    }
    
    // Cap nhat 
    public void upDate(String name, int floor, int capacity, DayOfWeek dayOfWeek, TimeOfDay timeOfDay){
        for(WeddingHall h : list){
            if(h.getName().equals(name)){
                h.print();
                h = new WeddingHall(name, floor, capacity, dayOfWeek, timeOfDay);
            }
        }
    }
    
    // Tim kiem
    public List<WeddingHall> findHall(String kw){
        return list.stream().filter(h -> h.getName().contains(kw)).collect(Collectors.toList());
    }
    
    public double priceRentalHall(){
        return this.list.stream().flatMapToDouble(p -> DoubleStream.of(p.calculateRentalPrice())).sum();
    }
    
    
    // Sap xep danh sach giam dan theo so lan duoc thue
    
}
