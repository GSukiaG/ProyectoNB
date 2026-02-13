package c.usonb;

import java.util.Scanner;
/**
 * Programa que hace kfjgsdlfkjgdfsklgjlsd
 * @author gsukia
 * @version 1.0
 * @
 */
public class Ejemplo1 {
/**
 * Método principal kdgjdgldfhslñ
 * @param args 
 */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre, por favor:");
        String nombre = entrada.nextLine();
        System.out.println("Hola " + nombre + "!");
        System.out.println("Introduce un numero:");
        int numero = entrada.nextInt();
        signo(numero);
        int numeroAleatorio = (int) (Math.random() * 20) + 1;
        cuadrado(numeroAleatorio);
        System.out.println("** Fin del programa **");
    }
/** Muestra por pantalla si el signo del número.
 * @param numeroAleatorio número que  fgkdfhkl
* */
    public static void cuadrado(int numeroAleatorio) {
        System.out.println("El cuadrado de " + numeroAleatorio + " es: " + numeroAleatorio * numeroAleatorio);
    }
/**
 * Dice si un número es positivo o negativo
 * @param numero número a analizar su signo
 */
    public static void signo(int numero) {
        if (numero >= 0) {
            System.out.println(numero + " es positivo.");
        } else {
            System.out.println(numero + " es negativo.");
        }
    }

}
