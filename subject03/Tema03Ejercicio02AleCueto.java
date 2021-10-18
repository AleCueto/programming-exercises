/**
 * Pide un numero de pesetas y las pasa a euros
 *
 * @author Ale Cueto
 */
public class Tema03Ejercicio02AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a pasar de euros a pesetas!");
    System.out.println("Introduce el número de euros que quieres convertir:");
    float euros = Float.parseFloat(System.console().readLine());
    System.out.printf("%.2f€ equivalen a  %d pesetas", euros, (int)(euros * 166.386));
  }
}


