/**
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio43AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Parte un número!: \n");
    System.out.print("Por favor, introduce el número en cuestión: ");
    long numero = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora dime por que dígito quieres partirlo: ");
    long digito = Integer.parseInt(System.console().readLine());

    long divisor = 1;

    long primeraMitad = 0;
    long segundaMitad = 0;

    for (int i = 0; i < ( DigitosNumero(numero) - digito); i++) {
      divisor *= 10;
    }

    primeraMitad = numero / divisor;

    segundaMitad = numero - primeraMitad * divisor;

    System.out.println("La primera mitad es " + primeraMitad + " y la segunda mitad es " + segundaMitad);

  }

  public static int DigitosNumero(long numero) {
    int digitos = 0;

    while (numero > 0) {
      digitos++;
      numero = numero / 10;
    }

    return digitos;
  }
}