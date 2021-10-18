/**
 * Pide un numero de euros y lo pasa a pesetas
 *
 * @author Ale Cueto
 */
public class Tema03Ejercicio03AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a pasar de pesetas a euros!");
    System.out.println("Introduce el número de pesetas que quieres convertir:");
    int pesetas = Integer.parseInt(System.console().readLine());
    System.out.printf("%d pesetas equivalen a %.2f€", pesetas, pesetas / 166.386);
  }
}


