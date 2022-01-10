/**
 * 
 * 
 * 
 * @author Ale Cueto
 */
public class Tema08Ejercicio05AleCueto {
  public static void main(String[] args) throws InterruptedException{
    System.out.print("Vamos a mostrar un array con 20 celdas\n");

    int mayorCol = 0;
    int mayorFil = 0;
    int mayor = 0;


    int array[][] = new int[10][6];

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        array[i][j] = (int)(Math.random()*1000);
        if(array[i][j] >= mayor){
          mayor = array[i][j];
          mayorCol = i;
          mayorFil = j;
        }
        System.out.print(array[i][j] + "  ");
      }
      System.out.println();
      System.out.println();
    }

    System.out.println("El número más alto es "+ mayor + " y está en la posición [" + mayorFil + " , " + mayorCol + "]");

  }
}
