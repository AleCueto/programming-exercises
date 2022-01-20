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

    mostrarTablero(tablero);
    
    //Posicion player 1
    int p1x = 0;
    int p1y = 0;
    

    //Posición player 2
    int p2x = 0;
    int p2y = 0;

    int diagonal1 = 0;
    int diagonal2 = 0;
    
    boolean valido = false;

    boolean finJuego = false;

    for (int i = 0; i < 9 && finJuego == false; i++) {

      //---------------------------  JUGADOR 1 ------------------------------------------//

      while(!valido){

        System.out.println("---- JUGADOR 1 ----");
        System.out.println("Indica la posición en X:");
        p1x = Integer.parseInt(System.console().readLine());
        
        System.out.println("Indica la posición en Y:");
        p1y = Integer.parseInt(System.console().readLine());
      
        if(tablero[p1y][p1x] == 0){
          tablero[p1y][p1x] = 5;
          valido = true;
        }

      }
      
      valido = false;
      //---------------------------  JUGADOR 2 ------------------------------------------//

      
      while(!valido){
        
        System.out.println("---- JUGADOR 2 ----");
        System.out.println("Indica la posición en X:");
        p2x = Integer.parseInt(System.console().readLine());
        
        System.out.println("Indica la posición en Y:");
        p2y = Integer.parseInt(System.console().readLine());
      
        if(tablero[p2y][p2x] == 0){
          tablero[p2y][p2x] = 3;
          valido = true;
        }
    
      }
      
    valido = false;
    mostrarTablero(tablero);
    // ------------------------------ COMPROBAR SI ALGUIEN GANA -----------------------//

      int sumaFila = 0;
      int sumaColumna[] = new int [3];
          

      //------------------------------- HORIZONTAL Y VERTICAL ------------------------//

      for (int z = 0; z < tablero.length; z++) {
        for (int j = 0; j < tablero[0].length; j++) {
          sumaFila += tablero[z][j];
          sumaColumna[j] += tablero[z][j];
          //System.out.print(tablero[z][j] + "  ");
        }
        //System.out.print("Fila " + i + ": " + sumaFila);
        if(sumaFila == 15){
          System.out.println("GANA J1");
        }

        if(sumaFila == 9){
          System.out.println("GANA J2");
        }

        sumaFila = 0;
        System.out.println();
      }

      for (int z = 0; z < tablero.length; z++) {
        if(sumaColumna[z] == 15){
          System.out.println("GANA J1");
          finJuego = true;
        } else if(sumaColumna[z] == 9){
          System.out.println("GANA J2");
          finJuego = true;
        }
      }

      // ----------------------------------------- DIAGONAL --------------------------------- //

      diagonal1 = tablero[0][0] + tablero[1][1] + tablero[2][2];

      if(diagonal1 == 15){
        System.out.println("GANA J1");
        finJuego = true;
      } else if(diagonal1 == 3){
        System.out.println("GANA J2");
        finJuego = true;
      }

      diagonal2 = tablero[2][0] + tablero[1][1] + tablero[0][2];
      
      if(diagonal2 == 15){
        System.out.println("GANA J1");
        finJuego = true;
      } else if(diagonal2 == 3){
        System.out.println("GANA J2");
        finJuego = true;
      }

    }



    }
      
    
    static private void mostrarTablero(int tablero[][]){

      for (int i = 0; i < tablero.length; i++) {
        for (int j = 0; j < tablero[0].length; j++) {
          System.out.print(tablero[i][j]);
        }
        System.out.println();
      }

    }


}
