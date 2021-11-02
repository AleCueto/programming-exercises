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
    System.out.println("Se dejarán de añadir números cuando introduzcas un negativo");
    int i = -1;

    do{
      System.out.print("\n¡Añáde un nuevo número a la media!: ");
      numero = Double.parseDouble(System.console().readLine());
      if(numero >= 0){
        media += numero;
      }
      i++;
    }while(numero >= 0);


    media = media/i;
    System.out.println("La media es igual a " + media);
  }
}
