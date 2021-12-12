/**
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio45AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Cambia un número por otro!: \n");
    System.out.print("Por favor, introduce el número en cuestión: ");
    long numero = Long.parseLong(System.console().readLine());
    System.out.print("Ahora dime por que dígito quieres partirlo: ");
    long digito = Long.parseLong(System.console().readLine());
    System.out.print("Ahora dime el número que quieres meter entre medias:");
    long introducido = Long.parseLong(System.console().readLine());


    long divisor = 1;

    long primeraMitad = 0;
    long segundaMitad = 0;

    for (int i = 0; i < ( CuentaDigitos(numero) - digito); i++) {
      divisor *= 10;
    }

    primeraMitad = numero / divisor;
    segundaMitad = numero - primeraMitad * divisor;

    primeraMitad -= primeraMitad%10;

    primeraMitad += introducido;


    System.out.println("El número final es " + primeraMitad + "" +  segundaMitad);


  }


  public static int CuentaDigitos(Long numero){
    int digitos = 0;

    while(numero > 0){
      digitos++;
      numero = numero /10;
    }

    return digitos;
  }


  public static long DigitosNumero(long numero, long posicionNumero){
    long digito = 0;
    long numeroContar = numero;
    for (int i = 1; i <= CuentaDigitos(numero) - posicionNumero; i++) {
      numeroContar /= 10;
    }
    
    digito = numeroContar % 10;

    return digito;
  }
}