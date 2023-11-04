/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListStudent61;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ttthu
 */
public class ListStudents {
    private ArrayList<Student> list;
    public ListStudents() {
        this.list = new ArrayList<Student>();
    }
    public ListStudents(ArrayList<Student> list) {
        this.list = list;
    }

    public void addStudent(Student s){
        this.list.add(s);
    }
    
    public void printList(){
        for (Student student : list) {
            System.out.println(student);
        }
    }
    
    public boolean checkEmpty() {
        return this.list.isEmpty();
    }
    
    public int countList(){
        return this.list.size();
    }
    
    public void makeEmpty() {
        this.list.removeAll(list);
    }
    
    public boolean findStudent(Student sv){
        return this.list.contains(sv);
    }
    
    public boolean delStudent(Student sv){
        return this.list.remove(sv);
    }
    
    public void findName(String name){
        for (Student student : list) {
            if(student.getName().contains(name)){
                System.out.println(student);}
        }
    }
    
    public void arrangeMark() {
        Collections.sort(this.list, (Student o1, Student o2) -> {
            if (o1.getMark() < o2.getMark()) {
                return 1;
            } else if (o1.getMark() > o2.getMark()) {
                return -1;
            } else {
                return 0;
            }
            
        });
    }
}
