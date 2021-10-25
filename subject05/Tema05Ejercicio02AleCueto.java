/**
 * Muestra múltiplos de 5 del 0 al 100 usando while
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio02AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a sacar todos los múltiplos de 5 del 0 al 100 usando while!\n");
    
    int i = 0;
    
    while(i <= 100){
      if(i % 5 == 0){
        System.out.println(i + " es múltiplo de 5");
      }
      i++;
    }
  }
}
