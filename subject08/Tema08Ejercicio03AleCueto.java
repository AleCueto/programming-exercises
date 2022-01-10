/**
 * 
 * 
 * 
 * @author Ale Cueto
 */
public class Tema08Ejercicio03AleCueto {
  public static void main(String[] args) {
    System.out.print("Vamos a mostrar un array con 20 celdas\n");

    int sumaFila = 0;
    int sumaColumna[] = new int [5];

    int array[][] = new int[5][4];

    array[0][0] = 0;
    array[0][1] = 30;
    array[0][3] = 2;
    array[0][2] = 5;
    array[1][0] = 75;
    array[1][3] = 0;
    array[2][2] = -2;
    array[2][3] = 9;
    array[2][1] = 11;

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        array[i][j] = (int)(Math.random()*899) + 100;
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

    for (int i = 0; i < array.length; i++) {
      System.out.print(sumaColumna[i] + " ");
    }
  }
}
