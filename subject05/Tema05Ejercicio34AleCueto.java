/**
 * ¡Pide dos números y mezcla los pares y los impares!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio34AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Dame un número y te daré todos los pares y todos los impares!: ");

    System.out.print("\nDime el número: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int volteado = 0;
    int volteadoAux = 0;

    while(numero > 0){
      volteado = (volteado*10) + (numero%10);
      numero /= 10;
    }
    
    System.out.print("Dígitos pares: " );

    volteadoAux = volteado;

    while(volteadoAux > 0){
      if((volteadoAux%10) % 2 == 0){
        System.out.print(volteadoAux%10 + " ");
      }
      volteadoAux /= 10;
    }

    volteadoAux = volteado;

    System.out.print("\nDígitos impares: " );

    while(volteadoAux > 0){
      if((volteadoAux%10) % 2 != 0){
        System.out.print(volteadoAux%10 + " ");
      }
      volteadoAux /= 10;
    }


  }
}   
