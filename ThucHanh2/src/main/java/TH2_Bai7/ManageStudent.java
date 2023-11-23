/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH2_Bai7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author ttthu
 */
public class ManageStudent {
    private List<Student> list= new ArrayList<>();
    
    
    public void addStudent(Student...a){
        this.list.addAll(Arrays.asList(a));
    }
    
    public void addStudent(){
        Student s = new Student();
        s.inputStudent();
        this.list.add(s);
    }
    
    public void inputList(){
        this.list.forEach(h -> h.inputStudent());
    }
    
    public void printList(){
        this.list.forEach(h -> h.prinStudent());
    }
    
    public void inputMarkList(){
        this.list.forEach(h -> {
            System.out.printf("Mark of ", h.getName().toUpperCase());
            h.inputMarkStudent();
        });
    }
    
    public void inputFromFile() throws FileNotFoundException{
        File f = new File("src/main/resources/student.txt");
        try(Scanner scan = new Scanner(f)){
            while(scan.hasNext()){
                String n = scan.nextLine();
                String c = scan.nextLine();
                String b = scan.nextLine();
                Student s = new Student(n,c,b);
                this.list.add(s);
            
            }
        }
    }
    
    public Student findStudent(int id){
        return this.list.stream().filter(h -> h.getId() == id).findFirst().get();
    }
    
    public List<Student> findStudent(String keyWord){
        return this.list.stream().filter(h -> h.getName().contains(keyWord)).collect(Collectors.toList());
    }
    
    public List<Student> findAward(){
        return this.list.stream().filter(h -> h.isAward()).collect(Collectors.toList());
    }
    
    public void sortMark(){
        this.list.sort((h1,h2) -> h1.compareMark(h2));
    }
}
