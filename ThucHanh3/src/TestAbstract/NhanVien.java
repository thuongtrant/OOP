/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestAbstract;

/**
 *
 * @author ttthu
 */
abstract class NhanVien {
    private static int ma =1;
    private String ten;
    private String que;

    public NhanVien() {
    }

    public NhanVien(String ten, String que) {
        this.ten = ten;
        this.que = que;
    }
    
    public abstract double layHeSo();
    public abstract double layPhuCap();
    
    public double tinhLuong(){
        return layHeSo()*5 + layPhuCap();
    }
}

class NhanVienA extends NhanVien {
    private static final double heSoLuong = 3.5;
    private static final double phuCap = 5;

    public NhanVienA() {
        super("A", "HN");
    }
    
    @Override
    public double layHeSo(){
        return heSoLuong;
    }
    @Override
    public double layPhuCap(){
        return phuCap;
    }
}
class NhanVienB extends NhanVien {
    private static final double heSoLuong = 2.0;
    private static final double phuCap = 3;

    public NhanVienB() {
        super("B", "SG");
    }
    
      @Override
    public double layHeSo(){
        return heSoLuong;
    }
    @Override
    public double layPhuCap(){
        return phuCap;
    }
}
class NhanVienD extends NhanVien {
    private static final double heSoLuong = 0;
    private static final double phuCap = 0;
    private int soGioLam;
    private int luongGio;


    public NhanVienD(int soGioLam, int luogGio) {
        super("D", "DN");
        this.soGioLam = soGioLam;
        this.luongGio = luogGio;
    }
    
      @Override
    public double layHeSo(){
        return heSoLuong;
    }
    @Override
    public double layPhuCap(){
        return phuCap;
    }
    
    @Override
    public double tinhLuong(){
        return soGioLam*luongGio ;
    }
    
}