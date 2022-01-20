/**
 * 
 * 
 * 
 * @author Ale Cueto
 */
public class Tema08Ejercicio13AleCueto {
  public static void main(String[] args) throws InterruptedException{

    String paises[] = {"España", "Rusia", "Japón", "Australia"}; 

    int estaturas[][] = new int[4][10];
    
    for (int i = 0; i < estaturas.length; i++) {
      for (int j = 0; j < estaturas[0].length; j++) {
        estaturas[i][j] = (int)(Math.random() * 70) + 140;
      }
    }

    System.out.printf("%69s", "MED MIN MAX");
    System.out.println();
    
    for (int i = 0; i < estaturas.length; i++) {
      System.out.printf("%11s : ",paises[i], ": ");

      int minimo = 999999;
      int maximo = 0;
      int total = 0;

      


      for (int j = 0; j < estaturas[0].length; j++) {

        if(estaturas[i][j] < minimo){ // Comprueba mínimo
          minimo = estaturas[i][j];
        }

        if(estaturas[i][j] > maximo){ // Comprueba máximo
          maximo = estaturas[i][j];
        }

        total += estaturas[i][j];

        System.out.printf("%4d", estaturas[i][j]);
      }

      //Calculamos media
      System.out.print(" | ");
      System.out.printf("%4d", (int)(total / 10));
      System.out.printf("%4d", minimo);
      System.out.printf("%4d", maximo);

      System.out.println();
    }

    }
      
    
}
