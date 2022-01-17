/**
 * 
 * 
 * 
 * @author Ale Cueto
 */
public class Tema08Ejercicio06AleCueto {
  public static void main(String[] args) throws InterruptedException{
    System.out.print("Vamos a mostrar un array con 60 celdas\n");

    int mayorCol = 0;
    int mayorFil = 0;
    int mayor = 0;

    int contador = 0;
    int numeros[] = new int[60];

    int array[][] = new int[10][6];

    for (int i = 0; i < 60; i++) {
      numeros[i] = (int)(Math.random() * 60);
      for (int j = 0; j < numeros.length; j++) {
        while(numeros[i] == numeros[j]){
          numeros[i] = (int)(Math.random() * 60);
        }
      }
    }


    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        array[i][j] = numeros[contador];
        contador ++;

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
