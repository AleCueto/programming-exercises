/**
 * Muestra múltiplos de 5 del 0 al 100 usando do while
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio03AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a sacar todos los múltiplos de 5 del 0 al 100 usando do while!\n");
    
    int i = 0;
    
    do{
      if(i % 5 == 0){
        System.out.println(i + " es múltiplo de 5");
      }
      i++;
    }while(i <= 100);
  }
}
