/**
 * ¡Pide un número entero positivo y muestra los factoriales hasta él!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio39AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Vamos a sacar los números desde el uno a un número y su factorial!: ");

    
    System.out.print("Por favor, introduce el número: ");
    int numero = Integer.parseInt(System.console().readLine());
    int factorial = numero;
    
    System.out.print(numero + "! = ");


    for (int i = numero; i >= 2 ; i--) {
      factorial *= i-1;
    }

    System.out.print(factorial + "\n");

  }

  
}   