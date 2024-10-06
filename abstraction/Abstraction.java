/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstraction;

/**
 *
 * @author joene
 */
public class Abstraction {


    public static void main(String[] args) {
      Vehicle jeep = new Jeep();
      Vehicle ebike = new Ebike();
      jeep.started();
      jeep.stopped();
      jeep.startAgain();
      
      System.out.println("");
      
      ebike.started();
      ebike.stopped();
      ebike.startAgain();
    }
    
}
