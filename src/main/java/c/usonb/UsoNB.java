package c.usonb;
/**
public class UsoNB{
static  entrada = new Scanner(System.in);
public static void main(String[] args) {
entrada = new Scanner(System.in);
System.out.println("Introduce tu nombre, por favor:");
String nombre = entrada.nextLine();
System.out.println("Hola " + nombre + "!");
salir = false;
int opcion;
while (!salir) {
System.out.println("\nElige una opción " + nombre + "?\n\n1. Positivo - Negativo\n"
    + "2. Par - Impar \n3. Número Primo\n4. Factorial\n5. Salir\n*--------------------*");
opcion = entrada.nextInt();
switch (opcion) {
case 1:
numPositivoONegativo();
break;
case 2:
parImpar();
 break;
case 3: numPrimo();
  break;
case 4:                   
 factorial();
 break;
case 5:
System.out.println("Gracias por usar el programa");
salir = true;
 break;
default:
System.out.println("\nIntroduzca una opción válida.");
    break;
}
}
}
static void numPositivoONegativo(int numero) {
System.out.println("Introduce un número entero: ");
int num = entrada.nextInt();
if (num >= 0) {
System.out.println(num+" es positivo.");
} else {
System.out.println(num+" es negativo.");
}
}
private static void parImpar() {
System.out.println("Introduce un número entero: ");
int num = entrada.nextInt();
if (num %2== 0) {
System.out.println(num+" es par.");
} else {
System.out.println(num+" es impar.");
}
}
static void factorial() {
System.out.println("Introduce un número entero para calcular su factorial:");
int numero = entrada.nextInt();
int factorial = factorial(numero);
System.out.println("El factorial de " + numero + " es " + factorial);
}
static int factorial(int numero) {
if (numero == 1) {
return 1;
}
return numero * factorial(numero - 1);
}
 /* Este método debe solicitar un número entre 2 y 15 y generar 2 arrays de ese tamaño
    con números enteros aleatorios de 0 a 100. Después debe generar un tercer array, del mismo tamaño
    que tenga en cada posición el producto de los números en la mismo posición en los otros dos arrays.
  
static void arrays() {               
System.out.println("Introduce el tamaño del array (entre 2 y 15): ");
int tamaño = entrada.nextInt();        
while(tamaño <= 0 || tamaño > 30){
System.out.println("Introduce un número válido (entre 2 y 15):");
tamaño = entrada.nextInt();
}       
int array1[] = new int[tamaño];
int array2[] = new int[tamaño];        
for(int i = 0; i <= array1.length; i++){
array1[i] = (int) (Math.random()*100); 
}     
for(int i = 0; i < array2.length; i++){
array2[i] = = (int) (Math.random()*100);     
}  
int array3[]  = new int[tamaño];  
generarArrayProducto(array1, array2, array3);
} 
static void generarArrayProducto(int[] array1, int[] array2) {
for(int i = 0; i <= array1.length; i++){          
array3[i] = array1[i] * array2[i+1];       
System.out.println("El producto de " + array1[i] + " * " + array2[i+1] + " es " + array3[i+2]);
}
}
*/
