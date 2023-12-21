/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestAbstract;

/**
 *
 * @author ttthu
 */
public class Example {
public static void change(int a[]) {
a[0] = 9;
int[] t = {1, 2, 3};
a = t;
a[0] = 99;
}
public static void main(String[] args) {
int[] a = {4, 5, 6};
change(a);
System.out.println(a[0]);
}
}
