/**
 * Calcula la nómina de un empleado
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio24AleCueto {
  public static void main(String[] args) {

    double impuesto = 0;
    double retencion = 0;
    double sueldoNeto;
    double sueldoBase = 0;

    System.out.println("Vamos a calcular tu nómina: ");
    System.out.print("¿Qué cargo ocupas en la empresa? (1- Junior, 2-Senior, 3-Jefe de proyecto)): ");
    double cargo = Double.parseDouble(System.console().readLine());

    System.out.print("\nAhora dime cuál es tu estado civil (1-Soltero, 2-Casado): ");
    int estadoCivil = Integer.parseInt(System.console().readLine());

    System.out.print("\n¿Cuántos viajes has dado para visitar clientes?: ");
    int viajes = Integer.parseInt(System.console().readLine());

    if((int)cargo > 0 && (int)cargo < 4 && estadoCivil > 0 && estadoCivil < 3 && viajes > 0){

      if(cargo == 1){
        sueldoBase = 950;
      } else if (cargo == 2){
        sueldoBase = 1200;
      } else if (cargo == 3){
        sueldoBase = 1600;
      }


      System.out.print("\n\n--------------------------------------------------------------------\n");
      System.out.printf("|Sueldo base:                                               %.2f|\n", sueldoBase);
      double dineroDietas = viajes * 30; 
      System.out.printf("|Dietas (%d viajes):                                          %.2f|\n", viajes, dineroDietas);
      double sueldoBruto = sueldoBase + dineroDietas;
      System.out.printf("|------------------------------------------------------------------|\n");
      System.out.printf("|Sueldo bruto:                                              %.2f|\n", sueldoBruto);
      
    
      if(estadoCivil == 1){
        impuesto = 25;
      } else if (estadoCivil == 2){
        impuesto = 20;
      }
      retencion = (sueldoBruto * impuesto) / 100;
      
      sueldoNeto = sueldoBruto - retencion;

      System.out.print("|Retención IRPF (" + impuesto +"%):                                      " + retencion + "|\n");
      System.out.println("|------------------------------------------------------------------|");
      System.out.printf("|Sueldo neto:                                               %.2f|\n", sueldoNeto);
      System.out.printf("-------------------------------------------------------------------");
    } else{
      System.out.println("\nDatos mal introducidos");
    }


  }
}
