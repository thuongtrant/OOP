/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListStudent61;

import java.util.Objects;

/**
 *
 * @author ttthu
 */
public class Student implements Comparable<Student>{
    private String id;
    private String name;
    private int birthyear;
    private float mark;

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String name, int birthyear, float mark) {
        this.id = id;
        this.name = name;
        this.birthyear = birthyear;
        this.mark = mark;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", birthyear=" + birthyear + ", mark=" + mark + '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, name, id, birthyear);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        return Objects.equals(this.id, other.id);
    }


  


    

   
    
    
}
