/**
 * ¡Pide números por teclado y te los muestra al revés!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio25AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Dame un número y le daré la vuelta!: ");
    long numero = Long.parseLong(System.console().readLine());

    int modulo = 1;

    do{
      System.out.print(numero/modulo % 10);
      modulo = modulo * 10;
    }while(numero/modulo % 10 != 0);

    System.out.println("\n");


  }
}   
