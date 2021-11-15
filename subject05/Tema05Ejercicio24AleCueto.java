/**
 * ¡Introduce números hasta que sume 10000 y calculamos con eso!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio24AleCueto {
  public static void main(String[] args) {
     
    System.out.println("¡vamos a pintar una pirámide con n carácter con altura determinada por teclado!");

    
    System.out.print("Ahora dime la altura que quieres que rodee la pirámide: ");
    long altura = Long.parseLong(System.console().readLine());
    
    System.out.println("\n");
    long espacios = (altura * 2 - 1)/2;
    int caracter = 0;
    
    for(int i = 0; i < altura; i++){
      for(int n = 0; n < espacios - i; n++){
        System.out.print(" ");
      }

      caracter = 0;

      for(int x = 0; x <= i * 2; x++){
        if(caracter >= x){
          caracter++;
        } else if(caracter < x){
          caracter--;
        }
        System.out.print(caracter);
      }
      for(int n = 0; n < espacios - i; n++){
        System.out.print(" ");
      }
      System.out.print("\n");
    }
  }
}   
