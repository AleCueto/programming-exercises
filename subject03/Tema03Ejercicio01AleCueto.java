/**
 * Pide dos números y muestra el resultado de su multiplicación
 *
 * @author Ale Cueto
 */
public class Tema03Ejercicio01AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a multiplicar!");
    System.out.println("Ingresa un primer factor (se permiten decimales)");
    float factor1 = Float.parseFloat( System.console().readLine());
    System.out.println("Ingresa un segundo factor (se permiten decimales)");
    float factor2 = Float.parseFloat( System.console().readLine() );
    System.out.println("El resultado de la multiplicación de " + factor1 + " y " + factor2 + "es igual a " + factor1 * factor2);
  }
}


