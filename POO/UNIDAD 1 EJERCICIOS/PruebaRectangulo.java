public class PruebaRectangulo{
  public static void main(String[] args){

    Rectangulo r1 = new Rectangulo();
    System.out.println("Rectangulo con valores de Constructor por defecto: ");
    System.out.println("El area es: " + r1.calculaArea());
    System.out.println("El perimetro es: " + r1.calculaPerimetro());

    //asignamos nuevos valores
    r1.setLongitud(30.0);
	  r1.setAncho(5.5);
    System.out.println("\nLa longitud es: " + r1.getLongitud());
    System.out.println("El ancho es: " + r1.getAncho());

  }
}
