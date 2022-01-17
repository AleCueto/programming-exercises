import javafx.css.CssMetaData;

/**
 * 
 * 
 * 
 * @author Ale Cueto
 */
public class Tema08Ejercicio08AleCueto {
  public static void main(String[] args) throws InterruptedException{
    System.out.print("Vamos a jugar ajedrez\n");
    
    String casillas[][] = new String[8][8];
    int numero = 1;
    String letra = "a";

    //Crea el tablero de ajedrez
    for (int i = 0; i < casillas.length; i++) {
      for (int j = 0; j < casillas[0].length; j++) {
        switch (i) {
          
          case 1:
            letra = "b";
          break;

          case 2:
            letra = "c";
          
          break;
          
          case 3:
            letra = "d";

          break;
          
          case 4:
            letra = "e";
          
          break;
          
          case 5:
          letra = "f";
          
          break;
          
          case 6:
          letra = "g";
          
          break;
          
          case 7:
          letra = "h";
          
          break;
        
          default:
            break;
        }
        
        
        casillas[i][j] = letra + numero;

        numero++;


        if(numero > 8){
          numero = 1;
        }
      }
      //System.out.println();
    }
    //Crea el tablero de ajedrez



    //Pide la posición del álfil
    int posx, posy;

    System.out.print("Dime la posición en x del álfil: ");
    posx = Integer.parseInt(System.console().readLine());


    System.out.print("Dime la posición en y del álfil: ");
    posy = Integer.parseInt(System.console().readLine());
    //Pide la posición del álfil


    //Calcula posiciones

    int posicionesDerecha = casillas.length - posx;
    int posicionesIzquierda = posx;

    int posicionesArriba = casillas.length - posy;
    int posicionesAbajo = posy;


    //Calcula posiciones

    //Saca posiciones


    //Arriba derecha

    for (int i = 1; i <= casillas.length - posx &&  i <= casillas.length - posy; i++) {
      
      System.out.println(casillas[(posx -1) + i][(posy) + i - 1]); // posicion actual
      
    }
    //Arriba derecha

    //Arriba izquierda

    for (int i = 1; i <= posicionesIzquierda &&  i <= posicionesArriba; i++) {
      
      System.out.println(casillas[(posx -1) - i][(posy) + i - 1]); // posicion actual
      
    }
    //Arriba izquierda
    

    //Abajo derecha

    for (int i = 1; i <= posicionesDerecha &&  i <= posicionesAbajo; i++) {
      
      System.out.println(casillas[(posx -1) + i][(posy) - i - 1]); // posicion actual
      
    }
    //Abajo derecha

    //Abajo izquierda

    for (int i = 1; i <= posicionesIzquierda &&  i < posicionesAbajo; i++) {
      
      System.out.println(casillas[(posx -1) - i][(posy) - i - 1]); // posicion actual
      
    }
    //Abajo izquierda
    
    //Saca posiciones

    }
    
}
