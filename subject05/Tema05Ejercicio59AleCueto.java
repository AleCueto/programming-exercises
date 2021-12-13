/**
 * ¡Pasa cifras de un número a la derecha!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio59AleCueto{
  public static void main(String[] args) {

    System.out.print("¡Vamos a pintar un árbol!: ");
    System.out.print("Dime la altura: ");
    int altura = Integer.parseInt(System.console().readLine());

    
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