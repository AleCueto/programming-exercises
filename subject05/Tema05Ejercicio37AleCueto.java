/**
 * ¡Transforma número en palotes!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio37AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Dame un número y te lo pasaré a palotes!: ");

    System.out.print("\nIntroduce el número: ");
    int numero = Integer.parseInt(System.console().readLine());
    int digito = 0;
    int volteado = 0;


    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      }


    do{
      digito = volteado%10;

      System.out.print(" - ");
      
      for(int i=0; i<digito; i++){
        System.out.print("| ");
      }

      volteado/=10;
    }while(volteado%10 > 0);

    System.out.println("");

  }
}   