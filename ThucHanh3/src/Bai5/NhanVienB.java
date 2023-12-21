/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5;

/**
 *
 * @author ttthu
 */
public class NhanVienB extends NhanVien {

    private final double HE_So = 1.5;

    public NhanVienB() {
    }

    public NhanVienB(String ht, String cmnd) {
        super(ht, cmnd);
    }

    @Override
    public double tinhLuong(int soNgayCong) {
        return HE_So * super.tinhLuong(soNgayCong);
    }
    
    
}
