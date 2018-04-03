import java.util.Scanner;
public class sol1028{
	public static void main(String[] args){
		Scanner reader= new Scanner(System.in);
		String a,b;

	
		while(true){
			int test=0;
			a=reader.nextLine();
			if((a.length())<=0){
				break;
			}
			b=reader.nextLine();
			for(int i=0;i<b.length();i++){
				if(test<a.length()){
				if(a.charAt(test)==b.charAt(i)){
					test++;
				}
			}
		}
			if(test==a.length()){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
	}
}
}