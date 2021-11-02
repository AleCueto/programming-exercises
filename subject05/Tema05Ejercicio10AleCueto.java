/**
 * ¡Muestro una media dinámica!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio10AleCueto {
  public static void main(String[] args) {

    Double numero = 0.0;
    Double media = 0.0;

    System.out.println("¡Vamos a hacer una media que se vaya actualizando!");
    int i = 1;

    while(numero >= 0){
      System.out.print("\n¡Añáde un nuevo número a la media!: ");
      numero = Double.parseDouble(System.console().readLine());
      media = (media + numero) / i;
      i++;
      System.out.println("La media es " + media);
    }
  }
}
