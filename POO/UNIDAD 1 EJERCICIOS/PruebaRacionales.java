//Por Yair Reyes

public class PruebaRacionales{
  public static void main(String[] args){
    Racionales test = new Racionales();
    System.out.println("Por defecto: ");
    System.out.println("Esta es la fraccion por defecto: " + test.getNumerador() + "/" + test.getDenominador());
    System.out.println("Esta es la segunda fraccion por defecto: " + test.getNumerador2() + "/" + test.getDenominador2());
    test.sumarRacionales();
    test.restaRacionales();
    System.out.printf("\n\n");

    Racionales test2 = new Racionales();
    test2.setNumerador(1);
    test2.setDenominador(2);
    test2.setNumerador2(1);
    test2.setDenominador2(2);
    test2.sumarRacionales();
    test2.restaRacionales();


  }
}
