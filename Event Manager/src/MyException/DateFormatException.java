/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MyException;

/**
 *
 * @author ttthu
 */
public class DateFormatException extends Exception{

    public DateFormatException() {
        super();
        System.err.println("Vui long nhap dung dinh dang (dd/MM/yyyy)!");
    }
     
}
