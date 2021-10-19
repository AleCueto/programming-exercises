/**
 * Calcular nota necesaria para media
 * 
 * Hay que tener en cuenta que la nota del primer examen es un 40% y la del segundo un 60%
 * 
 * @author Ale Cueto
 */
public class Tema03Ejercicio12AleCueto {
  public static void main(String[] args) {
    
    System.out.println("¡Vamos a calcular la nota que necesitas para sacar tu media deseada!");
    
    System.out.println("Introduce la media que deseas conseguir:");
    float media = Float.parseFloat(System.console().readLine());
    
    System.out.println("Introduce la nota de tu primer exámen:");
    float nota1 = Float.parseFloat(System.console().readLine());
    
    double nota2 = ((media * 100) - (nota1 * 40)) / 60;
    System.out.println("\n");
    System.out.printf("Si queremos una nota media de %.2f dada una primera nota %.2f ", media, nota1);
    System.out.printf("será necesario sacar un total de %.2f en el segundo exámen", nota2);
  }
}
