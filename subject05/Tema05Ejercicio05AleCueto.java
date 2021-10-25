/**
 * Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle while
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio05AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a sacar los números del 320 al 160 contando en 20 hacia atrás usando while!\n");
    
    int i = 320;
    
    while(i >= 160){
      System.out.println(i);
      i -= 20;
    }
  }
}
