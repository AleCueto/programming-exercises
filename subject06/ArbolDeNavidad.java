public class ArbolDeNavidad {
  public static void main(String[] args) {
    System.out.println("Este programa pinta un árbol de Navidad.");
    System.out.print("Por favor, introduzca la altura: ");
    int altura = Integer.parseInt(System.console().readLine());

    // Estrella ///////////////////////////////////////////

    // Espacios a la izquierda de la estrella
    for (int i = 0; i < altura; i++) {
      System.out.print(" ");
    }
    System.out.println("🌟");

    ///////////////////////////////////////////////////////

    // Cuerpo del árbol ///////////////////////////////////

    int espaciosIzquierda = altura;
    int espaciosCentrales = 0;

    for (int i = 1; i < altura - 3; i++) {

      // Espacios a la izquierda del cuerpo del árbol
      for (int j = 0; j < espaciosIzquierda; j++) {
        System.out.print(" ");
      }

      // Borde izquierdo
      System.out.print("\033[32m/");

      // Centro
      for (int j = 0; j < espaciosCentrales; j++) {
        switch ((int) (Math.random() * 8)) {
        case 0:
          System.out.print("\033[31m*");
          break;
        case 1:
          System.out.print("\033[37m@");
          break;
        case 2:
          System.out.print("\033[36m*");
          break;
        case 3:
          System.out.print("\033[34m@");
          break;
        default:
          System.out.print(" ");
        }
      }

      // Borde derecho
      System.out.println("\033[32m\\");

      espaciosIzquierda--;
      espaciosCentrales += 2;
    }

    // Base del árbol

    // Espacios a la izquierda de la base
    for (int j = 0; j < espaciosIzquierda; j++) {
      System.out.print(" ");
    }

    // Base
    System.out.print("\033[32m/");
    for (int i = 0; i < espaciosCentrales; i++) {
      System.out.print("-");
    }
    System.out.println("\\");

    ///////////////////////////////////////////////////////

    // Tronco ///////////////////////////////////

    for (int i = 0; i < altura; i++) {
      System.out.print(" ");
    }
    System.out.println("\033[33m#");

    for (int i = 0; i < altura; i++) {
      System.out.print(" ");
    }
    System.out.println("\033[33m#");
  }
} 
