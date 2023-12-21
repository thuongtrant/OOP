/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ttthu
 */
public class TaiKhoanKyHan extends TaiKhoan{
    protected KyHan kyHan;
    protected LocalDate ngayDaoHan;

    public TaiKhoanKyHan(String tenTk, double soTien, KyHan kyHan) {
        super(tenTk, soTien);
        this.kyHan = kyHan;
        this.ngayDaoHan = kyHan.tinhDaoHan(LocalDate.now());
    }
    
    @Override
    public double tinhLai(){
        return this.kyHan.tinhLai(this.soTien);
    }
    
    @Override
    public void capNhatDaoHan(){
        this.ngayDaoHan = this.kyHan.tinhDaoHan(this.ngayDaoHan);
    }
    
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.printf("Ky han: %s\nNgay dao han: %s\n",
                this.kyHan, this.ngayDaoHan.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
