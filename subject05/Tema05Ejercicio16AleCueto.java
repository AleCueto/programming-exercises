/**
 * ¡Te dice si el número introducido es primo!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio16AleCueto {
  public static void main(String[] args) {
    
    System.out.println("¡Tu me das un número y yo te digo si es primo!");

    System.out.print("\nDime el número que quieres comprobar: ");
    int n = (int) Double.parseDouble(System.console().readLine());
    double modulo;

    Boolean primo = true;


    for(int i = 2;(i < n) && primo; i++){
      modulo = n%i;
        if(modulo == 0){
          primo = false;
        }else{
          primo = true;
        }
    }

    if(primo){
      System.out.println("Este número es primo");
    } else {
      System.out.println("Este número no es primo");
    }


      
  }
}   
