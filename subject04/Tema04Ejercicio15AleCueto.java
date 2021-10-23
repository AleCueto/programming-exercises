/**
 * Elige el relleno de la pirámide y su dirección
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio15AleCueto {
  public static void main(String[] args) {
    
    char x;
    double direccion;
    
    System.out.println("¡Vamos a crear una pirámide personalizada!\n");
    
    System.out.print("Por favor, introduce el carácter con el que quieres rellenar la pirámide\n");
  System.out.print("(En caso de que escribas una cadena de texto se cogerá su primer carácter): ");
    x = (System.console().readLine()).charAt(0);
    
    System.out.print("Ahora elige hacia donde quieres que apunte el vértice de la pirámide: ");
    System.out.println("\n1--> Arriba \n2-->Derecha \n3-->Abajo \n4-->Izquierda");
    System.out.print("Introduce tu respuesta: ");
    direccion = Double.parseDouble(System.console().readLine());



    switch((int)direccion){
    case 1:
    System.out.println("\n    " + x + "    \n   " + x + x + x + "   ");
    System.out.println("  " + x + x + x + x + x + "  ");
    System.out.println(" "+ x + x + x + x + x + x + x + " ");
    System.out.print("" + x + x + x + x + x + x);
    System.out.print("" + x + x + x + "\n");
    break;
    
    case 2:
    System.out.println("\n" + x);
    System.out.println(x + " " + x);
    System.out.println(x + " " + x + " " + x);
    System.out.println(x + " " + x);
    System.out.println(x);
    break;
    
    case 3:
    System.out.print("\n" + x + x + x + x + x + x);
    System.out.print("" + x + x + x + "\n");
    System.out.println(" "+ x + x + x + x + x + x + x + " ");
    System.out.println("  " + x + x + x + x + x + "  ");
    System.out.println("   " + x + x + x + "   " + "\n    " + x + "    \n");
    break;
    
    case 4:
    System.out.println("\n    " + x);
    System.out.println("  " + x + " " + x);
    System.out.println(x + " " + x + " " + x);
    System.out.println("  " + x + " " + x);
    System.out.println("    " + x);
    break;
    }
  }
}
