/**
 * Vamos a ver el último dígito de un entero
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio17AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a mostrar el último dígito de un número entero!");
    System.out.println("Introduce el número del que desees sacar su último número:");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    int ultimoDigito = numero % 10;
    System.out.println(ultimoDigito);
  }
}
