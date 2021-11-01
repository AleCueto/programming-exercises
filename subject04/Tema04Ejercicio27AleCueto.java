/**
 * Pastelería precio tartas
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio27AleCueto {
  public static void main(String[] args) {

    System.out.println("¡Bienvenido a pastelería campanillas! ");
    
    System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
    String sabor = System.console().readLine();

    System.out.print("\n¿Quieres nata? (s o n): ");
    String nata = System.console().readLine();

    System.out.print("\n¿Quieres ponerle un nombre? (s o n): ");
    String nombre = System.console().readLine();

    String chocolate = "";

    double precioSabor = 0;
    double precioNata = 0;
    double precioNombre = 0;

    switch(sabor){
      case "manzana":
        precioSabor += 18;
      break;

      case "fresa":
        precioSabor += 16;
      break;

      case "chocolate":
        System.out.print("\n¿Que tipo de chocolate quieres (negro o blanco)?: ");
        chocolate = System.console().readLine();
        switch(chocolate){
          case "negro":
            precioSabor += 14;
          break;

          case "blanco":
            precioSabor += 15;
          break;

          default:
            System.out.println("Has introducido mal el tipo de chocolate");
        }
      break;

      default:
        System.out.println("Has introducido mal el sabor");
    }

    System.out.printf("\nTarta de %s %s: %.2f€", sabor, chocolate, precioSabor);

    if(precioSabor > 0 ){
      if(nata.equals("s")){
        precioNata += 2.5;
        System.out.printf("\nCon nata: %.2f€", precioNata);
      } else if (nata.equals("n")){
        precioNata += 0;
      } else {
        System.out.println("\nHas escogido mal la nata, el pastel no la incluirá, si la quieres, escribe s");
      }

      if(nombre.equals("s")){
        precioNombre += 2.75;
        System.out.printf("\nCon nombre: %.2f€", precioNombre);
      } else if (nombre.equals("n")){
        precioNombre += 0;
      } else {
        System.out.println("\nHas escogido mal el nombre, el pastel no la incluirá, si la quieres, escribe s");
      }

      double precioTotal = precioSabor + precioNata + precioNombre;

      System.out.printf("\nTotal: %.2f€\n", precioTotal);
    }
  }
}
