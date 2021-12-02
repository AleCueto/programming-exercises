/**
 * ¡Pinta 10 líneas con carácter y longitud aleatoria!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema06Ejercicio10AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Pintamos 10 líneas con carácteres y longitud aleatorias!: \n \n");
    //System.out.println(numero); 
  
    for (int i = 0; i < 10; i++) {
      
      
      int randomNum = (int)(Math.random() * 6);
    String character = "";
    
    switch(randomNum){
      case 0:
      character = "*";
      break;
      case 1:
      character = "-";
      break;
      case 2:
      character = "=";
      break;
      case 3:
      character = ".";
      break;
      case 4:
      character = "|";
      break;
      case 5:
      character = "@";
      break;
    }
    
    int lineLongitud = (int)(Math.random() * 40);
    
    for (int h = 0; h < lineLongitud; h++) {
      System.out.print(character);
    }
    System.out.print("\n");
  }
    

  }
}   
