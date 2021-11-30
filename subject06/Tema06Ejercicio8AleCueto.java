/**
 * ¡Genera quiniela con probabilidades alteradas!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema06Ejercicio8AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Generador de quinielas!: \n \n");
    //System.out.println(numero); 
  
    
    String symbol = " ";
    
    
    for (int i = 0; i < 15; i++) {
      System.out.printf("%3d. |", i);
      for (int j = 0; j < 3; j++) {
        
        int random = (int)(Math.random() * 6);
        
        switch(random){
          case 0:
          case 1:
          case 2:
          symbol = "1";
          break;

          case 3:
          case 4:
          symbol = "x";
          break;

          case 5:
          symbol = "2";
          break;
      }
      System.out.print(" "+ symbol + " |");
    }
      System.out.print("\n");
    }

    System.out.print("\n");

    int golesLocal = (int)(Math.random() * 3);
    int golesVisitante = (int)(Math.random() * 3);

    if(golesLocal == 0){
      symbol = "M";
    } else{
      symbol = "" + golesLocal;
    }


    System.out.print("PLENO AL 15 - Local..." + symbol);


    if(golesVisitante == 0){
      symbol = "M";
    } else{
      symbol = "" + golesVisitante;
    }

    System.out.print("    Visitante..." + symbol);

    System.out.println("\n");

  }
}   
