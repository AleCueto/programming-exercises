/**
 * Cuestionario 1º DAM
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio12AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Bienvenido al cuestionario de 1º DAM de IES campanillas!\n");
    System.out.print("Las reglas son sencillas, pulsa a, b o c y dependiendo de la respuesta recibirás puntos o no.\n");

    String respuesta;
    int puntuacion = 0;


    System.out.println("¿Cuántos dígitos tiene el sistema de numeración binario?\n");
    System.out.println("a) 3\nb) 2\nc) 4\n");
    System.out.print("¿Cúal es tu respuesta?: ");
    respuesta = System.console().readLine();
    if(respuesta.equals("b")){
      puntuacion++;
    }
    
    System.out.println("\n¿En que época apareció el primer ordenador Von Neumann?\n");
    System.out.println("a) 1980\nb) 1930\nc) 1950\n");
    System.out.print("¿Cúal es tu respuesta?: ");
    respuesta = System.console().readLine();
    if(respuesta.equals("c")){
      puntuacion++;
    }

    System.out.println("\n¿Indica cuál es un dispositivo de entrada?\n");
    System.out.println("a) escáner\nb) monitor\nc) altavoces\n");
    System.out.print("¿Cúal es tu respuesta?: ");
    respuesta = System.console().readLine();
    if(respuesta.equals("a")){
      puntuacion++;
    }
    
    System.out.println("\n¿Cuál de estos es un sistema gestor de base de datos?\n");
    System.out.println("a) MySQL\nb) SQL\nc) Visual studio code\n");
    System.out.print("¿Cúal es tu respuesta?: ");
    respuesta = System.console().readLine();
    if(respuesta.equals("a")){
      puntuacion++;
    }
    
    System.out.println("\n¿Cuál de estos es un lenguaje de programación?\n");
    System.out.println("a) java\nb) UTF-8\nc) castellano\n");
    System.out.print("¿Cúal es tu respuesta?: ");
    respuesta = System.console().readLine();
    if(respuesta.equals("a")){
      puntuacion++;
    }
    
    System.out.println("\n¿Para que se usa la sentencia if?\n");
    System.out.println("a) suma números\nb) permite hacer bucles\nc) permite establecer condiciones\n");
    System.out.print("¿Cúal es tu respuesta?: ");
    respuesta = System.console().readLine();
    if(respuesta.equals("c")){
      puntuacion++;
    }
    
    System.out.println("\n¿Cómo se escribe 2 en binario?\n");
    System.out.println("a) 100\nb) 010\nc) 001\n");
    System.out.print("¿Cúal es tu respuesta?: ");
    respuesta = System.console().readLine();
    if(respuesta.equals("b")){
      puntuacion++;
    }
    
    System.out.println("\n¿Cuál de estos es un lenguaje de programación?\n");
    System.out.println("a) MonoDB\nb) python\nc) MySQL\n");
    System.out.print("¿Cúal es tu respuesta?: ");
    respuesta = System.console().readLine();
    if(respuesta.equals("b")){
      puntuacion++;
    }
    
    System.out.println("\n¿Cuántos bytes tiene un kB?\n");
    System.out.println("a) 100\nb) 1000\nc) 1024\n");
    System.out.print("¿Cúal es tu respuesta?: ");
    respuesta = System.console().readLine();
    if(respuesta.equals("b")){
      puntuacion++;
    }
    
    System.out.println("\n¿Para que se usa CSS?\n");
    System.out.println("a) Para establecer comportamiento a los objetos de una web\nb) Para dar estilo a los componentes de la web\nc) Permite almacenar datos en una base de datos\n");
    System.out.print("¿Cúal es tu respuesta?: ");
    respuesta = System.console().readLine();
    if(respuesta.equals("b")){
      puntuacion++;
    }


    System.out.println("\nTu puntuación es " + puntuacion);
    
    if(puntuacion < 5){
      System.out.println("¡Deberías estudiar más!");
    } else if(puntuacion >= 5 && puntuacion < 9){
      System.out.println("¡Has aprovado, pero puedes hacerlo mejor!");
    } else{
      System.out.println("¡FELICIDADES, HAS SACADO UNA NOTAZA!");
    }
    
    
  }
}
