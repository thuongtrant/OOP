/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1_2_3_4;

/**
 *
 * @author ttthu
 */
public class HinhTron {
    private Diem tam;
    private double bk;

    public HinhTron(Diem tam, double bk) {
        this.tam = tam;
        this.bk = bk;
    }

    public Diem getTam() {
        return tam;
    }

    public void setTam(Diem tam) {
        this.tam = tam;
    }

    public double getBk() {
        return bk;
    }

    public void setBk(double bk) {
        this.bk = bk;
    }
    public int xacDinhTuongDoiDiem(Diem d){
        double kc = this.tam.tinhKhoangCach(d);
        if(kc > this.bk)
            return 1;
        else if(kc < this.bk)
            return -1;
        return 0;
    }
    public int xacDinhTuongDoiDuongTron(HinhTron t){
        double kc = this.tam.tinhKhoangCach(t.tam);
        if(kc > this.bk + t.bk)
            return 1;
        else if(kc < this.bk + t.bk)
            return -1;
        return 0;
    }
    public double chuViHT(){
        return Math.PI*2*bk;
    }
    public double dienTichHT(){
        return Math.pow(Math.PI*2*bk,2)/4*Math.PI;
    }
}
