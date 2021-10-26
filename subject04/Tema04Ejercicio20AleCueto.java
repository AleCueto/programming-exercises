/**
 * Comprobamos si un número es capicúo
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio20AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a ver si un número es capicúo!");
    System.out.print("Introduce el número del que deseas comprobar si es capicúo: ");
    
    int numero = Integer.parseInt(System.console().readLine());

    int primerNumero = numero / 10000;
    int segundoNumero = numero / 1000;
    int tercerNumero = numero / 100;
    int cuartoNumero = numero / 10;
    int ultimoNumero = numero % 10;

    System.out.println("" + tercerNumero);

    
    if(numero.length() <= 5){
      
    }

    System.out.println("El número de dígitos del número es " + texto.length());
  }
}
