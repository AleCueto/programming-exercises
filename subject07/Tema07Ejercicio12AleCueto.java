/**
 * mueve arrays
 * 
 * 
 * @author Ale Cueto
 */
public class Tema07Ejercicio12AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a hacer un array de 10 caracteres!\n");
    
    int[] numeros = new int[10];
    int[] numerosModificados = new int[10];

    System.out.print("Introduce 10 números: ");
    for (int i = 0; i < numeros.length; i++) {
      numeros[i] = Integer.parseInt(System.console().readLine());
    }

    System.out.println();

    System.out.println("Ahora dime la posición inicial (0 a 9)");
    int inicial = Integer.parseInt(System.console().readLine());
    int valorInicial = numeros[inicial];

    System.out.println("Ahora dime la posición final (0 a 10)");
    int ultimo = Integer.parseInt(System.console().readLine());
    
    numerosModificados[9] = numeros[0];

    for (int i = 0; i < numerosModificados.length; i++) {
      if(i == 0){
        numerosModificados[i] = numeros[numeros.length-1];
      }else if(i != 9){
        numerosModificados[i] = numeros[i-1];
      }

    }


    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i] + " | ");
    }

    System.out.println();

    for (int i = 0; i < numerosModificados.length; i++) {
      System.out.print(numerosModificados[i] + " | ");
    }
    
  }
}
