import java.security.Principal;

/**
 * ¡vamos a mostrar de 7 en 7 los numeros entre dos enteros!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio18AleCueto {
  public static void main(String[] args) {
    
    System.out.println("¡Números de 7 en 7 entre dos enteros!");
    long primerNumero = 0;
    long ultimoNumero = 0;
    long numeroMostrar = 0;

    System.out.print("\nDime el número por el que quieres empezar: ");
    primerNumero = (long) Double.parseDouble(System.console().readLine());
    do{
      System.out.print("\nDime el número en el que quieres terminar: ");
      ultimoNumero = (long) Double.parseDouble(System.console().readLine());
    }while(primerNumero >= ultimoNumero);
    
    numeroMostrar = primerNumero;    

    while(numeroMostrar <= ultimoNumero){
      System.out.print(numeroMostrar + ", ");
      numeroMostrar += 7;
    }

    System.out.println("\n");
  }
}   
