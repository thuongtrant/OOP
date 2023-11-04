/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thuchanh1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ttthu
 */
public class Bai4 {
    
    //a
    public static  boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }
    public static  int sumPrime(int[] arr){
        int sum = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                sum += num;
            }
        }
        return sum;
    }
    
    //b
    public static void timMinMaxDuongAm(int[] arr) {
        int maxPositive = Integer.MIN_VALUE;
        int minNegative = Integer.MAX_VALUE;
        boolean hasPositive = false;
        boolean hasNegative = false;
        for (int num : arr) {
            if (num > 0 && num > maxPositive) {
                maxPositive = num;
                hasPositive = true;
            } else if (num < 0 && num < minNegative) {
                minNegative = num;
                hasNegative = true;
            }
        }
        if (hasPositive) {
            System.out.println("So duong lon nhat: " + maxPositive);
        } else {
            System.out.println("*");
        }

        if (hasNegative) {
            System.out.println("So am be nhat: " + minNegative);
        } else {
            System.out.println("*");
        }
    }
    
    
    //c
    public static int findMinPrime(int[] arr){
        int minPrime = Integer.MAX_VALUE;
        boolean foundPrime = false;
        for(int num:arr){
            if(isPrime(num)){
                minPrime = Math.min(minPrime, num);
                foundPrime = true;
            }
        }
        if(foundPrime){
            return minPrime;
        }else {
            return -1;
        }
        
    }
    
    
    //d
    public static void sapXepSNT(int[] arr){
        List<Integer> primes = new ArrayList<>();
        List<Integer> nonPrimes = new ArrayList<>();
        for(int num : arr){
            if(isPrime(num)){
                primes.add(num);
            } else {
                nonPrimes.add(num);
            }
        }
        Collections.sort(primes);
        
        int primeIndex = 0;
        int nonPrimeIndex = 0;
        for(int i = 0; i < arr.length; i++){
            if(isPrime(arr[i])){
                arr[i] = primes.get(primeIndex);
                primeIndex++;
            } else {
                arr[i] = nonPrimes.get(nonPrimeIndex);
                nonPrimeIndex++;
            }
        } 
    }
    
    
    
    //e
    public static int findIndexX(int[] arr, int x){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == x){
                return mid;
            } else if(arr[mid] < x){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {13, -10, 5, -2, 2, 7, 10, 4, 6};
        int sumOfPrimes = sumPrime(arr);
        System.out.println("Tong cac so nguyen to trong mang: " + sumOfPrimes);
        
        timMinMaxDuongAm(arr);
        
        int minPrimeValue = findMinPrime(arr);
        System.out.println("So nguyen to nho nhat trong mang: " + minPrimeValue);
        
        
        sapXepSNT(arr);
        System.out.println(Arrays.toString(arr));
        
        int x;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap so can tim: ");
        x = scan.nextInt();
        int indexX = findIndexX(arr,x);
        System.out.println("Vi tri cua " + x + " la: " + indexX);
    }
}

