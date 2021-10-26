/**
 * Vamos a ver el último dígito de un entero
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio18AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a mostrar el primer dígito de un número entero!");
    System.out.println("Introduce el número del que desees sacar su primer número:");
    
    int numero = Integer.parseInt(System.console().readLine());
    
    String texto = "" + numero;
    
    char primerDigito = texto.charAt(0);
    
    System.out.println(primerDigito);
  }
}
