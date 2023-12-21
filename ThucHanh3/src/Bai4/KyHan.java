/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Bai4;

import java.time.LocalDate;

/**
 *
 * @author ttthu
 */
public enum KyHan {
    MOT_TUAN(7, 0.5) {
        @Override
        LocalDate tinhDaoHan(LocalDate d) {
            return d.plusDays(this.khoangTg);
        }

        @Override
        double tinhLai(double st) {
            return (st * this.laiXuat) / 100 / 12 / 4;
        }
    },
    MOT_THANG(1, 4.5) {
        @Override
        LocalDate tinhDaoHan(LocalDate d) {
            return d.plusMonths(this.khoangTg);
        }

        @Override
        double tinhLai(double st) {
            return (st * this.laiXuat) / 100 / 12 / 4;
        }
    },
    MOT_NAM(1, 6.8) {
        @Override
        LocalDate tinhDaoHan(LocalDate d) {
            return d.plusYears(1);
        }

        @Override
        double tinhLai(double st) {
            return (st * this.laiXuat) / 100 / 12 / 4;
        }
    };

    protected int khoangTg;
    protected double laiXuat;

    private KyHan(int khoangTg, double laiXuat) {
        this.khoangTg = khoangTg;
        this.laiXuat = laiXuat;
    }

    abstract LocalDate tinhDaoHan(LocalDate d);

    abstract double tinhLai(double st);
}
