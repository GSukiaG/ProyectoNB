package c.usonb;

import java.util.Scanner;

public class Ejemplo2 {

public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
System.out.println("Introduce tu nombre, por favor:");
String nombre = entrada.nextLine();
System.out.println("Hola " + nombre + "!");
System.out.println("Introduce un numero:");
int numero = entrada.nextInt();
signo(numero);
parImpar(numero);
System.out.println("Fin del programa.");
}
private static void signo(int numero) {
if (numero >= 0) {
System.out.println(numero + " es positivo.");
} else {
System.out.println(numero + " es negativo.");
}
}
private static void parImpar(int numero) {
if (numero %2== 0) {
System.out.println(numero+" es par.");
} else {
System.out.println(numero+" es impar.");
}
}
}
