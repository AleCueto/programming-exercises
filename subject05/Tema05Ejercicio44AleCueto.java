/**
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio44AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Parte un número!: \n");
    System.out.print("Por favor, introduce el número en cuestión: ");
    long numero = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora dime por que dígito quieres partirlo: ");
    long digito = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora dime el número que quieres meter entre medias:");
    long introducido = Integer.parseInt(System.console().readLine());


    long divisor = 1;

    long primeraMitad = 0;
    long segundaMitad = 0;

    for (int i = 0; i < digito -1; i++) {
      divisor *= 10;
    }



    primeraMitad = numero/divisor;

    segundaMitad = numero - primeraMitad * divisor;

    System.out.println("" + primeraMitad + introducido + segundaMitad);

  }
}