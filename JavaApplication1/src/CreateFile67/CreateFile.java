/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CreateFile67;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ttthu
 */
public class CreateFile {
    public static void main(String[] args) {
        File folder1;
        folder1 = new File("D:\\Users\\ttthu\\OneDrive\\Documents\\NetBeansProjects\\JavaApplication1");
        System.out.println("Kiem tra folder co ton tai hay khong: " + folder1.exists());
        
        File ex;
        ex = new File("D:\\Users\\ttthu\\OneDrive\\Documents\\NetBeansProjects\\JavaApplication1\\Test");
        ex.mkdir(); // tao thu muc
        
        File ex1;
        ex1 = new File("D:\\Users\\ttthu\\OneDrive\\Documents\\NetBeansProjects\\JavaApplication1\\Test\\Test1\\Test2");
        ex1.mkdirs(); // Tao nhieu thu muc cung luc
        
        // Tao tap tin(co phan mo rong: .exe .txt .doc...)
        File file1;
        file1 = new File("D:\\Users\\ttthu\\OneDrive\\Documents\\NetBeansProjects\\JavaApplication1\\Test\\Example.txt");
        try { 
            file1.createNewFile();
        } catch (IOException ex2) {
            // khong co quyen tao tap tin
            Logger.getLogger(CreateFile.class.getName()).log(Level.SEVERE, null, ex2);
        }
    }
}
