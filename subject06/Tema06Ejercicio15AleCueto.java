/**
 * ¡Muestra notas generadas al azar!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema06Ejercicio15AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Vamos a generar notas musicales aleatorias!: \n \n");
  
    String nota = "";
    
    int numeroNotas = (int)(Math.random()*(28-4+1)+4);

    while(numeroNotas%4 != 0){
      numeroNotas++;
    }
    
    for (int i = 0; i < numeroNotas +1; i++) {
      
      int notaNum = (int)(Math.random()*7);
      
      //Pintar compás;
      switch(notaNum){
      case 0:
      nota="do";
      break;
      
      case 1:
      nota="re";
      break;
      
      case 2:
      nota="mi";
      break;
      
      case 3:
      nota="fa";
      break;
      
      case 4:
      nota="sol";
      break;
      
      case 5:
      nota="la";
      break;
      
      case 6:
      nota="si";
      break;

    }

    System.out.print(nota + " ");

    if(i%4 == 0 && i != 0){
      System.out.print("| ");
    }
  }

    

  }
}   
