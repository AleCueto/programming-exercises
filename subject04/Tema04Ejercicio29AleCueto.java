/**
 * Precio desayuno
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio29AleCueto {
  public static void main(String[] args) {

    System.out.println("¡Bienvenido a la cefetería de campanillas! ");
    
    System.out.print("¿Qué desea comer? (palmera donut o pitufo): ");
    String comida = System.console().readLine();

    System.out.print("\n¿Que quieres de bebida? (zumo o café): ");
    String bebida = System.console().readLine();


    String pitufo = "";

    double precioComida = 0;
    double precioBebida = 0;

    switch(comida){
      case "palmera":
        precioComida += 1.4;
      break;

      case "donut":
        precioComida += 1;
      break;

      case "pitufo":
        System.out.print("\n¿Que tipo de pitufo quieres (aceite o tortilla)?: ");
        pitufo = System.console().readLine();
        switch(pitufo){
          case "aceite":
            precioComida += 1.2;
          break;

          case "tortilla":
            precioComida += 1.6;
          break;

          default:
            System.out.println("Has introducido mal el tipo de pitufo");
        }
      break;

      default:
        System.out.println("Has introducido mal el comida");
    }

    System.out.printf("\n%s %s: %.2f€", comida, pitufo, precioComida);


    if(bebida.equals("café")){
      precioBebida += 1.2;
      System.out.printf("\n%s: %.2f€", bebida, precioBebida);
    } else if (bebida.equals("zumo")){
      precioBebida += 1.5;
      System.out.printf("\n%s: %.2f€", bebida, precioBebida);
    } else {
      System.out.println("\nHas escogido mal la bebida, el desayuno no la incluirá, si la quieres, inténtalo de nuevo");
    }

      double precioTotal = precioComida + precioBebida;

      System.out.printf("\nTotal: %.2f€\n", precioTotal);
    }
  }

