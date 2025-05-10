/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Alumno Tarde
 */
public class Calculadora {
    
    // TODO Javier
    public int factorial(int n){
           int factorial = 1;
    for (int i = 2; i <= n; ++i) {
      factorial *= i;
    }
    return factorial;
  }
    
    
    // TODO Iván
    public int fibonacci(int n){
        if(n <= 0) {
	    return 0;
	} else if (n == 1) {
	    return 1;
	}
	
	int a  = 0, b = 1, resultado = 0;
	for (int i = 2; i <= n; i ++) {
		resultado = a + b;
		a = b;
		b = resultado;
	}

	        
        return resultado;
    }
    
    // TODO Samuel
    public double sqrt(int n){
	return Math.sqrt(n);
    }
    
}
