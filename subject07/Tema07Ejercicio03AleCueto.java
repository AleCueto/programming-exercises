/**
 * Define un array de 12 numeros e introduce un contenido determinado
 * 
 * 
 * @author Ale Cueto
 */
public class Tema07Ejercicio03AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a hacer un array de 10 caracteres!\n");
    
    int[] num = new int[10];



    for (int i = 0; i < num.length; i++) {
      System.out.print("Dime el número que quieres que vaya en la posición " + i + ": ");
      num[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println();

    for (int i = num.length-1; i >= 0; i--) {
      System.out.print(num[i] + ", ");
    }
  }
}
