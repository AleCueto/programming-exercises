/**
 * Calcular volumen de un cono
 *
 * @author Ale Cueto
 */
public class Tema03Ejercicio09AleCueto {
  public static void main(String[] args) {
    
    System.out.println("¡Vamos a calcular el volumen de un cono!");
    
    System.out.println("Introduce la altura del cono en cm:");
    float h = Float.parseFloat(System.console().readLine());
    
    System.out.println("Introduce el radio de la base del cono en cm:");
    float r = Float.parseFloat(System.console().readLine());
    
    float g = h*h + r*r;
    double v = 0.333 * 3.1416 * r * r * h;
    
    System.out.println("\n");
    System.out.printf("El volumen de un cono dada una altura de %.2f cm ", h);
    System.out.printf("un radio de %.2f cm, es igual a %.2f cm²", r, v);
  }
}
