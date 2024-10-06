/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulation.java;

//Encapsulation in different file but it can put in same file

public class EncapsulationJava {

    public static void main(String[] args) {
        Student student1 = new Student("Joenel", 10, 202415258); //constructor arguments
        student1.address = "Pamayang maliksi"; //Public 
        
        System.out.println("Student Name: " + student1.getName()); //get if attributes is encapsulated in private
        System.out.println("Student Id: " + student1.student_Id);
        System.out.println("Student Address: " + student1.address);
        System.out.println("Student Age: " + student1.getAge());
           
        System.out.println("");
        System.out.println("Updated name and age");
        student1.setName("Tobi");
        student1.setAge(20);
        
        System.out.println("Updated Name: " + student1.getName());
        System.out.println("Updated Name: " + student1.getAge());
    }
    
}