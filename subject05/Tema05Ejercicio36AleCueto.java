/**
 * ¡Te dice si un número es capicúa!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio36AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Dame un número y te diré si es capicúa!: ");

    System.out.print("\nIntroduce el número: ");
    int numero = Integer.parseInt(System.console().readLine());
    int volteado = 0;

    int numeroAux = numero;

    while(numeroAux > 0){
      volteado = (volteado*10) + (numeroAux%10);
      numeroAux /= 10;
    }


    if(volteado == numero){
      System.out.println("El número " + numero + " es capicúa");
    }else{
      System.out.println("El número " + numero + " NO es capicúa");
    }

  }
}   