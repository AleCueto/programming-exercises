/**
 * ¡Pinta una L de altura determinada por pantalla!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio32AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Dame un número y operaré con sus dígitos!: ");

    System.out.print("\n¿Introduce el número? ");
    long numero = Integer.parseInt(System.console().readLine());
    long volteado = 0;
    int pares = 0;
    int suma = 0;

    while(numero > 0){
      volteado = (volteado*10) + (numero%10);
      numero /= 10;
    }
    
    System.out.print("Dígitos pares: " );

    while(volteado > 0){
      volteado /= 10;
      if((volteado%10) % 2 == 0){
        System.out.print(volteado%10 + " ");
        pares++;
        suma += volteado%10;
      }
    }
    System.out.println("\n");
    System.out.println("Hay" + pares + "numeros pares y en total suman " + suma);
  }
}   
