/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author ttthu
 */
public class Main {
        public static void main(String[] args) {
        Diem diemA = new Diem(1,2);
        Diem diemB = new Diem(4,6);
        Diem diemC = new Diem(2,3);
        Diem diemD = new Diem(5,7);
        
        
        System.out.println("Thong tin diem A:");
        diemA.hienThiDiem();
        System.out.println("Thong tin diem B: ");
        diemB.hienThiDiem();
        System.out.println("Thong tin diem C:");
        diemC.hienThiDiem();
        System.out.println("Thong tin diem D: ");
        diemD.hienThiDiem();
        
        DoanThang doanAB = new DoanThang(diemA, diemB);
        DoanThang doanCD = new DoanThang(diemC, diemD);
        System.out.println("Thong tin doan AB: " );
        doanAB.hienThiDoanThang();
        System.out.println("Thong tin doan CD");
        doanCD.hienThiDoanThang();
        
        System.out.println("Do dai doan thang AB: " + doanAB.doDai());
        System.out.println("Do dai doan thang CD: " + doanCD.doDai());
        
        Diem trungDiemAB = doanAB.timTrungDiem();
        System.out.println("Trung diem AB: ");
        trungDiemAB.hienThiDiem();
        Diem trungDiemCD = doanCD.timTrungDiem();
        System.out.println("Trung diem CD");
        trungDiemCD.hienThiDiem();
        
        double khoangCachAB = diemA.tinhKhoangCach(diemB);
        System.out.println("Khoang cach giua diem A va diem B = " + khoangCachAB);
        double khoangCachCD = diemC.tinhKhoangCach(diemD);
        System.out.println("Khoang cach giua diem A va diem B = " + khoangCachCD);
      
        
         if (doanAB.kiemTraSongSong(doanCD)) {
            System.out.println("AB va CD song song");
        } else {
            System.out.println("AB và CD khong song song.");
        }
         
        Diem diemTrenTrai = new Diem(1.0, 4.0);
        Diem diemDuoiPhai = new Diem(5.0, 2.0);

        HinhChuNhat hinhChuNhat = new HinhChuNhat(diemTrenTrai, diemDuoiPhai);
        hinhChuNhat.hienThiThongTin();
    }
}

