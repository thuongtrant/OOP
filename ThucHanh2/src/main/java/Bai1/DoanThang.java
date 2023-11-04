/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author ttthu
 */
public class DoanThang {
       private Diem diemA;
       private Diem diemB;

        public DoanThang(Diem diemA, Diem diemB) {
            this.diemA = diemA;
            this.diemB = diemB;
        }

        public Diem getDiemA() {
            return diemA;
        }

        public void setDiemA(Diem diemA) {
            this.diemA = diemA;
        }

        public Diem getDiemB() {
            return diemB;
        }

        public void setDiemB(Diem diemB) {
            this.diemB = diemB;
        }
        
        public void hienThiDoanThang() {
             System.out.println("[" + diemA.getX() + ", " + diemA.getY() + "], [" + diemB.getX() + ", " + diemB.getY() + "]");
        }
        
        public double doDai(){
            return diemA.tinhKhoangCach(diemB);
        }
        
        public Diem timTrungDiem(){
            double hoangDo = (diemA.getX() + diemB.getX())/2;
            double tungDo = (diemA.getY() + diemB.getY())/2;
            Diem trungDiem = new Diem(hoangDo,tungDo);
            return trungDiem;
        }
        
 public boolean kiemTraSongSong(DoanThang doanThang) {
        double hesoA = diemA.getY() - diemB.getY();
        double hesoB = diemB.getX() - diemA.getX();
        double hesoC = diemA.getX() * diemB.getY() - diemB.getX() * diemA.getY();

        double hesoD = doanThang.diemA.getY() - doanThang.diemB.getY();
        double hesoE = doanThang.diemB.getX() - doanThang.diemA.getX();
        double hesoF = doanThang.diemA.getX() * doanThang.diemB.getX() - doanThang.diemB.getX() * doanThang.diemA.getX();

        return (hesoA * hesoE == hesoB * hesoD) && (hesoB * hesoF == hesoC * hesoD);
    }
}
