/**
 * Ordenar numeros
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio13AleCueto {
  public static void main(String[] args) {
    
    double tercerNumero = 0;
    double segundoNumero = 0;
    double primerNumero = 0;
    
    System.out.println("¡Vamos a ordenar números!\n");
    
    System.out.print("Por favor, introduce el primer número:\n");
    double numero1 = Double.parseDouble(System.console().readLine());
    
    
    System.out.print("Ahora, introduce el segundo número:\n");
    double numero2 = Double.parseDouble(System.console().readLine());

    System.out.print("Por último, introduce el primer número:\n");
    double numero3 = Double.parseDouble(System.console().readLine());
    
    if(numero1 >= numero2){
      tercerNumero = numero1;
      segundoNumero = numero2;
      primerNumero = numero3;
      if(numero1 <= numero3){
        tercerNumero = numero3;
        segundoNumero = numero1;
        primerNumero = numero2;
      } else if(numero2 < numero3){
        tercerNumero = numero1;
        segundoNumero = numero3;
        primerNumero = numero2;
      }
    } else {
      tercerNumero = numero2;
      segundoNumero = numero1;
      primerNumero = numero3;
      if(numero2 <= numero3){
        tercerNumero = numero3;
        segundoNumero = numero2;
        primerNumero = numero1;
      } else if(numero1 < numero3){
        tercerNumero = numero2;
        segundoNumero = numero3;
        primerNumero = numero1;
      }
    }
    
/*
    if(numero2 >= numero1){
      segundoNumero = numero2;
      if(numero2 >= numero3){
        primerNumero = numero2;
      } else {
        tercerNumero = numero2;
      }
    }
    
    if(numero3 >= numero1){
      segundoNumero = numero3;
      if(numero3 >= numero2){
        primerNumero = numero3;
      } else {
        tercerNumero = numero3;
      }
    }
*/
    System.out.print("El orden es: primero " + primerNumero + " segundo " + segundoNumero + " y tercero " + tercerNumero);
    
  }
}
