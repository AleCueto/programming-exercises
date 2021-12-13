/**
 * ¡Pide un número entero positivo y muestra los factoriales hasta él!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio47AleCueto{
  public static void main(String[] args) {

    System.out.print("¡Vamos a pintar un rectángulo!: ");
    System.out.print("Por favor, introduce el alto (mínimo 2): ");
    int alto = Integer.parseInt(System.console().readLine());


    //Pinta primera línea
    pintarCaracteres(5, "M ");
    System.out.println();

    //Pintar medio
    for (int i = 0; i < alto/3; i++) {
      System.out.print("M");
      pintarEspacios(5*2 -3);
      System.out.print("M");
      System.out.println();
    }

    //Pinta última línea
    pintarCaracteres(5, "M ");


    //Pintar medio
    for (int i = 0; i < alto/3; i++) {
      System.out.print("M");
      pintarEspacios(5*2 -3);
      System.out.print("M");
      System.out.println();
    }



    //Pinta última línea
    pintarCaracteres(5, "M ");

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