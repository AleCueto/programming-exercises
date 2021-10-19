/**
 * Calcula el salario según las horas trabajadas, teniendo en cuenta las horas extra
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio04AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a calcular tu salario!");
    System.out.print("Dime el número de horas que has trabajado:");
    
    int horas = Integer.parseInt(System.console().readLine());
    double salario = 0;
    
    if(horas <= 40){
      salario = horas * 12;
    } else if( horas >= 40){
      salario = 40 * 12 + (horas - 40) * 16;
    }
      
    System.out.printf("Tu salario dadas %d horas, será igual a %.2f€", horas, salario);
}
}
