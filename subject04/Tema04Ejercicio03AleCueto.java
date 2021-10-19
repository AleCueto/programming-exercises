/**
 * Dice el dia de la semana
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio03AleCueto {
  public static void main(String[] args) {
    System.out.print("Escribe un número, y yo te daré su correspondiente dia de la semana (del 1 al 7)");
    int dia = Integer.parseInt(System.console().readLine());
    
    if(dia >= 1 && dia <= 7){
    
    switch(dia){
      
      case 1: System.out.println("LUNES");
      break;
      
      case 2: System.out.println("MARTES");
      break;
      
      case 3: System.out.println("MIÉRCOLES");
      break;
      
      case 4: System.out.println("JUEVES");
      break;
      
      case 5: System.out.println("VIERNES");
      break;
      
      case 6: System.out.println("SÁBADO");
      break;
      
      case 7: System.out.println("DOMINGO");
      break;
      
    } 
    } else {
      System.out.print("Has escrito mal el número, por favor, ejecuta de nuevo el programa e ingresa un número del 1 al 7");
    }
  }
}
