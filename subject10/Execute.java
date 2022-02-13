import ej1poo.Caballo;
import ej4poo.Fraccion;
import ej2poo.*;


/**
 * Ordena reyes
 * 
 * 
 * @author Ale Cueto
 */

public class Execute {
  public static void main(String[] args) {

      
    Bicicleta bicicleta = new Bicicleta();
    Vehiculo.CreaVehiculo();
    Coche coche = new Coche();
    Vehiculo.CreaVehiculo();
    

    boolean salir = false;

    while(!salir){

      
      System.out.print(" VEHÍCULOS \n ========= \n"
      +"1. Anda con la bicicleta \n"
      +"2. Haz el caballito con la bicicleta \n"
      +"3. Anda con el coche \n"
      +"4. Quema rueda con el coche \n"
      +"5. Ver kilometraje de la bicicleta \n"
      +"6. Ver kilometraje del coche \n"
      +"7. Ver kilometraje total \n"
      +"8. Salir \n"
      +"Elige una opción (1-8):");
      
      int opcion = Integer.parseInt(System.console().readLine());

      int kilometros;
      
      switch(opcion){
        case 1:
        
        System.out.println("¿Cuántos kilómetros quieres andar?");
        kilometros = Integer.parseInt(System.console().readLine());
        
        bicicleta.Anda(kilometros);
        kilometros = 0;
        
        break;
        
        case 2:
        
        bicicleta.Caballito();
        
        break;
        
        case 3:
        
        kilometros = Integer.parseInt(System.console().readLine());
        
        coche.Anda(kilometros);
        kilometros = 0;
        break;
        
        case 4:
        
        coche.QuemaRueda();
        
        break;
        
        case 5:
        
        System.out.println(bicicleta.getKilometrosRecorridos());
        
        break;
        
        case 6:
        
        System.out.println(coche.getKilometrosRecorridos());
        
        break;
        
        case 7:
        
        System.out.println(Vehiculo.getKilometrosTotales());
        
        break;
        
        case 8:
        
        salir = true;
        
        break;
        
      }
    }
      
      
      // Fraccion fraccion1 = new Fraccion(1, 2);
      
      // Fraccion fraccion2 = new Fraccion(2, 4);
      
      
      // Fraccion invertida = fraccion1.invierte();
      
      // System.out.println(fraccion1);
      // System.out.println(invertida);
      
      // System.out.println(fraccion1.getNumerador() + "/" + fraccion1.getDenominador());
      // System.out.println(invertida.getNumerador() + "/" + invertida.getDenominador());
      
      
      //System.out.println(fraccion1.multiplica(fraccion2).getNumerador() + "/" + fraccion1.multiplica(fraccion2).getDenominador());
    }
    
    
    
  }
  