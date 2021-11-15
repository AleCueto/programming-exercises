/**
 * ¡vamos a pintar una pirámide hueca con altura determinada por teclado!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio20AleCueto {
  public static void main(String[] args) {
    
    System.out.println("¡vamos a pintar una pirámide hueca con altura determinada por teclado!");

    System.out.print("\nDime el carácter con el que quieres crear la pirámide: ");
    char caracter = System.console().readLine().charAt(0);

    System.out.print("Ahora dime la altura que quieres que rodee la pirámide: ");
    long altura = Long.parseLong(System.console().readLine());

    System.out.println("\n");
    long espacios = (altura * 2 - 1)/2;

    for(int i = 0; i < altura; i++){
      for(int n = 0; n < espacios - i; n++){
        System.out.print(" ");
      }
      for(int x = 0; x <= i * 2; x++){
        if(x == 0 || x == i * 2 || i == altura -1){
          System.out.print(caracter);
        } else {
          System.out.print(" ");
        }
      }

      for(int n = 0; n < espacios - i; n++){
        System.out.print(" ");
      }
      System.out.print("\n");
    }
  }
}   
