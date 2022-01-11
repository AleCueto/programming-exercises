/**
 * 
 * 
 * 
 * @author Ale Cueto
 */
public class Tema08Ejercicio02AleCueto {
  public static void main(String[] args) {
    System.out.print("Vamos a mostrar un array con 20 celdas\n");

    int sumaFila = 0;
    int sumaColumna[] = new int [5];

    int array[][] = new int[5][4];

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        System.out.print("Introduce el número de la fila " + i + " y la columna " + j + ": ");
        array[i][j] = Integer.parseInt(System.console().readLine());
      }
    }
    
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        sumaFila += array[i][j];
        sumaColumna[j] += array[i][j];
        System.out.print(array[i][j] + "  ");
      }
      System.out.print("Fila " + i + ": " + sumaFila);
      sumaFila = 0;
      System.out.println();
    }

    for (int i = 0; i < array.length -1; i++) {
      System.out.print(sumaColumna[i] + "  ");
    }
  }
}
