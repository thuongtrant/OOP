package com.mycompany.thuchanh1;

import java.util.stream.IntStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ttthu
 */
public class Bai4_1 {
    public static boolean isPrime(int x){
        if(x < 2 )
            return false;
        for(int i = 2; i < Math.sqrt(x); i++){
            if(x % i == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a = {2, 3, 4, -3, -5, 9, 10};
        System.out.println(IntStream.of(a).filter(x -> isPrime(x)).sum());
        System.out.println(IntStream.of(a).filter(x -> x > 0).max().getAsInt());
        System.out.println(IntStream.of(a).filter(x -> x < 0).min().getAsInt());
        
    }
}
