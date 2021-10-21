/**
 * Calcula ecuación de segundo grado del tipo ax² + bx + c = 0
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio09AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a calcular una ecuación de segundo grado! del tipo ax² + bx + c = 0");
    
    System.out.print("Por favor, indícame cual es el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Ahora, indícame cual es el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por último, indícame cual es el valor de c: ");
    double c = Double.parseDouble(System.console().readLine());
    
    double x1 = (-b + (Math.sqrt(b * b - 4 * a * c))/2*a);
    
    double x2 = (-b - (Math.sqrt(b * b - 4 * a * c))/2*a);

    System.out.printf("El resultado de la ecuación %.2fx² + %.2fx + %.2f es igual a", a, b, c);
    System.out.printf("%.2f y a %.2f", x1, x2);
}
}
