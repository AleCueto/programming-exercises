import javax.print.attribute.standard.Media;

/**
 * ¡Introduce números hasta que sume 10000 y calculamos con eso!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio23AleCueto {
  public static void main(String[] args) {
    
    System.out.println("¡Introduce números hasta que sume 10000 y calculamos con eso!");
    long numero = 0;
    long suma = 0;
    long media = 0;
    int contador = 0;

    do{
      System.out.print("Introduce un número a añadir a la suma: ");
      numero = Long.parseLong(System.console().readLine());
      suma += numero;
      contador ++;
    }while(suma <= 10000);

    media = suma/contador;

    System.out.print("Has introducido " + contador + " números, en total suman " + suma );
    System.out.print(" y la media es " + media + "\n");
  }
}   
