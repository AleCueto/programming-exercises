/**
 * ¡Pinta 10 líneas con carácter y longitud aleatoria!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema06Ejercicio10AleCuetov2 {
  public static void main(String[] args) {

    System.out.print("¡Pintamos 10 líneas con carácteres y longitud aleatorias!: \n \n");
    String caracter = "";
    
    for (int i = 0; i < 10; i++) {

        int caracterNum = SacaAleatorio(6, 0);
        switch(caracterNum){
          case 0:
          caracter = "*";
        break;

        case 1:
        caracter = "-";
        break;

        case 2:
        caracter = "=";
        break;

        case 3:
        caracter = ".";
        break;

        case 4:
        caracter = "|";
        break;
        
        case 5:
        caracter = "@";
        break;
      }

      int lineaLongitud = SacaAleatorio(40, 1);

      for (int j = 0; j < lineaLongitud; j++) {
        System.out.print(caracter);
      }

      System.out.println();

    }
    
  }


  public static int SacaAleatorio(int cuantos, int inicio){
    int numero = (int)(Math.random()*cuantos + inicio);
    return numero;
  }

}   
