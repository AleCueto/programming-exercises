/**
 * ¡Pide un número y saca todos los enteros positivos menores a este y no divisibles por otro!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio29AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Dos números y te sacare los menores de uno y no divisibles del otro!: ");

    System.out.print("\nPrimero dame un número: ");
    long numero = Long.parseLong(System.console().readLine());

    System.out.print("Ahora dame otro, del que no serán divisible los números que saque: ");
    long noDivisible = Long.parseLong(System.console().readLine());

    for(int i = 1; i <= numero; i++){
      if(i % noDivisible != 0){
        System.out.print(i + ", ");
      }
    }
    System.out.println();


  }
}   
