/**
 * Vamos a ver el último dígito de un entero
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio19AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a cuántos dígitos tiene un número entero!");
    System.out.print("Introduce el número del que desees sacar sus dígitos: ");
    
    int numero = Integer.parseInt(System.console().readLine());

    String texto = "" + numero;
    
    System.out.println("El número de dígitos del número es " + texto.length());
  }
}
