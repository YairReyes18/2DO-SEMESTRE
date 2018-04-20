import java.util.Scanner;
import java.math.BigInteger;
public class sol1600{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		BigInteger a = new BigInteger("0");
		BigInteger b = new BigInteger("0");

		while(true){
			a = reader.nextBigInteger();
			b = reader.nextBigInteger();
			if(a.equals(BigInteger.ZERO) && b.equals(BigInteger.ZERO)){
         break;}
			a = a.modPow(b, BigInteger.TEN);
			System.out.println(a);
		}
	}
}
