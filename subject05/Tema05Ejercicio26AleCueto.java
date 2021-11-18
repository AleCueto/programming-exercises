/**
 * ¡Pide un número y un dígito y te dice la posición o posiciones que ocupa!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio26AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Dame un número y un dígito y te daré la posición!: ");

    int posicion = 0;

    System.out.print("Primero dame un número: ");
    long numero = Long.parseLong(System.console().readLine());

    System.out.print("Ahora dame un dígito: ");
    long digito = Long.parseLong(System.console().readLine());

    long volteado = 0;

    while(numero > 0){
      volteado = (volteado*10) + (numero%10);
      numero /= 10;
    }

    while(volteado > 0){
      volteado /= 10;
      if((volteado%10) == digito){
        System.out.println("El dígito "+ digito + " está en la posición " + posicion);
      }
      posicion++;
    }

  }
}   
