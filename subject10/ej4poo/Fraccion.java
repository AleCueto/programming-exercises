package ej4poo;



public class Fraccion {

  private int numerador = 1;
  private int denominador = 1;


  


  public Fraccion(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
  }


  public Fraccion invierte(){
    return new Fraccion(this.denominador, this.numerador);
  }



  public Fraccion invertida(Fraccion fraccionEntrada){
    Fraccion aux = new Fraccion(fraccionEntrada.denominador, fraccionEntrada.numerador);
    return aux;
  }


  public void simplifica(){
    boolean simplificado = false;

    System.out.println(numerador + "/" + denominador);


    for (int i = 2; i <= 10; i++) {
      if(numerador%i == 0 && denominador%i == 0){
        numerador/=i;
        denominador/=i;
        simplificado = true;
        i = 1;
      }
    }

    if(!simplificado){
      System.out.println("Este numero no se puede simplificar");
    }else{
      System.out.println(numerador + "/" + denominador);
    }
  }


  public Fraccion multiplica(Fraccion multiFraccion){
    Fraccion resultado = new Fraccion(0,0);
    resultado.numerador = numerador * multiFraccion.numerador;
    resultado.denominador = denominador * multiFraccion.denominador;
    return resultado;
  }

  public Fraccion divide(Fraccion diviFraccion){
    Fraccion resultado = new Fraccion(0,0);
    resultado.numerador = numerador * diviFraccion.denominador;
    resultado.denominador = denominador * diviFraccion.numerador;
    return resultado;
  }

/* GETTERS AND SETTERS*/

  public int getNumerador() {
    return numerador;
  }


  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }


  public int getDenominador() {
    return denominador;
  }


  public void setDenominador(int denominador) {
    this.denominador = denominador;
  }


  @Override /*Le ponemos override para que no use el toString de la clase object || NOTACIÓN || Para que mire si hay un metodo igual en una superclase*/
  public String toString() {
    return denominador + "/" + numerador;
  }


  

}
