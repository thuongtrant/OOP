/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

/**
 *
 * @author ttthu
 */
public class NhanVienA extends NhanVien{
    private final double HE_SO = 1.2;

    public NhanVienA() {
    }

    
    public NhanVienA(String ht, String cmnd) {
        super(ht, cmnd);
    }
    @Override
    public double tinhLuong(int soNgayCong){
        return HE_SO * super.tinhLuong(soNgayCong);
    }
}
