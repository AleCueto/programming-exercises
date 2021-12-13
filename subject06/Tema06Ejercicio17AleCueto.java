/**
 * ¡Muestra notas generadas al azar!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema06Ejercicio17AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Pecera!:\n");
    System.out.print("Dime el alto de la pecera");
    int alto = Integer.parseInt(System.console().readLine());
    System.out.print("Dime el ancho de la pecera");
    int ancho = Integer.parseInt(System.console().readLine());
    
    
    int posicionPez = (int)(Math.random()*(ancho-2)*(alto-2));
    int posicion = 0;

    //Pinta primera línea
    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
    System.out.println();

    //Pinta en medio
    for (int i = 0; i < alto-2; i++) {
      System.out.print("*");

      for (int j = 0; j < ancho-2; j++) {
        if(posicion != posicionPez){
          System.out.print(" ");
        } else{
          System.out.print("&");
        }
        posicion++;
      }
      
      System.out.print("*");
      System.out.println();
    }

    //Pinta última línea
    for (int i = 0; i < ancho; i++) {
      System.out.print("*");
    }
    System.out.println();

  }
}   
