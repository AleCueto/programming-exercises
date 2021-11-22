/**
 * ¡Pinta una X de altura determinada por pantalla!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio35AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Dame una altura y te pintaré una X!: ");

    System.out.print("\nIntroduce la altura: ");
    int altura = Integer.parseInt(System.console().readLine());
    int espacio = 0;
    int distanciaEntrePuntos = altura;


    //Pinta X
    espacio = 3;
    distanciaEntrePuntos = altura;
   Boolean chocan = false;
     //Dos puntos
     for(int h = 0; h <= altura -2; h++){
     if(distanciaEntrePuntos != 0 && chocan == false){
       distanciaEntrePuntos -= 2;
       espacio++;
     }
     
     if(chocan == true){
       distanciaEntrePuntos += 2;
       espacio--;
      }
      
      if(distanciaEntrePuntos <= 0){
        chocan = true;
      }

      for(int i = 0; i <= espacio; i++){
        System.out.print(" ");
      }
      System.out.print("*");

      for(int i = 0; i <= distanciaEntrePuntos; i++){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.print("\n");
    }



  }
}   
