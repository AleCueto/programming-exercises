/**
 * Calcula cuanto tiempo tardará en car un objeto desde una altura h
 * 
 * Utilizaremos la formula √2h/g siendo g = 9.81
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio06AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a calcular cuanto tarda en caer un objeto!");
    
    System.out.print("Indícame la altura en metros desde la que cae el objeto: ");
    double h = Double.parseDouble(System.console().readLine());
    
    double g = 9.81;
    
    double t = Math.sqrt(2 * h / g);
    
      
    System.out.printf("Si cae desde %f metros, siendo la gravedad de %f m/s², tardará un total de ", h, g);
    System.out.printf("%f segundos", t);
}
}
