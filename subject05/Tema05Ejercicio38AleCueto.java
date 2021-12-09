/**
 * ¡Pide un número entero positivo y muestra los factoriales hasta él!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio38AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Vamos a pintar un reloj de arena con la altura que quieras!: ");
    System.out.print("Por favor, introduce la altura: ");
    int h = Integer.parseInt(System.console().readLine());
    int espacios = 0;
    int altura = h;

    //Pinta parte de arriba
    for (int i = 0; i < h/2+1 ; i++) {
      //pintar espacios antes
      pintarEspacios(espacios);
      espacios++;
      pintarCaracteres(altura, '*');
      System.out.println();
      altura-= 2;
    }

    espacios-=2;
    altura+= 4;


    for (int i = 0; i < h/2; i++) {
      //pintar espacios antes
      pintarEspacios(espacios);
      espacios--;
      pintarCaracteres(altura, '*');
      altura+= 2;
      System.out.println();
    }
    }
  
    public static void pintarEspacios(int numeroEspacios){
      for (int i = 0; i < numeroEspacios; i++) {
        System.out.print(" ");
      }
    }
  
    public static void pintarCaracteres(int numeroCaracteres, char caracter){
      for (int i = 0; i < numeroCaracteres; i++) {
        System.out.print("" + caracter);
      }
    }
  }   