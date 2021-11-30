/**
 * ¡Genera números pares hasta generar el 24!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema06Ejercicio9AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Generador números pares hasta 24!: \n \n");
    //System.out.println(numero); 
  
    int num = 0;
    
    while(num != 24){
      num = (int)(Math.random()*100);
      if(num%2 != 0){
        num+=1;
      }
      System.out.print(num + " ");
    }
    

  }
}   
