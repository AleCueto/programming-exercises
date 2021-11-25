/**
 * ¡Tira tres dados y muestra la suma!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema06Ejercicio6AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Tienes 5 intentos para adivinar el número en el que pienso (entre 0 y 100)!: \n");
    //System.out.println(numero); 
    boolean acertado = false;   
    
    System.out.print("Comience, intento número 1: ");
    int numeroAleatorio = (int)(Math.random() * 101);
    
    for(int i = 0; i < 5 && acertado == false; i++){
      int numeroIntroducido = Integer.parseInt(System.console().readLine());
      if(numeroAleatorio == numeroIntroducido){
        acertado = true;
      }

      if(acertado == true){
        System.out.println("Enhorabuena, has acertado");
      } else if (i != 4){
        System.out.print("Intento número " + (i +2) + ": ");
      }
    }

    if(acertado == false){
      System.out.println("Lo sentimos, no lo has conseguido, el número era " + numeroAleatorio);
    }

    System.out.println("\n");

  }
}   
