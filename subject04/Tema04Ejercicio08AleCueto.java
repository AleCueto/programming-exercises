/**
 * Calcula media aritmética de tres notas y di si está aprobado, no o sobresaliente
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio08AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a calcular la media aritmética de tres notas!");
    
    System.out.print("Por favor, indícame cual es la primera nota: ");
    float nota1 = Float.parseFloat(System.console().readLine());
    
    System.out.print("Ahora, indícame cual es la segunda nota: ");
    float nota2 = Float.parseFloat(System.console().readLine());
    
    System.out.print("Por último, indícame cual es la tercera nota: ");
    float nota3 = Float.parseFloat(System.console().readLine());
    
    float media = (nota1 + nota2 + nota3)/ 3;
    
    String nota = "";
    
    if(media >= 5 && media < 9){
      nota = "aprovada";
    } else if (media > 10){
      nota = "imposible";
    } else{
      nota = "suspensa";
    }
    
    
    System.out.printf("La media aritmética de las notas %.2f %.2f y %.2f es igual a ", nota1, nota2, nota3);
    System.out.printf("%.2f puntos, eso significa que tu nota es %s", media, nota);
}
}
