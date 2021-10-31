import javax.swing.text.StyledEditorKit;

/**
 * Calcula el precio de las banderas que vendemos
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio25AleCueto {
  public static void main(String[] args) {

    System.out.println("Bienvenido a la tienda de BanderasDeEspaña.es: ");
    
    System.out.print("Introduzca la altura de la bandera en cm: ");
    double alto = Double.parseDouble(System.console().readLine());

    System.out.print("\nAhora introduzca la anchura en cm: ");
    double ancho = Double.parseDouble(System.console().readLine());

    System.out.print("\n¿Quiere el escudo bordado? (s/n): ");
    String bordado = System.console().readLine();

    if( alto < 0 || ancho < 0 || bordado.equals("s") && bordado.equals("n")){
      System.out.println("Has introducido mal los datos");
    } else{
      System.out.println("\nGracias por tu compra. Aquí tienes el desglose");
      
      double area = ancho * alto;
      double precioPorArea = area / 100;
      
      System.out.print("Bandera de " + area + "cm²:");
      System.out.printf("%8.2f€\n", precioPorArea);
      
      double precioBordado = 0;
      if(bordado.equals("s")){
        precioBordado = 2.50;
        System.out.printf("Con escudo: %16.2f€\n", precioBordado);
      }
      double precioEnvio = 3.25;
      double precioTotal = precioPorArea + precioEnvio + precioBordado;
      System.out.printf("Gastos envío: %14.2f€\n", precioEnvio);
      System.out.printf("Total: %22.2f€\n", precioTotal);
  }
    

  }
}
