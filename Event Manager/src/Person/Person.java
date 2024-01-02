/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person;
import Control.Configuration;
/**
 *
 * @author ttthu
 */
public class Person {
    private String name;
    private String adress;
    private String numberPhone;

    public Person(String name, String adress, String numberPhone) {
        this.name = name;
        this.adress = adress;
        this.numberPhone = numberPhone;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }
    
    public void input(){
        System.out.println("Nhap thong tin khach hang");
        System.out.println("Ten: ");
        this.name = Configuration.sc.nextLine();
        System.out.println("Dia chi: ");
        this.adress = Configuration.sc.nextLine();
        System.out.println("So dien thoai: ");
        this.numberPhone = Configuration.sc.nextLine();
    }
    public void print(){
        System.out.println("Thong tin khach hang: ");
        System.out.println("Ten: " +  this.name);
        System.out.println("Dia chi: " +  this.adress);
        System.out.println("So dien thoai: " +  this.numberPhone);
    }
}
