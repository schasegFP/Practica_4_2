/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import modelo.Calculadora;

/**
 *
 * @author Alumno Tarde
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Tests para los métodos de calculadora
        Calculadora c = new Calculadora();
        
        System.out.println("factorial(5) = " + c.factorial(5));
        System.out.println("fibonacci(5) = " + c.fibonacci(5));
        System.out.println("sqrt(2) = " + c.sqrt(2));
        
    }
    
}
