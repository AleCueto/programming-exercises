/**
 * ¡Muestro x números serie de fibonacci!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio12AleCueto {
  public static void main(String[] args) {
    int primerNumero = 0;
    int segundoNumero = 1;
    int resultado = 0;
    
    System.out.println("¡Vamos ver x números de la secuencia de fibonacci!");
    System.out.print("Elige cuantos números de la secuencia de fibonacci quieres ver:");
    double aux = Double.parseDouble(System.console().readLine());
    
    int numeroRepeticiones = (int)aux;


    for(int i = 0; i < numeroRepeticiones; i++){
      if(i == 2){
        System.out.print("1, ");
      }
      System.out.print(resultado + ", ");
      resultado = primerNumero + segundoNumero;
      primerNumero = segundoNumero;
      segundoNumero = resultado;
    }

    System.out.println("\n");
    
  }
}
