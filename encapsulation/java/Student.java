/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package encapsulation.java;

//We use Access modifiers to implement Encapsulation
//Public - The code is accessible for all classes
//Private - The code is only accessible within the declared class
//Protected - The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the Inheritance chapter


public class Student {

    private String name;  //If a member is marked as private, public, or protected, it is called Encapsulation.
    //private need setter and getter
    
    public String address; //code is accessible for all classes
    private int age; 
    protected int student_Id; //Members can be accessed if they are in the same package or if the class uses inheritance (extends).
    
    public Student(String name, int age, int student_Id) { //constructor parameters
        this.name = name; //constructor body
        this.age = age;
        this.student_Id = student_Id;
    }
    
    //For Private, Setter and Getter
     String getName(){ //getter must have return
        return name;
    }
    
    void setName(String name) { //setter need parameter
        this.name = name;
    }
    
    int getAge() {
        return age;
    }
    
    void setAge(int age) {
        this.age = age;
    }
   
}
