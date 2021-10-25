/**
 * Muestra múltiplos de 5 del 0 al 100
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio01AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a sacar todos los múltiplos de 5 del 0 al 100!\n");
    
    
    for(int i  = 0; i <= 100; i++){
    
      if(i % 5 == 0)
        System.out.println(i + " es múltiplo de 5");
    }
  }
}
