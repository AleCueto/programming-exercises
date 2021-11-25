/**
 * ¡Tira tres dados y muestra la suma!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema06Ejercicio4AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Muestra 20 números entre 0 y 10!: ");
    
    for(int i = 0; i<= 10; i++){
      int numero = (int)(Math.random() * 20);
      System.out.print(numero + ", ");
    }

    System.out.println("\n");

  }
}   
