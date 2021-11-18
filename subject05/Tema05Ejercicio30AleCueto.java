/**
 * ¡Calcula las horas entre dos horas de dos dias (solo horas)!
 * 
 * 
 * @author Ale Cueto
 */
public class Tema05Ejercicio30AleCueto {
  public static void main(String[] args) {

    System.out.print("¡Dame dos horas y te diré cuantas hay entre estas!: ");

    System.out.print("\nPrimero dime un dia de la semana (1-7): ");
    int diaInicio = Integer.parseInt(System.console().readLine());

    System.out.print("Ahora dime la hora del primer dia (00-24): ");
    int horaInicio = Integer.parseInt(System.console().readLine());

    System.out.print("\nAhota dime otro dia de la semana (1-7): ");
    int diaFin = Integer.parseInt(System.console().readLine());

    System.out.print("Ahora dime la hora del segundo dia (00 - 24): ");
    int horaFin = Integer.parseInt(System.console().readLine());

    int dias = 0;
    int horas = 0;
    int contador = diaFin;

    if(diaInicio < diaFin){
      dias = diaFin - diaInicio;
    }else if(diaInicio > diaFin){
      do{
        contador++;
        if(contador == 7){
          contador = 0;
        }
        if(contador >= diaInicio || contador < diaFin){
          dias ++;
        }
      }while(contador != diaFin);
    }else{
      dias = 0;      
    }

    contador = 0;

    if(horaInicio < horaFin){
      horas = horaFin - horaInicio;
    }else if(horaInicio > horaFin){
      do{
        contador++;
        if(contador == 24){
          contador = 0;
        }
        if(contador >= horaInicio || contador < horaFin){
          horas ++;
        }
      }while(contador != horaFin);
    }else{
      horas = 0;      
    }

    horas += dias * 24;
    System.out.println("Entre estas fechas y horas hay " + horas + " horas");
    



  }
}   
