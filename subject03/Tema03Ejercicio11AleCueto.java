/**
 * Convertir Kb a Mb
 *
 * @author Ale Cueto
 */
public class Tema03Ejercicio11AleCueto {
  public static void main(String[] args) {
    
    System.out.println("¡Vamos a convertir de Kb a Mb!");
    
    System.out.println("Introduce el número de Kb que quieras convertir:");
    float kb = Float.parseFloat(System.console().readLine());
    
    System.out.println("\n");
    System.out.printf("%.2f Kb son un total de %.2f Mb", kb, kb / 1000);
  }
}
