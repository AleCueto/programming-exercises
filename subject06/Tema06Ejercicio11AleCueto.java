/**
 * ¡Muestra 20 notas generadas al azar!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema06Ejercicio11AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Vamos a generar 20 notas aleatorias!: \n \n");
  
    int mark;
    String markVerbose = " ";
    int suspensos=0, suficientes=0, bienes=0, notables=0, sobresalientes=0;

    for(int i = 0; i < 20; i++){

      mark = (int)(Math.random() * 11);

      switch(mark){
        
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
        markVerbose = "Suspenso";
        suspensos++;
      break;
      
      case 5:
      markVerbose = "Suficiente";
      suficientes++;
      break;
      
      case 6:
      markVerbose = "Bien";
        bienes++;
        
      break;
      
      case 7:
      case 8:
        markVerbose = "Notable";
        notables++;      
      break;
      
      case 9:
      case 10:
      markVerbose = "Sobresaliente";
      sobresalientes++;
      break;
    }
    
    System.out.print(markVerbose);
    System.out.print("\n \n");

  }

    System.out.print("La clase ha sacado " + suspensos + " suspensos, ");
    System.out.print(suficientes + " suficientes, " + bienes + " bienes, ");
    System.out.print(notables + " notables y " + sobresalientes + " sobresalientes");
  }
}   
