/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism;

/*
Polymorphism allows us to perform a single action in different ways. 
In other words, polymorphism allows you to define one interface and have multiple implementations.
Example of this is Method Overloading
*/

//I seperated the files for Animals and for Math

public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal myAnimal; //Declare reference
        myAnimal = new Animal();
        myAnimal.sound();
        
        System.out.println("");
        myAnimal = new Dog();
        myAnimal.sound();
        
        System.out.println("");
        myAnimal = new Tiger();
        myAnimal.sound();
        System.out.println("");
        
       //Math
       Math math = new Math();
       int age = math.add(2024, 2004);
       System.out.println("Age: " + age);
       math.taxPayer();
       
    }
    
}
