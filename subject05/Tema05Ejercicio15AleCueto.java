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
    double base = Double.parseDouble(System.console().readLine());

    double resultado = base;


    System.out.print("Ahora dame el último exponente que deseas calcular: ");
    double aux = Double.parseDouble(System.console().readLine());

    int exponente = (int)aux;
    int exponenteAux = 0;

    for(exponenteAux = 0; exponenteAux <= exponente +1; exponenteAux ++){

      for(int i = 1; i < exponenteAux; i++){
        if(exponenteAux == 0){
          resultado = 0;
        } else{
          resultado = resultado * base;
        }
      }
      
      System.out.println("\n" + base + " elevado a " + exponenteAux + " = " + resultado + "\n");
    }
    
  }
}
