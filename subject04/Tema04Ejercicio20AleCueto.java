/**
 * Comprobamos si un número es capicúo
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio20AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a ver si un número es capicúa!");
    System.out.print("Introduce el número del que deseas comprobar si es capicúa, debe ser entero y positivo: ");
    
    double numero = Double.parseDouble(System.console().readLine());

    double unidad = numero % 10;
    double decena = (int)numero / 10 % 10;
    double centena = (int)numero / 100 % 10;
    double millar = (int)numero / 1000 % 10;
    double decenaMillar = (int)numero / 10000 % 10;



    boolean capicua = false;


    if((int)numero % 10 > 0){
      capicua = true;
    }

    if((int)numero / 10 % 10 > 0){
      if(decena == unidad){
        capicua = true;
      }
    }

    if((int)numero / 100 % 10 > 0){
      if(centena == unidad){
        capicua = true;
      }
    }

    if((int)numero / 1000 % 10 > 0){
      if(millar == unidad && decena == centena){
        capicua = true;
      }
    }

    if((int)numero / 10000 % 10 > 0){
      if(decenaMillar == unidad && millar == decena){
        capicua = true;
      }
    }

    if(capicua == true){
      System.out.println("El número " + (int)numero + " es capicúa");
    } else{
      System.out.println("El numero " + (int)numero + " no es capicúa");
    }

  }
}
