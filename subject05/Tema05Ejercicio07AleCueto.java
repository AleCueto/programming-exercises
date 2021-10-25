/**
 * ¡Ingresa los números para abrir una caja fuerte!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio07AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Debes intentar abrir la caja fuerte. Pon los 4 dígitos secretos. Tienes 4 intentos!\n");
    
    int pass = 1234;
    
    int intentos = 4;

    boolean resuelto = false;
    
    do{
      System.out.println("\n¡Introduce la contraseña de la caja fuerte!\n");
      int numeroIntroducido = Integer.parseInt(System.console().readLine());
      
      if(numeroIntroducido == pass){
        resuelto = true;
      } else{
        intentos--;
      }
      
    } while(resuelto == false && intentos > 0);
    
    
    
    if(resuelto == true){
      System.out.println("\nFelicidades, has abierto la caja fuerte, toma tu recompensa: 💰💰💰");
    } else{
      System.out.println("\nLo siento, se han acabado tus intentos. Reinicia al programa");
    }
    
    
  }
}
