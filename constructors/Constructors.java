/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructors;

/**
 *
 * @author joene
 */
public class Constructors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee employee = new Employee(); //constructor but no arguments cause no paremeter in no args
        System.out.println("Employee details: (No args constuctor)");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("");
        
        Student student = new Student("John Doe", 24);
        System.out.println("Student Details: (Parameterized Constructor)");
        System.out.println("Student name: " + student.name);
        System.out.println("Student age: " + student.age);
        System.out.println("");
        
        Cloth cloth = new Cloth();
        System.out.println("Cloth Details: (Overloading Constructor)");
        System.out.println("Cloth color: " + cloth.color);
        Cloth cloth1 = new Cloth("blue", 5000);
        System.out.println("Cloth1 color: " +  cloth1.color);
        System.out.println("Cloth cost: " + cloth1.cost);
        Cloth cloth2 = new Cloth(3000);
        System.out.println("Discount cost: " + cloth2.cost);
        System.out.println("");
        
        Family family = new Family("Sevellejo");
        Family copy = new Family(family);
        System.out.println("Family details: (Copy Constructor)");
        System.out.println("Copy Family name: " + copy.Lastname);
    }
    
}

class Employee { 
    String name; //if this 2 string and int only and dont have public employee, its called default constuctor
    int age;
    
    public Employee() { //no args constructor
        name = "Joenel";
        age = 20;
    }
}

class Student {
    String name;
    int age;
    
    public Student(String name, int age) { //Parameterized constructor
        this.name = name;
        this.age = age;
        this.write(); //method
    }
    
    void write() { //if may method sa constructor it will print first
        System.out.println("Student " + name + " can run");
    }
}   

class Cloth {
    String brand;
    String color;
    int cost;
    
    public Cloth() {
        color = "red";
        brand = "LV";
    }
    
    public Cloth(String color, int cost) {
        this.color = color;
        this.cost = cost;
    }
    
    public Cloth(int cost) {
        this.cost = cost;
    }
}


class Family {
    String Lastname;
    
    public Family(String name) { //Copy constructor
        this.Lastname = name; 
    }
    
    public Family(Family copyfamily) {
        this.Lastname = copyfamily.Lastname;
    }
}