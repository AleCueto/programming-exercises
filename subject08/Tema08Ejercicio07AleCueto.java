/**
 * 
 * 
 * 
 * @author Ale Cueto
 */
public class Tema08Ejercicio07AleCueto {
  public static void main(String[] args) throws InterruptedException{
    System.out.print("Vamos a mostrar un array con 60 celdas\n");
    
    boolean playing = true;
    String action = "";

    int vida = 3;

    int ancho = 10;
    int alto = 10;

    int posx = (int)(Math.random()*10);
    int posy = (int)(Math.random()*10);

    String charac = "*";

    
    boolean leyendo = false;

    boolean quitavida = false;

    int enemyPosx = (int)(Math.random()*10);
    int enemyPosy = (int)(Math.random()*10);

    int paperPosx = (int)(Math.random()*10);
    int paperPosy = (int)(Math.random()*10);



    while(playing){

      System.out.println("vida = " + vida);
      for (int i = 0; i < alto; i++) {
        for (int j = 0; j < ancho; j++) {
          if(i == posy && j == posx){
            charac = "&";
          } else if(i == paperPosy && j == paperPosx){
            charac = "#";
          } else if(i == enemyPosy && j == enemyPosx){
            charac = "6";
          } else{
            charac = "*";
          }


          if(posx == paperPosx && posy == paperPosy){
            leyendo = true;
          } else if(posx == enemyPosx + 1 || posx == enemyPosx -1 && posy == enemyPosy + 1 || posy == enemyPosy -1){
            quitavida = true;
          }
          System.out.print(charac);
        }
        System.out.println();
      }
      
      
      if(leyendo == true){
        System.out.println("leyendo");
        leyendo = false;
      }

      if(quitavida == true){
        System.out.println("el enemigo te daña");
        vida --;
        quitavida = false;
      }
      
      System.out.println();
      System.out.println();
      System.out.println("Action?: ");
      action = System.console().readLine();
      
      if(enemyPosx - posx > 0){
        enemyPosx++;
      }else{
        enemyPosx--;
      }

      if(enemyPosy - posy > 0){
        enemyPosy++;
      }else{
        enemyPosy--;
      }

      enemyPosx += posx-enemyPosx;
      enemyPosy += posy-enemyPosy;


      if(action.equals("D")){
        posx++;
      }else if(action.equals("A")){
        posx--;
      }else if(action.equals("W")){
        posy--;
      }else if(action.equals("S")){
        posy++;
      }

    }
      
      
  }
}
