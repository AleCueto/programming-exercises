/**
 * Ordena reyes
 * 
 * 
 * @author Ale Cueto
 */
import matematicas.Varias;

public class Tema09Ejercicio17AleCueto {
  public static void main(String[] args) {

    //pasa binario a decimal
    System.out.println(binarioAdecimal(111));

  }

  private static int binarioAdecimal(int binario){

    int decimal = 0;

    for (int i = 0; i < Varias.digitos(binario); i++) { //recorre el numero y suma a decimal el valor de la potencia de 2 elevado a la posicion en la que se encuentra
      
      if(Varias.digitoN(binario, i) == 1){
        decimal += Varias.potencia(2, i);
      }
    }

    return decimal;
  }




}
