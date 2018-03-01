import java.math.BigInteger;
import java.util.Scanner;
public class sol1293{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        
        if (n >= 0 && n <= 265) {
            BigInteger base = new BigInteger("2");
            System.out.println(base.pow(n));
        }
    }
}