/**
 * ¡Tira tres dados y muestra la suma!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema06Ejercicio1AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Vamos a tirar tres dados y a sumarlos!: ");
    int dado = 0;
    int suma = 0;

    for(int i = 0; i<3; i++){

      dado = (int)(Math.random()*6) + 1;

      suma += dado;

      switch(dado){
        case 1:
        System.out.print("⚀");
        break;
  
        case 2:
        System.out.print("⚁");
        break;
        
        case 3:
        System.out.print("⚂");
        break;
        
        case 4:
        System.out.print("⚃");
        break;
        
        case 5:
        System.out.print("⚄");
        break;
        
        case 6:
        System.out.print("⚅");
        break;
  
      }
    }

    System.out.print("\nLa suma de los dados es: " + suma);
    System.out.println("\n");

  }
}   
