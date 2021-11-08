/**
 * ¡Lee diez números y determina cuantos son positivos!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio13AleCueto {
  public static void main(String[] args) {
    int numerosPositivos = 0;
    int numerosNegastivos = 0;
    
    System.out.println("¡Vamos a introducir 10 números y devolveré cuantos son positivos y cuantos no!");
    
    for(int i = 0; i < 10; i++){
      System.out.print("Introduce el " + i + "º número: ");
      double aux = Double.parseDouble(System.console().readLine());
      if(aux >= 0){
        numerosPositivos++;
      } else {
        numerosNegastivos++;
      }
    }

    System.out.print("Hay en total " + numerosPositivos + " numeros positivos");
    System.out.print(" y "+ numerosNegastivos + " numeros negativos\n");
  }
}
