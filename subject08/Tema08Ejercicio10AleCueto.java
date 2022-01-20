/**
 * 
 * 
 * 
 * @author Ale Cueto
 */
public class Tema08Ejercicio10AleCueto {
  public static void main(String[] args) throws InterruptedException{
    System.out.print("TRES EN RAYA\n");
    int tablero[][] = new int[3][3];

    boolean correcto = false;

    for (int i = 0; i < tablero.length; i++) {
      for (int j = 0; j < tablero[0].length; j++) {
        System.out.print(0);
      }
      System.out.println();
    }

    boolean fin = false;
    while(!fin){
    
    for (int i = 0; i < 9; i++) {
      
      
      System.out.println("--JUGADOR 1. Elija posición:--");
      System.out.print("x: ");
      
      while(!correcto){
        
        int pj1x = Integer.parseInt(System.console().readLine());
        
        System.out.println();
        
        System.out.print("y: ");
        int pj1y = Integer.parseInt(System.console().readLine());
        
        if(tablero[pj1y][pj1x] == 0){
          tablero[pj1y][pj1x] = 1; 
          correcto = true;
        }
      }
      
      correcto = false;
      
        
        while(!correcto){
          
          System.out.println("--JUGADOR 2. Elija posición:--");
          System.out.print("x: ");
          int pj2x = Integer.parseInt(System.console().readLine());
          
          System.out.println();
          
          System.out.print("y: ");
          int pj2y = Integer.parseInt(System.console().readLine());
          
          if(tablero[pj2y][pj2x] == 0){
            tablero[pj2y][pj2x] = 5; 
            correcto = true;
          }
        }
        
        
        
        for (int y = 0; y < tablero.length; y++) {
          for (int j = 0; j < tablero[0].length; j++) {
            System.out.print(tablero[y][j]);
          }
          System.out.println();
        }
        
        
        for (int y = 0; y < tablero.length; y++) { 
          if(tablero[y][0] + tablero[y][1] + tablero[y][2] == 3 ){
            System.out.println("Gana J1");
            fin = true;
          } else if (tablero[y][0] + tablero[y][1] + tablero[y][2] == 15 && !fin){
            System.out.println("Gana J2");
            fin = true;
          }
          System.out.println();
        }
        
        correcto = false;
        
      }
    }


    }
      
    
}
