/**
 * Ordena reyes
 * 
 * 
 * @author Ale Cueto
 */
public class Tema08Ejercicio01AleCueto {
  public static void main(String[] args) {
    System.out.print("Vamos a mostrar un array con 3 filas y 6 columnas\n");

    int array[][] = new int[3][6];

    array[0][0] = 0;
    array[0][1] = 30;
    array[0][2] = 2;
    array[0][5] = 5;
    array[1][0] = 75;
    array[1][4] = 0;
    array[2][2] = -2;
    array[2][3] = 9;
    array[2][5] = 11;


    
    for (int i = 0; i < array.length; i++) {
      System.out.print("Fila " + i + ": ");
      for (int j = 0; j < array[0].length; j++) {
        System.out.print(array[i][j] + "  ");
      }
      System.out.println();
    }
  }
}
