package c.usonb;

import java.util.Scanner;
/* Programa que solicita  un número por teclado y muestra si es primo o no y calcula su cubo.*/

public class EXT2DAW {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu nombre, por favor:");
        String nombre = entrada.nextLine();
        System.out.println("Hola " + nombre + "!");
        System.out.println("Introduce un numero:");
        int numero = entrada.nextInt();
        esPrimo(numero);
        cubo(numero);
        System.out.println("** Fin del programa **");
    }

    //Muestra por pantalla el cubo del número.
    static void cubo(int numero) {
        int resultado = (int) Math.pow(numero, 3);
        System.out.println("El cubo de " + numero + " es: " + resultado);
    }
    //Escribe en consola si el número es primo o no.
    static void esPrimo(int numero) {
        if (numero <= 1) {
            System.out.println(numero + " no es primo. Los números menores o iguales a 1 no son primos.");
            return;
        }
        // Comprueba si el número tiene un divisor, si lo tiene no es  primo
        for (int i = 2; i * i <= numero; i++) {

            if (numero % i == 0) {
                System.out.println(numero + " no es primo.");
                return;
            }
        }
        // Si el bucle termina sin encontrar divisores, el número es primo.
        System.out.println(numero + " es primo.");
    }
}
