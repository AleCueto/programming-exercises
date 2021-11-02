/**
 * ¡Muestro cuadrado y cubo!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio11AleCueto {
  public static void main(String[] args) {

    Double numero = 0.0;
    Double media = 0.0;

    System.out.println("¡Vamos a mostrar el cuadrado y el cubo de los 5 numeros después del que escribas!");
    System.out.println("Se dejarán de añadir números cuando introduzcas un negativo");

    System.out.print("\n¡Elige el número por el que deseas empezar!: ");
    numero = Double.parseDouble(System.console().readLine());

    System.out.println("--------------------");
    System.out.println("| CUADRADO |  CUBO  |");

    for(int i = 0; i <= 5; i++){
      double cuadrado = (numero + i) * (numero + i);
      double cubo = (numero + i) * (numero + i) * (numero + i);
      System.out.printf("| %.2f     ||  %.2f  |\n", cuadrado, cubo);
    }

    System.out.println("--------------------");

  }
}
