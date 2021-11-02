/**
 * ¡Muestra tabla de multiplicar de un número!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio08AleCueto {
  public static void main(String[] args) {
    System.out.print("\n¡Dime un número entero y te daré su número de dígitos!: ");
    
    Long numero = Long.parseLong(System.console().readLine());
    long digitos = 0;


    while(numero > 1){
      numero = numero/10;
      digitos++; 
    }
    
    System.out.println("\nEl número introducido tiene " + digitos + " dígitos");

  }
}
