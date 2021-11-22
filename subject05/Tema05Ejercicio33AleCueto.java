/**
 * ¡Pinta una U de altura determinada por pantalla!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio33AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Dame una altura y te pintaré una U!: ");

    System.out.print("\nIntroduce la altura: ");
    int altura = Integer.parseInt(System.console().readLine());
    int ancho = altura -2;
    int espacio = 0;
    int distanciaEntrePuntos = altura;
    
    for(int h = 1; h <= altura -1; h++){
      for(int i = 0; i <= espacio; i++){
        System.out.print(" ");
      }
      System.out.print('*');

      for(int i = 0; i <= distanciaEntrePuntos; i++){
        System.out.print(" ");
      }
      System.out.print('*');
      System.out.print("\n");
    }

    espacio = 1;

    for(int i = 1; i <= espacio; i++){
      System.out.print("  ");
    }

    for(int h = 0; h <= distanciaEntrePuntos; h++){
      System.out.print("*");
    }
    System.out.println("\n");

  }
}   
