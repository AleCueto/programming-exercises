/**
 * ¡Pide base y exponente y hace la operación con todos los exponentes hasta el dado!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio15AleCueto {
  public static void main(String[] args) {
    
    System.out.println("¡Vamos a calcular todas las potencias de una base hasta x exponente!");
    
    System.out.print("\nPrimero dame la base: ");
    int base = (int) Double.parseDouble(System.console().readLine());
    
    int resultado = 1;
    

    System.out.print("Ahora dame el último exponente que deseas calcular: ");
    int exponente = (int) Double.parseDouble(System.console().readLine());
    
    int exponenteAux = 0;

    while(exponenteAux <= exponente){

      for(int i = 0; i < exponenteAux; i++){
        resultado = resultado * base;
      }
      
      System.out.println("\n" + base + " elevado a " + exponenteAux + " = " + resultado + "\n");
      exponenteAux ++;
      resultado = 1;
    }

  } // while(exponente <= exponente)
      
  }
    
