/**
 * Calcula el área de un rectángulo
 *
 * @author Ale Cueto
 */
public class Tema03Ejercicio05AleCueto {
  public static void main(String[] args) {
    
    System.out.println("¡Vamos a calcular el área de un rectángulo!");
    System.out.println("Introduce cuánto mide la base en cm del rectángulo:");
    float base = Float.parseFloat(System.console().readLine());
    System.out.println("Introduce cuánto mide la altura en cm del rectángulo:");
    float altura = Float.parseFloat(System.console().readLine());
    
    System.out.println("\n");
    System.out.print("El área del rectángulo dada la base de " + base + "cm y la altura de " + altura + "cm ");
    System.out.print("es igual a " + (base * altura) + "cm²");
  }
}
