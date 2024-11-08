/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package statickeyword;

/**
 *
 * @author joene
 */
public class StaticKeyWord {

    static { //static block
        System.out.println("This is inside of static");
    }
    
    static class Human {
         int age = 20;
         static int year = 2004;
    }
    
    class Pen { //to access the Pen class in the main class --
        String HumanNmae; 
    }
    
    public static void main(String[] args) {
        System.out.println("Inside of Main method");
        System.out.println("");
        
        System.out.println("Person name: " + Person.name); //Static is shareable even without object and this is static variables
        Person.run(); //static  method
        System.out.println("");
       
        StaticKeyWord sk = new StaticKeyWord(); //using class Pen that inside of main class
        Pen pen = sk.new Pen();
        pen.HumanNmae = "Joenel Sevellejo";
        System.out.println("Human name: " + pen.HumanNmae);
        System.out.println("");
        
        Human human = new Human(); //calling the static class inside of main class doesn't required object for main class
        System.out.println("Human age: " + human.age);
        System.out.println("Birth year: " + Human.year);
        
    }
    
}


class Person {
    static String name = "Joenel"; //static variables
    
   static void run() { //static method also can call directly using class Name (Person)
       System.out.println(name + "  can run");
   }
}