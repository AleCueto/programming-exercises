/**
 * ¡Pide base y exponente y hace la operación!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio14AleCueto {
  public static void main(String[] args) {

    System.out.println("¡Vamos a hacer una portencia!");
    
    System.out.print("\nPrimero dame la base: ");
    double base = Double.parseDouble(System.console().readLine());

    double resultado = base;


    System.out.print("Ahora dame el exponente: ");
    double aux = Double.parseDouble(System.console().readLine());

    int exponente = (int)aux;

    if(exponente == 0){
      resultado = 1;
    } else{
      for(int i = 1; i < exponente; i++){
        resultado = resultado * base;
      }
    }

    System.out.println("\n" + base + " elevado a " + exponente + " = " + resultado + "\n");
  }
}
