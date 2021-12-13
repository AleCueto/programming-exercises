/**
 * Ordena reyes
 * 
 * 
 * @author Ale Cueto
 */
public class Tema07Ejercicio20AleCueto {
  public static void main(String[] args) {
    System.out.print("¡Indica el número total de reyes:!\n");
    int totalReyes = Integer.parseInt(System.console().readLine());
    String[] reyes = new String[totalReyes];

    String[] reyesModificados = new String[totalReyes];


    System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.\n");

    for (int i = 0; i < reyes.length; i++) {
      reyes[i] = System.console().readLine();
      int reyesAntes = 0;
      for (int j = 0; j < reyes.length; j++) {
        if(reyes[i].equals(reyes[j])){
          reyesAntes++;
        }
      }
      reyesModificados[i] = reyes[i] + " " + reyesAntes + "º";
      //reyes[i] = reyes[i] + " " + reyesAntes + "º";
      //System.out.println(reyes[i] + " " + reyesAntes + "º");
    }

    System.out.println();

    for (int i = 0; i < reyesModificados.length; i++) {
      System.out.println(reyesModificados[i]);
    }


  }
}
