/**
 * Define un array de 12 numeros e introduce un contenido determinado
 * 
 * 
 * @author Ale Cueto
 */
public class Tema07Ejercicio01AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a hacer un array de 12 números!\n");
    
    int[] num = new int[12];

    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;

    
    for (int i = 0; i < num.length; i++) {
      System.out.printf("%3d", i);
      System.out.println(": " + num[i]);
    }

    System.out.println("\n\nLos valores en los índices que no han sido asignados por defecto tienen el valor 0");
  }
}
