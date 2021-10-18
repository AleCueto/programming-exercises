/**
 * Calcular salario semanal en base a horas trabajadas
 *
 * @author Ale Cueto
 */
public class Tema03Ejercicio08AleCueto {
  public static void main(String[] args) {
    
    System.out.println("¡Vamos a calcular el salario en base a las horas trabajadas!");
    System.out.println("Introduce cuantas horas has trabajado:");
    int horas = Integer.parseInt(System.console().readLine());
    
    System.out.println("\n");
    System.out.print("Si has trabajado " + horas + " hora/s, tu salario será igual a ");
    System.out.println((horas * 12) + "€");
  }
}
