/**
 * Calcular factura dada la base imponible
 *
 * @author Ale Cueto
 */
public class Tema03Ejercicio07AleCueto {
  public static void main(String[] args) {
    
    System.out.println("¡Vamos a calcular una factura dada la base imponible!");
    System.out.println("Introduce cuánto es la base imponible en euros:");
    float base = Float.parseFloat(System.console().readLine());
    
    System.out.println("\n");
    System.out.print("Dada una base imponible de " + base + "€, el total de la factura sería ");
    System.out.printf("%.2f €", base * 1.21);
  }
}
