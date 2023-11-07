/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai5_6;

/**
 *
 * @author ttthu
 */
public class PhanSo {

    private int tuSo;
    private int mauSo;
    private static int soPS = 0;

    public PhanSo() {
        tuSo = 0;
        mauSo = 1;
        soPS++;
    }

    public PhanSo(int tu, int mau) {
        this.tuSo = tu;
        this.mauSo = mau;
        soPS++;
    }

    public static int timUocSoChungLonNhat(int a, int b) {
        if (b == 0) {
            return a;
        }
        return timUocSoChungLonNhat(b, a % b);
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

    public void rutGon() {
        int uocChung = timUocSoChungLonNhat(tuSo, mauSo);
        tuSo /= uocChung;
        mauSo /= uocChung;
    }
    
    public PhanSo congPS(PhanSo p){
        int mau = this.mauSo * p.mauSo;
        int tu = this.tuSo*p.mauSo + this.mauSo*p.tuSo;
        PhanSo kq = new PhanSo(tu,mau);
        kq.rutGon();
        return kq;
    }
    
    public PhanSo truPS(PhanSo p){
        int mau = this.mauSo * p.mauSo;
        int tu = this.tuSo*p.mauSo - this.mauSo*p.tuSo;
        PhanSo kq = new PhanSo(tu,mau);
        kq.rutGon();
        return kq;
    }
    
    public PhanSo nhanPS(PhanSo p){
        int tu = this.tuSo * p.tuSo;
        int mau = this.mauSo *p.mauSo;
        PhanSo kq = new PhanSo(tu,mau);
        kq.rutGon();
        return kq;
    }
    
    public PhanSo chiaPS(PhanSo p){
        int tu = this.tuSo * p.mauSo;
        int mau = this.mauSo * p.tuSo;
        PhanSo kq = new PhanSo(tu,mau);
        kq.rutGon();
        return kq;
    }
    
    public void soSanhPS(PhanSo p){
        this.rutGon();
        p.rutGon();
        if(this.tuSo == p.tuSo && this.mauSo == p.mauSo)
            System.out.println("Bang Nhau");
        else if (this.tuSo * p.mauSo > this.mauSo * p.tuSo)
            System.out.println("Lon hon");
        else
            System.out.println("Nho hon");
    }
     public boolean equals(PhanSo ps) {
        this.rutGon();
        ps.rutGon();
        return this.tuSo == ps.tuSo && this.mauSo == ps.mauSo;
    }

    public boolean lonHon(PhanSo ps) {
        this.rutGon();
        ps.rutGon();
        return this.tuSo * ps.mauSo > this.mauSo * ps.tuSo;
    }

    public boolean nhoHon(PhanSo ps) {
        this.rutGon();
        ps.rutGon();
        return this.tuSo * ps.mauSo < this.mauSo * ps.tuSo;
    }
    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
    
}
