/**
 * Calcula el área de un triángulo
 *
 * @author Ale Cueto
 */
public class Tema03Ejercicio06AleCueto {
  public static void main(String[] args) {
    
    System.out.println("¡Vamos a calcular el área de un triángulo!");
    System.out.println("Introduce cuánto mide la base en cm del triángulo:");
    float base = Float.parseFloat(System.console().readLine());
    System.out.println("Introduce cuánto mide la altura en cm del triángulo:");
    float altura = Float.parseFloat(System.console().readLine());
    
    System.out.println("\n");
    System.out.print("El área del triángulo dada la base de " + base + "cm y la altura de " + altura + "cm ");
    System.out.print("es igual a " + ((base * altura)/2) + "cm²");
  }
}
