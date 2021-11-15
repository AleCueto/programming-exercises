/**
 * ¡vamos a pedir números por teclado y a operar con ellos!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio21AleCueto {
  public static void main(String[] args) {
    
    System.out.println("¡vamos a hacer cuentas con los números que introduzcas!");
    int numero = 0;
    int contador = 0;
    int media = 0;
    int numerosImpares = 0;
    int mayor = 0;

    do{
      System.out.print("Introduce un número (seguiremos pidiendo hasta que sea negativo): ");
      numero = Integer.parseInt(System.console().readLine());

      if(numero%2 == 0){
        if(numero > mayor){
          mayor = numero;
        }
      } else if(numero%2 > 0){
        media += numero;
        numerosImpares++;
      }
      contador ++;
    } while(numero > 0);

    media = media / numerosImpares;
    System.out.println("\nHas introducido un total de: " + contador + " números");
    System.out.println("El número par mas grande introduciso es: " + mayor);
    System.out.println("La media de los números impares es: " + media);
  }
}   
