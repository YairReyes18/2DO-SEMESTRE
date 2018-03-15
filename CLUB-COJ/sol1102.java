import java.math.BigInteger;
import java.util.Scanner;
public class sol1102{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
    BigInteger once = new BigInteger("11");
    BigInteger n;
		n = reader.nextBigInteger();
		while(!n.equals(BigInteger.ZERO)){
			if(n.mod(once)==BigInteger.ZERO)
				System.out.println(n + " is a multiple of 11.");
			else
				System.out.println(n + " is not a multiple of 11.");
			n = reader.nextBigInteger();
		}
	}
}
