/**
 * Sacar la primera asignatura dependiendo el dia de la semana
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio01AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a sacar la primera asignatura del dia!");
    System.out.println("Dime cúal es el dia de la semana del que deseas sacar su primera asignatura");
    System.out.println("Lunes = 1, Martes = 2, Miercoles = 3, Jueves = 4, Viernes = 5\n");
    int dia = Integer.parseInt(System.console().readLine());
    
    switch(dia){
      
      case 1: 
      case 2: 
      case 4:
        System.out.println("\nLa primera asignatura del dia es programación");
      break;
      
      case 3: 
      case 5:
        System.out.println("\nLa primera asignatura del dia es sistemas informáticos");
      break;
      
      default: System.out.println("\nEl dato introducido no es correcto");
      
      }
  }
}
