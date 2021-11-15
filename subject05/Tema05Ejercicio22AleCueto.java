import java.security.cert.TrustAnchor;

/**
 * ¡vamos a mostrar todos los primos entre 2 y 100!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio22AleCueto {
  public static void main(String[] args) {
    
    System.out.println("¡vamos a mostrar todos los primos entre 2 y 100!");
    boolean primo = true;

    for(int i = 2; i <= 100; i++){
      primo = true;
      for(int n = 2; n < i && primo == true; n++){
        if(i % n == 0){
          primo = false;
        }
      }
      if(primo == true ){
        System.out.print(i + ", ");
      }
    }

    System.out.println("\n");
  }
}   
