/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author ttthu
 */
public abstract class Hinh {

    private String name;

    public Hinh(String name) {
        this.name = name;
    }

    abstract double tinhDienTich();

    abstract double tinhChuVi();

    @Override
    public String toString() {
        return String.format("Hinh %s\nDien tich: %.2f\nChu Vi: %.2f\n\n",
                 this.getName(), this.tinhChuVi(), this.tinhDienTich());
    }

    @Override
    public boolean equals(Object obj) {
        Hinh h = (Hinh) obj;
        return this.name.equals(h.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
