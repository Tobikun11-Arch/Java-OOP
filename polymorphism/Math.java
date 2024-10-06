/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

public class Math { //Method overloading same method name but different parameters, data types and 
                     //order of parameters
    
    int add(int a, int b, int c) { //return with arithmetic operations
        return a * b - c;
    }
    
    double add(double tax, double pay) {
        return tax * pay;
    }
    
    int add(int currentYear, int birthDate) {
        return currentYear - birthDate;
    }
    
    void taxPayer() {
        System.out.println("Tax: " + add(1500.00, 2.5));
    }
    
}
