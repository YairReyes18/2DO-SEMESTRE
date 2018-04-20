import java.util.Scanner;
public class sol1023{
  public static void main(String[] args){
      Scanner reader = new Scanner(System.in);
      float n,sum=0;
      for(int i=1;i<=12;i++){
        n = reader.nextFloat();
        sum+=n;
      }
      System.out.printf("$%.2f",sum/12);
  }
}
