import javax.naming.spi.DirStateFactory.Result;

/**
 * ¡Suma los 100 números siguientes a un número entero y positivo introducido!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio17AleCueto {
  public static void main(String[] args) {
    
    System.out.println("¡Suma los siguientes 100 números!");
    long numero = 0;
    long ultimoResultado = 0;
    long resultado = 0;

    do{
      System.out.print("\nDime el número por el que quieres empezar: ");
      numero = (long) Double.parseDouble(System.console().readLine());
    }while(numero < 0);
    
    resultado = ultimoResultado + numero;
    numero = resultado;
    ultimoResultado = numero + 1;
    resultado = ultimoResultado + numero;

    for(long i = 0; i <= 100; i++){
      System.out.println(numero + " + " + ultimoResultado + " = " + resultado);
      numero+=2;
      ultimoResultado = resultado;
      resultado = ultimoResultado + numero;
    }

  }
}   
