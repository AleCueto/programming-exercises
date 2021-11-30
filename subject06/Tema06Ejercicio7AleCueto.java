/**
 * ¡Tira tres dados y muestra la suma!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema06Ejercicio7AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Generador de quinielas!: \n \n");
    //System.out.println(numero); 
  
    
    String symbol = " ";
    
    
    for (int i = 0; i < 15; i++) {
      System.out.printf("%3d. |", i);
      for (int j = 0; j < 3; j++) {
        
        int random = (int)(Math.random() * 3);
        
        switch(random){
          case 0:
          symbol = "1";
          break;
          
          case 1:
          symbol = "2";
        break;
        
        case 2:
        symbol = "x";
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
