/**
 * Convertir Mb a Kb
 *
 * @author Ale Cueto
 */
public class Tema03Ejercicio10AleCueto {
  public static void main(String[] args) {
    
    System.out.println("¡Vamos a convertir de Mb a Kb!");
    
    System.out.println("Introduce el número de Mb que quieras convertir:");
    float mb = Float.parseFloat(System.console().readLine());
    
    System.out.println("\n");
    System.out.printf("%.2f Mb son un total de %.2f Kb", mb, mb * 1000);
  }
}
