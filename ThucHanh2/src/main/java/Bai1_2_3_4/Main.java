/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_2_3_4;

/**
 *
 * @author ttthu
 */
public class Main {
        public static void main(String[] args) throws Exception {
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
      
        
        System.out.println("Kiem tra song song");
        System.out.println(doanAB.isSongSong(doanCD));
         
        Diem diemTrenTrai = new Diem(1.0, 4.0);
        Diem diemDuoiPhai = new Diem(5.0, 2.0);

        HinhChuNhat hinhChuNhat = new HinhChuNhat(diemTrenTrai, diemDuoiPhai);
        hinhChuNhat.hienThiThongTin();
        
        HinhTron tron1 = new HinhTron(new Diem(0,1), 2);
        HinhTron tron2 = new HinhTron(new Diem(1,1),3);
        
        int tuongDoiDiem = tron1.xacDinhTuongDoiDiem(diemD);
        System.out.println("Xac dinh tuong doi diem");
        if(tuongDoiDiem == 1)
                System.out.println("Diem nam ngoai duong tron");
        else if(tuongDoiDiem == -1)
            System.out.println("Diem nam trong duong tron");
        else
            System.out.println("Trung");

        System.out.println("Xac dinh tuong doi duong tron");
        int tuongDoiDuongTron = tron1.xacDinhTuongDoiDuongTron(tron2);
        if (tuongDoiDuongTron == 1)
            System.out.println("Khong giao nhau");
        else if (tuongDoiDuongTron == -1)
            System.out.println("Cat nhau");
        else
            System.out.println("Tiep xuc");
        
        
        System.out.println("C1 = " + tron1.chuViHT());
        System.out.println("S1 = " + tron1.dienTichHT());
    }
}

