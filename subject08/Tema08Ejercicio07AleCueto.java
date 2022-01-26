/**
 * 
 * 
 * 
 * @author Ale Cueto
 */
public class Tema08Ejercicio07AleCueto {
  public static void main(String[] args) throws InterruptedException{
    System.out.print("BUSCAMINAS:\n");

    /*creamos un tablero*/
    int tablero[][] = new int[5][5];

    /*Ponemos número random de bombas*/
    int bombas = (int)(Math.random() * 6) + 1; 

    int bombasX[] = new int[bombas];
    int bombasY[] = new int[bombas];

    
    /*Posición random de bombas*/
    for (int i = 0; i < bombasY.length; i++) {
      bombasX[i] = (int)(Math.random() * tablero.length); //posición en x de las bombas
      bombasY[i] = (int)(Math.random() * tablero.length); //posición en y de las bombas
      
    }

    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[0].length; j++) {
        
        tablero[i][j] = 0;
      }
      System.out.println();
    }



  }
}
