/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5_6;

import java.util.Scanner;

/**
 *
 * @author ttthu
 */
public class PhanSo {

    private int tuSo;
    private int mauSo;
    private static int soPS = 0;

    public PhanSo() {
//        tuSo = 0;
//        mauSo = 1;
        this(0, 1);
        soPS++;
    }

    public PhanSo(int tu, int mau) {
        this.tuSo = tu;
        this.mauSo = mau;
        soPS++;
    }

    public static int timUocSoChungLonNhat(int a, int b) {
//        if (b == 0) {
//            return a;
//        }
//        return timUocSoChungLonNhat(b, a % b);
            if(a == 0 || b == 0)
                return 1;
            a = Math.abs(a);
            b = Math.abs(b);
            while(a != b)
                if(a > b)
                    a -= b;
                else
                    b -= a;
            return a;
    }
    
    public void nhapPs(){
        Scanner scan = new Scanner (System.in);
        System.out.println("Tu so = ");
        this.tuSo = scan.nextInt();
        System.out.println("Mau so = ");
        this.mauSo = scan.nextInt();
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public PhanSo rutGon() {
        int uocChung = timUocSoChungLonNhat(tuSo, mauSo);
        return new PhanSo(tuSo /= uocChung, mauSo /= uocChung);
    }
    
    public PhanSo congPS(PhanSo p){
        return new PhanSo(this.tuSo * p.mauSo + this.mauSo * p.tuSo, this.mauSo * p.mauSo).rutGon();
    }
    
    public PhanSo truPS(PhanSo p){
        return new PhanSo(this.tuSo*p.mauSo - this.mauSo*p.tuSo, this.mauSo * p.mauSo).rutGon();
    }
    
    public PhanSo nhanPS(PhanSo p){
        return new PhanSo(this.tuSo * p.tuSo, this.mauSo *p.mauSo).rutGon();
    }
    
    public PhanSo chiaPS(PhanSo p){
        return new PhanSo(this.tuSo * p.mauSo, this.mauSo * p.tuSo).rutGon();
    }
    
    public int soSanhPS(PhanSo p){
      double v1 = this.tuSo*1.0 / this.mauSo;
      double v2 = p.tuSo*1.0 / p.mauSo;
      if(v1 > v2)
          return 1;
      else if(v1 < v2)
              return -1;
      return 0;
              
    }
    
    public void hienThiPS() {
        System.out.println(tuSo + "/" + mauSo); 
    }
    
}
