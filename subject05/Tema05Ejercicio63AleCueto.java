/**
 * ¡Pasa cifras de un número a la derecha!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio63AleCueto{
  public static void main(String[] args) {

    System.out.print("¡Vamos a pintar dos pirámides!: ");
    System.out.print("Dime la altura de la primera pirámide: ");
    int alturaPrimera = Integer.parseInt(System.console().readLine());
    System.out.print("Dime la altura de la segunda pirámide: ");
    int alturaSegunda = Integer.parseInt(System.console().readLine());
    
    int asteriscosPrimera = 0;
    int asteriscosSegunda = 0;
    

    int piso = 0;
    int alturaGrande;

    if(alturaPrimera > alturaSegunda){
      alturaGrande = alturaPrimera;
    }else{
      alturaGrande = alturaSegunda;
    }

    piso = alturaGrande;

    int espaciosDelante = alturaGrande;
    int espaciosDetras = alturaGrande * 2;


    for (int i = 0; i < alturaGrande; i++) {
      
      
      if(piso <= alturaPrimera){
        pintarCaracteres(asteriscosPrimera, "*");
        asteriscosPrimera+=2;
        pintarEspacios(espaciosDetras);
        espaciosDetras-=2;
      }else{
        pintarEspacios(espaciosDelante);
        espaciosDelante--;
      }
      
      if(piso <= alturaSegunda){
        pintarCaracteres(asteriscosSegunda, "*");
        asteriscosSegunda+=2;
      }else{
        pintarEspacios(espaciosDetras);
        
      }

      System.out.println();

      piso--;
    }

    }
    
    public static void pintarEspacios(int numeroEspacios){
      for (int i = 0; i < numeroEspacios; i++) {
        System.out.print(" ");
      }
    }
  
    public static void pintarCaracteres(int numeroCaracteres, String caracter){
      for (int i = 0; i < numeroCaracteres; i++) {
        System.out.print("" + caracter);
      }
    }
  
  

  }   