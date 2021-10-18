/**
 * Pide dos números y opera con ellos
 *
 * @author Ale Cueto
 */
public class Tema03Ejercicio04AleCueto {
  public static void main(String[] args) {
    
    System.out.println("¡Vamos a operar con dos números!");
    System.out.println("Introduce el primer número:");
    float primerNumero = Float.parseFloat(System.console().readLine());
    System.out.println("Introduce el segundo número:");
    float segundoNumero = Float.parseFloat(System.console().readLine());
    
    System.out.println("\n");
    System.out.println(primerNumero + " + " + segundoNumero + " = " + (primerNumero + segundoNumero));
    System.out.println(primerNumero + " - " + segundoNumero + " = " + (primerNumero - segundoNumero));
    System.out.println(primerNumero + " * " + segundoNumero + " = " + (primerNumero * segundoNumero));
    System.out.println(primerNumero + " / " + segundoNumero + " = " + (primerNumero / segundoNumero));

  }
}


