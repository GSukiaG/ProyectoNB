package debug;

/**
 *
 * @author gsukia
 */

import java.util.Scanner;
public class Debug3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Introduce un numero entero (N) para calcular su factorial (Ej: 4): ");
        int numero = scanner.nextInt();               
        long resultado = calcularFactorial(numero);       
        System.out.println("El resultado del factorial de " + numero + " es: " + resultado);       
        scanner.close();
    }
    
    /**
     * Calcula el factorial de un número N, pero con un error intencional +/*
     */
    public static long calcularFactorial(int N) {     
        long resultado = 1;
        for (int i = 1; i <= N; i++) {             
            resultado += i;
        }
        return resultado;
    }
}