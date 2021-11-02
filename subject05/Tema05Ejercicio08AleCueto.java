/**
 * ¡Muestro tabla de multiplicar!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio08AleCueto {
  public static void main(String[] args) {
    System.out.print("\n¡Dime un número y te daré su tabla de multiplicar!: ");
    
    double aux = Double.parseDouble(System.console().readLine());
    int numero = (int) aux;

    for(int i = 0; i <= 10; i++){
      System.out.println( numero + " * " + i + " = " + numero * i);
    }

  }
}
