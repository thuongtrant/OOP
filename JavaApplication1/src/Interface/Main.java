/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author ttthu
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Test cau a: ");
        MayTinhFx500 fx500 = new MayTinhFx500();
        MayTinhVinacal vinacal = new MayTinhVinacal();
        System.out.println("5+3 = " + fx500.cong(5, 3));
        System.out.println("5+3 = " + vinacal.cong(5, 3));
        
        System.out.println("Test cau b: ");
        double[] arr = new double[] {5, 1, 3, 4, 5, 8, 0};
        double[] arr1 = new double[] {6, 2, 7, 9, 2, 4, 5};
        
        SapXepChen sxchen = new SapXepChen();
        SapXepChon sxchon = new SapXepChon();
        
        sxchen.sapXepTang(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print("arr[i]");
        }
        sxchon.sapXepTang(arr1);
        for(int i = 0; i < arr1.length; i++) {
            System.out.print("arr1[i]");
        }
    }
}
