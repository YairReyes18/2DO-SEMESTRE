import java.util.Scanner;
import java.math.BigInteger;


public class sol1393 {
		public static void main(String[] args){
			Scanner reader = new Scanner(System.in);
			int n; 

			n = reader.nextInt();

			for(int j=0;j<n;j++){
			String a = reader.next();
			String b = reader.next();

			BigInteger base = new BigInteger(a);
			Integer exp = Integer.parseInt(b);
			
			BigInteger result = base.pow(exp);			
			
			// replace bigInteger with GrandTotal in your case
			String digits = result.toString(); // replace bigInteger with GrandTotal in your case
			int numberLength = digits.length();
			for(int i = numberLength-1 ; i < numberLength; i++) {
    		int digit = digits.charAt(i+1) - '0';
   			 System.out.print(digit);
			}
			
		
}

		}

}
