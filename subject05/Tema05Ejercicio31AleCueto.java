/**
 * ¡Pinta una L de altura determinada por pantalla!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio31AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Dame el alto y te daré una L!: ");

    System.out.print("\n¿Como de alta quieres que sea la L? ");
    int altura = Integer.parseInt(System.console().readLine());
    int longitud = altura/2;

    System.out.print("\n");

    for(int h = 1; h <= altura; h++){
      System.out.print('*' + "\n");
    }

    for(int h = 0; h <= longitud; h++){
      System.out.print("* ");
    }
    System.out.println("\n");
  }
}   
