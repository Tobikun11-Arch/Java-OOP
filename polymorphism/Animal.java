/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author joene
 */
//if you will extends base class the method name should same with it 

public class Animal { //base class
    
    void sound() { //method
         System.out.println("Animal can make a sound");
    }
    
}

class Dog extends Animal { //Subclass 1
       void sound() {
           System.out.println("Dog can barks always");
       }
}

class Tiger extends Animal { //subclass 2
    void sound() {
        System.out.println("Tiger can k*ll you");
    }
}