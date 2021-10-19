/**
 * Resuelve una ecuación de primer grado (ax + b = 0)
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio05AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a resolver una ecuación de primer grado! (ax + b = 0)");
    
    System.out.print("Indícame cual quieres que sea el valor de a: ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Indícame cual quieres que sea el valor de b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    double x = -b/a;
    
      
    System.out.printf("dada una a igual a %.3f y un b igual a %.3f, x será igual a %.3f", a, b, x);
}
}
