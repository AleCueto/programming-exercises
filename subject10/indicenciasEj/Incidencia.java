package indicenciasEj;



public class Incidencia {

  private static int siguienteCodigo = 0;
  private int codigo;

  private int puesto;

  private String estado;

  private String problema = "";
  private String resolucion = "";


  private static int pendientes = 0;
  

  public Incidencia(int numeroPuesto, String problema) {
    this.codigo = siguienteCodigo;
    
    this.puesto = numeroPuesto;

    siguienteCodigo++;

    this.problema = problema;

    estado = "Pendiente";
    pendientes++;
  }

  public void resuelve(String resolucion){
    this.estado = "Resuelto";
    this.resolucion = resolucion;
    pendientes--;
  }


  

  public static int getPendientes() {
    return pendientes;
  }


  @Override
  public String toString() {

    if(this.resolucion.equals("")){
      return "Incidencia " + codigo + " - Puesto: " + puesto + " - " + problema + " - " + estado;
    } else{
      return "Incidencia " + codigo + " - Puesto: " + puesto + " - " + problema + " - " + estado + " - " + resolucion;
    }
  }

  

}
