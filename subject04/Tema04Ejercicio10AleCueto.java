/**
 * Calculamos el horóscopo a raiz del dia en el que nacio
 * 
 * 
 * @author Ale Cueto
 */
public class Tema04Ejercicio10AleCueto {
  public static void main(String[] args) {
    System.out.println("¡Vamos a calcular tu horoscopo a partir del dia y el mes en que naciste!");
    
    System.out.print("Por favor, indícame el día que naciste: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora, el número de mes en el que naciste (1 = Enero, 2 = Febrero...): ");
    int mes = Integer.parseInt(System.console().readLine());

    String horoscopo = "";
    
    switch(mes){
    case 1:
      if(dia >= 22){
      horoscopo = "Acuario";
      } else{
      horoscopo = "Capricornio";
      }
    break;
    
    case 2:
      if(dia <= 21){
      horoscopo = "Acuario";
      } else{
      horoscopo = "Piscis";
      }
    break;
    
    case 3:
      if(dia <= 20){
      horoscopo = "Piscis";
      } else{
      horoscopo = "Aries";
      }
    break;
    
    case 4:
      if(dia <= 20){
      horoscopo = "Aries";
      } else{
      horoscopo = "Tauro";
      }    
    break;
    
    case 5:
      if(dia <= 20){
      horoscopo = "Tauro";
      } else{
      horoscopo = "Géminis";
      }
    break;
    
    case 6:
      if(dia <= 21){
      horoscopo = "Géminis";
      } else{
      horoscopo = "Cáncer";
      }
    break;
    
    case 7:
      if(dia <= 22){
      horoscopo = "Cáncer";
      } else{
      horoscopo = "Leo";
      }
    break;
    
    case 8:
      if(dia <= 22){
      horoscopo = "Leo";
      } else{
      horoscopo = "Virgo";
      }
    break;
    
    case 9:
      if(dia <= 21){
      horoscopo = "Virgo";
      } else{
      horoscopo = "Libra";
      }
    break;
    
    case 10:
      if(dia <= 22){
      horoscopo = "Libra";
      } else{
      horoscopo = "Escorpio";
      }
    break;
    
    case 11:
      if(dia <= 21){
      horoscopo = "Escorpio";
      } else{
      horoscopo = "Sagitario";
      }
    break;
    
    case 12:
      if(dia <= 22){
      horoscopo = "Sagitario";
      } else{
      horoscopo = "Capricornio";
      }
    break;
    
    default:
      horoscopo = "incorrecto, por favor, vuelve a intentarlo y asegúrate de introducir bien los datos";
    }

    System.out.print("Tu horóscopo es: " + horoscopo);
}
}
