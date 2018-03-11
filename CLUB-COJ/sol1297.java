import java.util.Scanner;
import java.math.BigInteger;
public class sol1297{
	public static void main(String[] args){
	Scanner reader = new Scanner(System.in);
	int n;
	BigInteger num,mod;
	BigInteger nmod = new BigInteger("495"); //convertimos nuestro 495 a un biginteger para poder operar


	n = reader.nextInt(); //leemos el numero de veces (n numeros)

		for(int i=1;i<=n;i++){
			num = reader.nextBigInteger(); //leemos nuestro numero muy grande :V
			mod = num.mod(nmod); //le aplicamos el modulo de nmod que en este caso es 495 :v la variable "mod" guarda el resultado del modulo :v

			if(mod.equals(BigInteger.ZERO)){
				System.out.println("YES");
			} 
			else{
				System.out.println("NO");
			}
		}

	}
}