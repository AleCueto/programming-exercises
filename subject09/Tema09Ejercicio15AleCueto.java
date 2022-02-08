/**
 * Ordena reyes
 * 
 * 
 * @author Ale Cueto
 */
import matematicas.Varias;

public class Tema09Ejercicio15AleCueto {
  public static void main(String[] args) {

    //Muestra los primos entre 1 y 1000
    for (int i = 1; i <= 1000; i++) {
      if(Varias.esPrimo(i)){
        System.out.print(i + "   ");
      }
    }


  }




}
