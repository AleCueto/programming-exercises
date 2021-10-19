/**
 * Da buenos dias, tardes o noches, según la hora
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio02AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Bienvenido! ¿me podrías decir que hora es?");
    int hora = Integer.parseInt(System.console().readLine());
    
    if( hora <= 12 && hora >=6){
        System.out.println("Buenos dias");
      }
    else if( hora <= 20 && hora >= 13){
      System.out.println("Buenas tardes");
      }
    else if( hora <= 5 || hora >= 21){
      System.out.println("Buenas noches");
    }
  }
}
