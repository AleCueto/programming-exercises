/**
 * ¡Pinta reloj de arena!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio39AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Vamos a pintar un reloj de arena con la altura que quieras!: ");
    System.out.print("Por favor, introduce la altura: ");
    int h = Integer.parseInt(System.console().readLine());
    int asteriscs = h;
    int espacios = 0;
    
    //Parte de arriba
    for (int i = 0; i < h; i++) {

      //Pinta espacios delante
      for(int e = 0; e <= espacios; e++){
        System.out.print(" ");
      }


      //Pinta asteriscos
      for (int j = 0; j < asteriscs * 2; j++) {
        System.out.print("*");
      }

      //Pinta espacios detrás
      for(int e = 0; e <= espacios; e++){
        System.out.print(" ");
      }

      System.out.print("\n");
      asteriscs--;
      espacios++;
    }

    
    asteriscs = 2;
    espacios = h;
    
    //Parte abajo
    for (int i = 0; i < h; i++) {
      
      //Pinta espacios por delante
      for (int e = espacios; e >= 1; e--) {
        System.out.print(" ");
      }

      //Pinta asteriscos
      for (int j = 0; j < asteriscs; j++) {
        System.out.print("*");
      }
      asteriscs+=2;
      

      espacios--;
      System.out.println();
    }

    }
  }   