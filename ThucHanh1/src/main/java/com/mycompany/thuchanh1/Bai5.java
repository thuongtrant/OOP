/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thuchanh1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ttthu
 */
public class Bai5 {
    public static void main(String[] args) {
        int m = 3; // số dòng
        int n = 4; // số cột
        
        int[][] matrix = new int[m][n];
        Random random = new Random();
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = random.nextInt(100) + 1;
            }
        }
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        for(int i = 0; i < m; i++){
            int rowSum = 0;
            for(int j = 0; j < n; j++){
                rowSum += matrix[i][j];
            }
            System.out.println("Tong tren dong " + i + ": " + rowSum);
        }
        
         for(int j = 0; j < n; j++){
            int colSum = 0;
            for(int i = 0; i < m; i++){
                colSum += matrix[i][j];
            }
            System.out.println("Tong tren cot " + j + ": " + colSum);
        }
         
         
         Scanner scan = new Scanner(System.in);
         System.out.println("Nhap chi so dong: ");
         int d = scan.nextInt();
         int rowSum = 0;
         int minInRow = Integer.MAX_VALUE;
         for(int j = 0; j < n; j++){
            rowSum += matrix[d][j];
            minInRow = Math.min(minInRow,matrix[d][j]);
         }
        System.out.println("Tong tren dong " + d + " la: " + rowSum);
        System.out.println("Gia tri nho nhat tren dong " + d + minInRow);
        
        
        
        
         Scanner sc = new Scanner(System.in);
         System.out.println("Nhap chi so cot: ");
         int c = sc.nextInt();
         int colSum = 0;
         int maxInCol = Integer.MIN_VALUE;
         for(int i = 0; i < m; i++){
            colSum += matrix[i][c];
            maxInCol = Math.max(maxInCol,matrix[i][c]);
         }
        System.out.println("Tong tren dong " + c + " la: " + colSum);
        System.out.println("Gia tri nho nhat tren dong " + c + maxInCol);
    }
}
