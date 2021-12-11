/**
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio42AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Mira cuantos pares hay en un número!: \n");
    System.out.print("Por favor, introduce el número en cuestión: ");
    long numero = Integer.parseInt(System.console().readLine());    
    int pares= 0;
    int impares =0;

    while(numero > 0){
      if((numero%10)%2 == 0){
        pares++;
      }else{
        impares++;
      }
      
      numero= numero/10;
    }

    System.out.println("Hay " + pares + " números pares y " + impares + " números impares.");

  }
}