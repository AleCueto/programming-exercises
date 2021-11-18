/**
 * ¡Pide un número y saca su factorial!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio28AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Dame un número y te daré su factorial!: ");

    System.out.print("Primero dame un número: ");
    long numero = Long.parseLong(System.console().readLine());
    long factorial = 1;

    for(int i = 1; i <= numero; i++){
      System.out.print(i);
      factorial *= i; 
      if(i < numero){
        System.err.print(" x ");
      } else{
        System.out.print(" = ");
      }
    }

    System.out.print(factorial);

    System.out.println();

  }
}   
