/**
 * ¡Tira tres dados y muestra la suma!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema06Ejercicio5AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Muestra 50 números entre 100 y 199!: \n");
    int numero = 0;
    for(int i = 0; i < 50; i++){
      numero = (int)(Math.random() * 50 + 100);
      while(numero < 100 || numero > 199){
        numero = (int)(Math.random() * 50 + 100);
      }
      System.out.print(numero + ", ");
    }

    System.out.println("\n");

  }
}   
