/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.thuchanh1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author ttthu
 */
public class Bai3 {
    public static void main(String[] args) throws FileNotFoundException {
        //a
//        System.out.println("Email: ");
//        Scanner scan = new Scanner(System.in);
//        String email = scan.nextLine();
//        String[] diaChi = email.split("@");
//        String tenDiaChi = diaChi[0];
//        System.out.println(tenDiaChi);

        //b
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Nhap chuoi");
//        String chuoi = scan.nextLine();
//        int soKyTuHoa = 0;
//        for(int i = 0; i < chuoi.length(); i++)
//        {
//            char kyTu = chuoi.charAt(i);
//            if(Character.isUpperCase(kyTu)){
//            soKyTuHoa++;
//            }
//        }
//        System.out.println("So ky tu hoa trong chuoi  " + chuoi + " la: " + soKyTuHoa);


        //c
//        File f = new File("D:\\Users\\ttthu\\OneDrive\\Documents\\NetBeansProjects\\ThucHanh1\\src\\main\\Data.txt");
//        Scanner scan = new Scanner(f);
//        String s = scan.nextLine();
//        System.out.println(s);
//        s = s.replaceAll("\\{file\\}","Tap Tin");
//        System.out.println(s);


        //d
//        String input = "Hello, world! This is a sample string; count the words and find the longest one.";
//        String[] words = input.split("[\\s,;.!]+"); // Tách chuỗi thành các từ dựa trên khoảng trắng, dấu phẩy và dấu chấm phẩy.
//
//        // Đếm số từ trong chuỗi.
//        int wordCount = words.length;
//        System.out.println("So tu trong chuoi: " + wordCount);
//
//         String longestWord = "";
//        for (String word : words) {
//            if (word.length() > longestWord.length()) {
//                longestWord = word;
//            }
//        }
//         System.out.println("Tu dai nhat trong chuoi: " + longestWord);
        
        
        
        //e
//        System.out.println("Nhap chuoi: ");
//        Scanner scan = new Scanner(System.in);
//        String chuoi = scan.nextLine();
//        String[] arr = chuoi.trim().split("\\s+");
//         StringBuilder result = new StringBuilder();
//        for(String word:arr){
//             String normalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
//            result.append(normalizedWord).append(" ");
//        }
//         System.out.print(result.toString().trim());
    }
}
