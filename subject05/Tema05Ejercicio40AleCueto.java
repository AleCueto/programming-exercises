/**
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio40AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Vamos a pintar un rombo!: ");
    System.out.print("Por favor, introduce la altura: ");
    int altura = Integer.parseInt(System.console().readLine());
    int espaciosAntes = altura;
    
    int distanciaEntrePuntos = 0;

    for(int i = 0; i <= espaciosAntes +1; i++){
      System.out.print(" ");
    }
    System.out.print('*');
    System.out.println();

    for (int i = 0; i < altura; i++) {
      DosPuntos(espaciosAntes, distanciaEntrePuntos, '*');
      if(i < altura/2){
        espaciosAntes--;
        distanciaEntrePuntos+=2;
      } else{
        espaciosAntes++;
        distanciaEntrePuntos-=2;
      }
    }

    for(int i = 0; i <= espaciosAntes; i++){
      System.out.print(" ");
    }
    System.out.print('*');
    System.out.println();

    }
    

    public static void DosPuntos(int espacio, int distanciaEntrePuntos, char caracter){

        for(int i = 0; i <= espacio; i++){
          System.out.print(" ");
        }
        System.out.print(caracter);
  
        for(int i = 0; i <= distanciaEntrePuntos; i++){
          System.out.print(" ");
        }
        System.out.print(caracter);
        System.out.print("\n");

    }

  }   