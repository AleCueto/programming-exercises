/**
 * 
 * 
 * 
 * @author Ale Cueto
 */
public class arraysReloj {
    public static void main(String[] args) throws InterruptedException{

      int[][] array = new int[12][12];

      rellenarArray(array);

      mostrarArray(array);

    }    


    public static void rellenarArray(int[][] a){

      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length; j++) {

          a[i][j] = (int)(Math.random() * 100);

        }
      }

    }


    public static void mostrarArray(int[][] a){

      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a.length; j++) {
          System.out.printf("%3d ",a[i][j]);
        }
        System.out.println();
        System.out.println();
      }

    }

    public static void rotarArray(int[][] a){
      int aux = 0;
      for (int i = 0; i < a.length; i++) {
        if(i > 0){
          
        }
        aux = a[i][a[0].length]; //paso a aux el numero más a la derecha de la fila
        for (int j = 0; j < a.length; j++) {
          
        }
      }
    }

}
