/**
 * 
 * 
 * 
 * @author Ale Cueto
 */
public class Tema08Ejercicio11AleCueto {
  public static void main(String[] args) throws InterruptedException{

    int numeros[][] = new int[10][10];

    for (int i = 0; i < numeros.length; i++) {
      for (int j = 0; j < numeros[0].length; j++) {
        numeros[i][j] = (int)(Math.random()*100) + 200;
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


    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i][i] + " ");
    }


    }
      
    
}
