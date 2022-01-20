/**
 * 
 * 
 * 
 * @author Ale Cueto
 */
public class Tema08Ejercicio12AleCueto {
  public static void main(String[] args) throws InterruptedException{

    int numeros[][] = new int[9][9];

    for (int i = 0; i < numeros.length; i++) {
      for (int j = 0; j < numeros[0].length; j++) {
        numeros[i][j] = (int)(Math.random()*400) + 500;
      }
    }

    for (int i = 0; i < numeros.length; i++) {
      for (int j = 0; j < numeros[0].length; j++) {
        System.out.print(numeros[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println();
    System.out.println();

    int j = 0;
    
    for (int i = 8; i > 0; i--) {
      System.out.print(numeros[i][j] + " ");
      j++;
    }


    }
      
    
}
