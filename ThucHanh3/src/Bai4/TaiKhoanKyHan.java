/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4;

import java.time.LocalDate;

/**
 *
 * @author ttthu
 */
enum KyHan{
    MOT_TUAN,
    MOT_THANG,
    MOT_NAM
}
public class TaiKhoanKyHan extends TaiKhoan{
    private LocalDate ngayDaoHan;

    public TaiKhoanKyHan(LocalDate ngayDaoHan, String tenTk, String soDt, String email, double soTien, LocalDate ngayTaoTk, KyHan kyHan) {
        super(tenTk, soDt, email, soTien, ngayTaoTk);
        
        this.ngayDaoHan = ngayDaoHan;
    }
    
    
}
