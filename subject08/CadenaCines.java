/**
 * 
 * 
 * 
 * @author Ale Cueto
 */
public class CadenaCines {
  public static void main(String[] args) throws InterruptedException{


    int[] fila = new int[] {0, 0, 1, 0, 1, 1, 0, 0, 1, 0,0,0,0};

    System.out.println(ocupa(fila, 4));

    for (int i = 0; i < fila.length; i++) {
      System.out.print(fila[i] + ", ");
    }

    }

    public static int ocupa(int[] fila, int usuarios){
      int espacios = 0;
      int devuelto = -1;
      int posicionEspacios = 999;
      int espaciosJuntos = 0;

      //comprueba los espacios que hay, y cuenta cuantos espacios hay juntos, si encuentra espacios seguidos, posicionEspacios es la primera butaca
      for (int i = 0; i < fila.length; i++) {
        if(fila[i] == 0){
          espacios++;
          espaciosJuntos++;
          if(espaciosJuntos == usuarios && posicionEspacios == 999){
            posicionEspacios = i - espaciosJuntos;
          }
        } else{
          espaciosJuntos = 0;
        }
      }


      //miramos si hay mas espacios que usuarios
      if(usuarios <= espacios){
        devuelto = 0;
        //Si posicion espacios es diferente al valor dado por defecto, mete los usuarios desde ahí
        if(posicionEspacios != 999){
          for (int i = 0; i <= usuarios; i++) {
            fila[posicionEspacios + i] = 1;
          }
        }else{
          for (int i = 0; i < fila.length; i++) {
            if(fila[i] == 0 && usuarios >= 1){
              fila[i] = 1;
              usuarios --;
            }
          }
        }
      }


      return devuelto;
    }


}
