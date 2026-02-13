package debug;

/**
 *
 * @author gsukia
 */

import java.util.Scanner;

public class Debug2 {

   private static int contadorIntentos = 0; // Variable global para rastrear las llamadas

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Introduce un numero entero (N) para calcular su factorial (Ej: 4): ");
        int numero = scanner.nextInt();        
        System.out.print("Cual crees que es el resultado correcto (Para N=" + numero + "): ");
        long intentoUsuario = scanner.nextLong();
        
        // Llamada al método con el error. Establece un Breakpoint aquí (línea 22)
        long resultadoReal = calcularFactorial(numero);
        
        System.out.println("El resultado del factorial de " + numero + " es: " + resultadoReal);
        
        // --- Condición de Verificación ---
        if (resultadoReal == intentoUsuario) {
            System.out.println("¡CORRECTO! Tu adivinanza es igual al resultado (aunque el calculo es erroneo).");
        } else {
            System.out.println("INCORRECTO. Tu intento fue: " + intentoUsuario);
        }
        
        System.out.println("El metodo se ejecuto: " + contadorIntentos + " veces.");
        
        scanner.close();
    }
    
    /**
     * Calcula el factorial de un número N, pero con un error intencional.
     */
    public static long calcularFactorial(int N) {
        // Incrementamos el contador global
        contadorIntentos++; 
        
        long resultado = 1;
        
        // ERROR LÓGICO INTENCIONAL: El factorial se calcula sumando en lugar de multiplicando.
        // 1. Establece una Vigilancia (Watch) sobre la expresión: resultado < 10
        for (int i = 1; i <= N; i++) { 
            
            resultado += i; 
        }
        
        return resultado;
    }
}