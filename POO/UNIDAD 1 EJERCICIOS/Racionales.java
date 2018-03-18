//Por Yair Reyes
public class Racionales{
  private int numerador;
  private int denominador;
  private int numerador2;
  private int denominador2;

//Constructor por defecto
  public Racionales(){
    numerador=1;
    denominador=4;
    numerador2=1;
    denominador2=4;
  }

  public Racionales(int numerador, int denominador, int numerador2, int denominador2){
    this.numerador=numerador;
    this.denominador=denominador;
    this.numerador2=numerador2;
    this.denominador2=denominador2;
  }

  public void setNumerador(int numerador){
      this.numerador=numerador;
  }

  public void setNumerador2(int numerador2){
      this.numerador2=numerador2;
  }

  public void setDenominador(int denominador){
    if(denominador>0)
      this.denominador=denominador;
  }

  public void setDenominador2(int denominador2){
    if(denominador2>0)
      this.denominador2=denominador2;
  }

  public int getNumerador(){
    return this.numerador;
  }

  public int getDenominador(){
    return this.denominador;
  }

  public int getNumerador2(){
    return this.numerador2;
  }

  public int getDenominador2(){
    return this.denominador2;
  }


  public void sumarRacionales(){
      int numerador3 = (numerador*denominador2) + (denominador*numerador2);
      int denominador3 = (denominador*denominador2);
      if(numerador3==denominador3){
        System.out.println("La suma de las dos fracciones es: " + numerador3/denominador3);
      }
      else{
      System.out.println("La suma de las dos fracciones es: " + numerador3 + "/" + denominador3);
    }
  }

  public void restaRacionales(){
    int numerador3 = (numerador*denominador2) - (denominador*numerador2);
    int denominador3 = (denominador*denominador2);
    if(numerador3==0){
      System.out.println("La resta de las dos fracciones es: " + numerador3);
    }
    else{
    System.out.println("La resta de las dos fracciones es: " + numerador3 + "/" + denominador3);
  }
  }



}
