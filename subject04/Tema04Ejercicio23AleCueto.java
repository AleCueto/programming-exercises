/**
 * Calcula el precio funal de un producto
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio23AleCueto {
  public static void main(String[] args) {

    boolean precioValido = true;

    System.out.println("Vamos a calcular el precio final de un producto: ");
    System.out.print("Primero dime cuál es la base imponible en euros: ");
    double baseImp = Double.parseDouble(System.console().readLine());

    System.out.print("\nAhora dime cuál es el IVA, puede ser... ");
    System.out.println("general: 21% (escribe 1),  reducido: 10% (escribe 2),   o superreducido: 4% (escribe 3)");
    int iva = Integer.parseInt(System.console().readLine());

    System.out.println("¿Tienes algún código promocional? (s/n): ");
    String aux = System.console().readLine();
    String codigo = "";


    if(baseImp < 0){
      precioValido = false;
    }
    double precio = baseImp;

    switch (iva) {
    case 1:
      precio = precio * 1.21;
      break;

    case 2:
      precio = precio * 1.1;
      break;

    case 3:
      precio = precio * 1.04;
      break;

    default:
      precioValido = false;
    }

    if (aux.equals("s")) {
      System.out.println("Introduce tu código por favor: ");
      codigo = System.console().readLine();


      switch(codigo){

        case "mitad":
          precio = precio / 2;
          break;
    
        case "menos5":
          precio = precio - 5;
          break;
    
        case "5porc":
          precio -= precio * 0.05;
          break;
    
        default:
          precioValido = false;
        break;
        }

    }


    if(precioValido == true){
      System.out.printf("El precio final es igual a: %.2f€ \n", precio);
    } else{
      System.out.println("Hay algún dato mal introducido, por favor, inténtalo de nuevo");
    }

  }
}
