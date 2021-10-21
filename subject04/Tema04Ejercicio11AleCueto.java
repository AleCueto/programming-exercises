/**
 * Calculamos el tiempo hasta media noche
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio11AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a calcular cuanto tiempo hay desde una hora has media noche!");
    System.out.print("Dame las horas que han pasado desde las 00: ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Ahora dime los minutos que han pasado en esta hora: ");
    int minuto = Integer.parseInt(System.console().readLine());


    if(minuto >= 60 || hora >= 60 || minuto <= 0 || hora <= 0){
      System.out.println("Lo siento has introducido un número erróneo, inténtalo de nuevo.");
    } else {
    int horaRestante = 24 - hora;
    int minutoRestante = 60 - minuto;
    int segundosRestantes = horaRestante * 3600 + minutoRestante * 60;
    System.out.println("Quedan un total de " + segundosRestantes + " segundos");
    }
    
  }
}
