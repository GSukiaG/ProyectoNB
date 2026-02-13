package debug;
/**
 * @author gsukia
 */
import java.util.Scanner;
public class Debug1 {
    public static void main(String[] args) {
        // Objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa calcula el factorial de un numero.");
        System.out.print("Introduce un numero entero (entre 1 y 12): ");
        int numero = scanner.nextInt();
        long factorialResultado = 1;
        factorialResultado = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorialResultado);
        scanner.close();
    }
    /**
     * Calcula el factorial de un número N (con errorEl bucle debería incluir al número N, pero por error, se detiene antes
     * Establece un Watch (Vigilancia) sobre la variable 'resultado' y 'i'
     */
    public static long calcularFactorial(int N) {
        long resultado = 1;
        for (int i = 1; i <= N; i++) { 
            resultado *= i;
        }
        return resultado;
    }
}
