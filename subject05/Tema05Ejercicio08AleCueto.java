/**
 * ¡Muestra tabla de multiplicar de un número!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio08AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Dime un número y yo te daré su tabla de multiplicar!\n");
    
    double aux = Double.parseDouble(System.console().readLine());
    int numero = (int)aux;

    for(int i = 0; i <= 10; i++){
      System.out.println("" + i + " * " + numero + " = " + i*numero);
    }
  }
}
