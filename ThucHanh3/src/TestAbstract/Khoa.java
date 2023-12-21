/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestAbstract;

/**
 *
 * @author ttthu
 */
public class Khoa {

    private String ten;

    public Khoa(String t) {
        this.ten = t;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}

class SinhVien implements Cloneable {

    private String ten;
    private Khoa khoa;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Khoa getKhoa() {
        return khoa;
    }

    public void setKhoa(Khoa khoa) {
        this.khoa = khoa;
    }

    public SinhVien(String t, Khoa k) {
        this.ten = t;
        this.khoa = k;
    }

    @Override
    protected Object clone()
            throws CloneNotSupportedException {
        return super.clone();
    }
}
