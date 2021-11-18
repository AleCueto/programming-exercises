/**
 * ¡Pide un número y saca los multiplos de 3 desde 1 hasta numero!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio27AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Dame un número y te daré los multiplos de 3 hasta él!: ");

    System.out.print("Primero dame un número: ");
    long numero = Long.parseLong(System.console().readLine());


    for(int i = 1; i < numero; i++){
      if(i%3 == 0){
        System.out.print(i + ", ");
      }
    }
    System.out.println();

  }
}   
