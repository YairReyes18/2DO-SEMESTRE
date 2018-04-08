import java.util.Scanner;
public class sol1188{
  public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
	String a, b;
	int prod = 0;

  a = reader.next();
  b = reader.next();
	for (int i = 0; i < a.length(); i++){
		for (int j = 0; j < b.length(); j++){
      int a1 = Character.getNumericValue(a.charAt(i));
      int b1 = Character.getNumericValue(b.charAt(j));
			prod += (a1*b1);
		}
	}
  System.out.println(prod);

  }
}
