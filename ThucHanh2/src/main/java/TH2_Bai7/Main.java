/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2_Bai7;

import java.io.FileNotFoundException;
import java.time.LocalDate;

/**
 *
 * @author ttthu
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Student s1 = new Student("Tran", "Nam", LocalDate.of(2004, 03, 23));
        Student s2 = new Student("Nguyen", "Nam Dinh", "03/10/1967");
        
        ManageStudent list = new ManageStudent();
        list.addStudent(s1,s2);
       // list.addStudent();
        list.inputFromFile();
        list.printList();

    }
}
