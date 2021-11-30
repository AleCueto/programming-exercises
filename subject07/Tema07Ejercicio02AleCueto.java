/**
 * Define un array de 12 numeros e introduce un contenido determinado
 * 
 * 
 * @author Ale Cueto
 */
public class Tema07Ejercicio02AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a hacer un array de 10 caracteres!\n");
    
    char[] simbolo = new char[10];

    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';

    
    for (int i = 0; i < simbolo.length; i++) {
      System.out.printf("%3d", i);
      System.out.println(": " + simbolo[i]);
    }

    System.out.println("\n\nLos valores en los índices que no han sido asignados por defecto tienen el valor \" \"");
  }
}
