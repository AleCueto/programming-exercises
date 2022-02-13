/**
 * 
 * 
 * 
 * @author Ale Cueto
 */
public class ejercicioDescartadoExamen {
  public static void main(String[] args) throws InterruptedException{

    int[][] array = new int[4][4];

    rellenaArray(array);

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        System.out.printf("%2d ",array[j][i]);
      }
      System.out.println();
    }

    }

    private static void rellenaArray(int[][] a){

      String direccion = "derecha";

      int contador = 0;
      int aux = 0;

      int posx = 0, posy = 0;

      int limiteDerecha = a[0].length -1, limiteIzquierda = 0, limiteArriba = 0, limiteAbajo = a.length -1;

      for (int i = 0; i < a.length; i++) { // Da tantas vueltas como elementos haya en el array
        for (int j = 0; j < a[0].length; j++) {

          //System.out.print("(" + posx + ", " + posy + ")");

          //j = x
          //i = y  
          a[posx][posy] = contador;

          // if(j== 0 && i == 0){
          //   direccion = "derecha";
          // }

          // if(j == a[0].length-1 && i == 0){
          //   direccion = "abajo";
          // }

          // if(j == a[0].length-1 && i == a.length-1){
          //   direccion = "izquierda";
          // }

          // System.out.println( (a[0].length -1) + " | " + (a.length - 1));

          // if(j == 0 && i == a.length-1){
          //   direccion = "arriba";
          // }


          if(posx== limiteIzquierda && posy == limiteArriba){
            if(limiteArriba != 0 && limiteIzquierda == aux){
              direccion = "derecha";
              limiteIzquierda++;
            }
            aux = limiteArriba;
          }

          if(posx == limiteDerecha && posy == limiteArriba){
            if(limiteArriba == aux){
              direccion = "abajo";
              limiteArriba++;
            }
            aux = limiteDerecha;
          }

          if(posx == limiteDerecha && posy == limiteAbajo){
            if(limiteDerecha == aux){
              direccion = "izquierda";
              limiteDerecha --;
            }
            aux = limiteAbajo;
          }


          if(posx == limiteIzquierda && posy == limiteAbajo){
            if(limiteAbajo == aux){
              direccion = "arriba";
              limiteAbajo--;
            }
            aux = limiteIzquierda;
          }



          switch(direccion){
            
            case "derecha":
              posx++;
            break;

            case "abajo":
              posy++;
            break;

            case "izquierda":
              posx--;
            break;

            case "arriba":
              posy--;
            break;

          }


          contador++;

        }

        System.out.println();

      }

    }


}
