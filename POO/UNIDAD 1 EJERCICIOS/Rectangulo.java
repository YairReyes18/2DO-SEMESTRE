public class Rectangulo{
  private double longitud;
  private double ancho;

//Constructor por defecto con valores =1
  public Rectangulo(){
    longitud=1;
    ancho=1;
  }
//Constructor que recibe dos parametros
  public Rectangulo(double longitud, double ancho){
    this.longitud=longitud;
    this.ancho=ancho;
  }

  public void setLongitud(double longitud){
    if(longitud>0 && longitud<=20)
    this.longitud=longitud;

  }

  public void setAncho(double ancho){
    if(ancho>0 && ancho<=20)
    this.ancho=ancho;

  }

  public double getLongitud(){
    return this.longitud;
  }

  public double getAncho(){
    return this.ancho;
  }


  public double calculaPerimetro(){
    return ((2*ancho)+(2*longitud));
  }

  public double calculaArea(){
    return (ancho*longitud);
  }

}
