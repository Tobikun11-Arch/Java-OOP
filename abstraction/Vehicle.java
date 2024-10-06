/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraction;


abstract class Vehicle {
    
    //this abstract method should use by subclasses of Vehicle
    abstract void started();
    
    void stopped() {
        System.out.println("Vehicle is stopped");
    }
    
    abstract void startAgain();
    
}

class Jeep extends Vehicle {
    
       @Override
       void started() {
           System.out.println("Jeep is starting");
       }
       
       @Override
       void startAgain() {
           System.out.println("Jeep starting again");
       }
    
} 

class Ebike extends Vehicle {
     @Override
       void started() {
           System.out.println("Ebike is starting");
       }
       
         @Override
       void startAgain() {
           System.out.println("Ebike starting again");
       }
}
