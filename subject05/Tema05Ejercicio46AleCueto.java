/**
 * ¡Pide un número entero positivo y muestra los factoriales hasta él!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio46AleCueto{
  public static void main(String[] args) {

    System.out.print("¡Vamos a pintar un rectángulo!: ");
    System.out.print("Por favor, introduce el ancho (mínimo 2): ");
    int ancho = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduce el alto (mínimo 2): ");
    int alto = Integer.parseInt(System.console().readLine());


    //Pinta primera línea
    pintarCaracteres(ancho, "* ");
    System.out.println();

    //Pintar medio
    for (int i = 0; i < alto-2; i++) {
      System.out.print("*");
      pintarEspacios(ancho*2 -3);
      System.out.print("*");
      System.out.println();
    }

    //Pinta última línea
    pintarCaracteres(ancho, "* ");

    }
  
    public static void pintarEspacios(int numeroEspacios){
      for (int i = 0; i < numeroEspacios; i++) {
        System.out.print(" ");
      }
    }
  
    public static void pintarCaracteres(int numeroCaracteres, String caracter){
      for (int i = 0; i < numeroCaracteres; i++) {
        System.out.print("" + caracter);
      }
    }
  }   