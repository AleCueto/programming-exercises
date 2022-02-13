import javax.lang.model.element.Element;

/**
 * 
 * 
 * 
 * @author Ale Cueto
 */
public class ejercicioBorde {
  public static void main(String[] args) throws InterruptedException{

    int[][] array = new int[5][4]; // x y

    //bordeHomogeneo(array);
    // noBordeHomogeneo(array);
    muestraArray(array);

    System.out.println(tieneBordeHomogeneo(array));

    }
  
    public static void bordeHomogeneo(int[][] a){

      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[0].length; j++) {
          if(i == 0 || j == 0 || i == a.length -1 || j == a[0].length-1){ 
            a[i][j] = 2;
          } else{
            a[i][j] = (int)(Math.random() * 10);
          }
        }
      }

    }

    public static void noBordeHomogeneo(int[][] a){

      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[0].length; j++) {
          a[i][j] = (int)(Math.random() * 10);
        }
      }
    }

    public static void muestraArray(int[][] a){
      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[0].length; j++) {
          System.out.print(a[i][j] + " ");
        }
        System.out.println();
      }
    }


  public static boolean tieneBordeHomogeneo(int[ ][ ] a){
    boolean homogeneo = true;
    int primerValor = a[0][0];

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {

        if(i == 0 || j == 0 || i == a.length -1 || j == a[0].length-1){ 
        
          if(a[i][j] != primerValor){
            homogeneo = false;
          }
        
        }
      }
    }
    return homogeneo;
  }
    
}
