/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Inheritance;

//Inheritance uses extends keywords

class HumanAbility { //Inheritance means creating new classes based on existing ones, it means this class is for one class
    
    private String run; //this is encapsulation if you read the encapsulation first you can understand this
    String getRun() {
        return run;
    }
    
    void setRun(String run) {
        this.run = run;
    }
    
    void PeopleRun() {
        System.out.println("Human can run " + getRun());
    }
    
}

public class Inheritance extends HumanAbility { //Imagine Inheritance name is Human, i just used Inheritance name for this project 

    public static void main(String[] args) {
       HumanAbility ability1 = new HumanAbility();
       ability1.setRun("runner");
       ability1.PeopleRun();
    }
    
}

