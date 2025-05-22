package Day14;

import java.io.Serializable;

public class Student implements Serializable{
    private String name;
    private double grade;

    public Student(String name,double grade){
        this.name=name;
        this.grade=grade;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getGrade(){
        return grade;
    }
    public void setGrade(double grade){
        this.grade=grade;
    }
    public void displayInfo(){
        System.out.println("Student name: " + name);
        System.out.println("Student Grade: " + grade);
    }
}

