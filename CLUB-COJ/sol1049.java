import java.util.Scanner;
public class sol1049{
	public static void main(String[] args){
	Scanner reader = new Scanner(System.in);
	int n,sum=0;

	n = reader.nextInt();
		
		if(n>=0){
			for(int i=1;i<=n;i++){
				sum = sum + i;
			}
		}
			else{
				for(int i=1;i>=n;i--){
					sum+=i;
				}
			}
	
	System.out.println(sum);


	}
}