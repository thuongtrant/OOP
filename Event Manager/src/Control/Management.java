/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.util.List;

/**
 *
 * @author ttthu
 */
public interface Management {
    void add();
    void printList();
    void remove(String kw);
    void upDate(String id);
    double priceSum();
    void writeFile(String fileName);
    void readFile(String fileName);
}
