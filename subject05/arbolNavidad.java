/**
 * ¡Pinta árbol de navidad!
 * 
 * 
 * @author Ale Cueto
 */
public class arbolNavidad {
  public static void main(String[] args) {

    System.out.print("¡Este programa pinta un árbol de navidad!: ");

    System.out.print("\nPor favor, introduzca una altura: ");
    int h = Integer.parseInt(System.console().readLine());

    char caracter = ' ';
    
    for(int i = h; i>=0; i--){
      if(i == h){
        caracter = '⭐';
      } else if (i <= 1){
        caracter = '#';
      } else if (i == 2){
        caracter = '-';
      } else{
        caracter = '/';
      }

      System.out.println(caracter);
      int x = 0;
      for(int espacios = h*2-1; espacios >= 0; espacios--){
        char caracterespacio = ' ';//vamos para atras pirámide
        x++;
      }
    }

  }   
}