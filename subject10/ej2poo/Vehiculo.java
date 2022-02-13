package ej2poo;



public class Vehiculo {

  private int kilometrosRecorridos;
  private static int kilometrosTotales;
  private static int vehiculosCreados;


  public static void CreaVehiculo(){
    vehiculosCreados++;
  }

  public void Anda(int recorrido){
    kilometrosRecorridos += recorrido;
    kilometrosTotales += recorrido;
    System.out.println("Has andado " + recorrido + "km!");
  }

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public void setKilometrosRecorridos(int kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }

  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }

  public static void setKilometrosTotales(int kilometrosTotales) {
    Vehiculo.kilometrosTotales = kilometrosTotales;
  }


  

}
