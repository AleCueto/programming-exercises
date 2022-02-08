package matematicas;
/**
 * Funciones matemáticas
 * 
 * 
 * @author Ale Cueto
 */
public class propias {
  public static void main(String[] args) {
    System.out.println(esPrimo(6));
  }

  private static boolean esCapicua(int numero){
    int numeroaux = numero;
    
    long volteado = 0;

    while(numeroaux > 0){
      volteado += numeroaux%10;
      volteado *= 10;
      numeroaux /= 10;
    }

    return(numero == volteado/10);
  }

  private static long voltea(long numero){
    long volteado = 0;

    while(numero > 0){
      volteado += numero%10;
      volteado *= 10;
      numero /= 10;
    }

    return volteado/10;
  }

  // public static Boolean esPrimo(long n) {
  //   boolean primo = false;

  //   if(n / 2 != 0){
  //     primo = false;
  //   }

    
    
  // }

  public static Boolean esPrimo(int n) {
    boolean comun = true;
    boolean primo = false;
    for (int i = 2; i <= n && comun == true; i++) {
      if(n%i != 0){
        comun = true;
      }
    }

    if(comun == true){
      primo = false;
    } 
    
    if (comun == false){
      primo = true;
    }

    return primo;
  }




  public static int cuentaDigitos(long x) {
    if (x < 0) {
      x = -x;
    }

    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10; // se le quita un dígito a x
        n++; // incrementa la cuenta de dígitos
      }
      return n;
    }
  }


}
