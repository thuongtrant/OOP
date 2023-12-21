/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
   public void addService(Service...s){
       this.list.addAll(Arrays.asList(s));
   }
    
    
    
    // Xuat danh sach
    public void printList(){
        this.list.forEach(h -> h.print());
    }
    
    // Xoa 
    public void removeService(Service h){
        this.list.remove(h);
    }
    
    public void removeService(String kw){
        this.list.removeIf(s -> s.getName().equals(kw));
    }
}
