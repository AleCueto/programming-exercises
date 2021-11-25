/**
 * ¡Tira tres dados y muestra la suma!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema06Ejercicio3AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Muestra al azar el nombre de una numeroCarta de la baraja española!: ");
    int numeroCarta = 0;
    int paloCarta = 0;


      numeroCarta = (int)(Math.random()*10) + 1;
      
      switch(numeroCarta){
        case 1:
        System.out.print("As");
        break;
        
        case 2:
        System.out.print("dos");
        break;
        
        case 3:
        System.out.print("tres");
        break;
        
        case 4:
        System.out.print("cuatro");
        break;
        
        case 5:
        System.out.print("cinco");
        break;
        
        case 6:
        System.out.print("seis");
        break;
        
        case 7:
        System.out.print("siete");
        break;
        
        case 8:
        System.out.print("ocho");
        break;

        case 9:
        System.out.print("nueve");
        break;

        case 10:
        System.out.print("diez");
        break;

        case 11:
        System.out.print("Sota");
        break;
        
        case 12:
        System.out.print("Caballo");
        break;
        
        case 13:
        System.out.print("Rey");
        break;
      }
      
      System.out.print(" de ");
      
      paloCarta = (int)(Math.random()*4)+1;

      switch(paloCarta){
        case 1:
        System.out.print("oro");
        break;
        case 2:
        System.out.print("espadas");
        break;
        case 3:
        System.out.print("bastos");
        break;
        case 4:
        System.out.print("copas");
        break;
      }

    System.out.println("\n");

  }
}   
