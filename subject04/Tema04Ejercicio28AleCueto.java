/**
 * Juego piedra papel o tijeras
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio28AleCueto {
  public static void main(String[] args) {

    System.out.println("¡Vamos a jugar piedra papel o tigeras! ");
    
    System.out.print("Primero debe elegir el primer jugador (piedra, papel o tijeras): ");
    String primerJugador = System.console().readLine();

    System.out.print("Ahora debe elegir el segundo jugador (piedra, papel o tijeras): ");
    String segundoJugador = System.console().readLine();

    Boolean ganaJugador1 = false;
    Boolean empate = false;
    
    if(primerJugador.equals("piedra") || primerJugador.equals("papel") || primerJugador.equals("tijeras")){

      if(segundoJugador.equals("piedra") || segundoJugador.equals("papel") || segundoJugador.equals("tijeras")){

     switch(primerJugador){
      case "piedra":
        switch (segundoJugador){
          case "tijeras":
            ganaJugador1 = true;
          break;
        }
      break;

      case "papel":
        switch (segundoJugador){
          case "piedra":
            ganaJugador1 = true;
          break;
        }
      break;

      case "tijeras":
        switch (segundoJugador){
          case "papel":
           ganaJugador1 = true;
          break;
        }
      break;

    }

    }

    if(primerJugador.equals(segundoJugador)){
      System.out.println("empate");
    } else if(ganaJugador1 == true){
      System.out.println("gana jugador 1");
    } else{
      System.out.println("gana jugador 2");
    }

    } else{
      System.out.println("Algún dato se ha introducido mal, asegúrate de escribir bien");
    }

    /* OPCION 2: CON CONDICIONALES

    if(primerJugador.equals("piedra") || primerJugador.equals("papel") || primerJugador.equals("tijeras")){

      if(segundoJugador.equals("piedra") || segundoJugador.equals("papel") || segundoJugador.equals("tijeras")){

        if(primerJugador.equals("piedra") && segundoJugador.equals("tijeras")){
          ganaJugador1 = true;
        } else if (primerJugador.equals("papel") && segundoJugador.equals("piedra")){
          ganaJugador1 = true;
        } else if (primerJugador.equals("tijeras") && segundoJugador.equals("papel")){
          ganaJugador1 = true;
        }

      }
    }*/
      
  }
}
