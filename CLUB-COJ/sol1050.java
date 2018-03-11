import java.util.Scanner;

public class sol1050{
    
    static boolean coPrimos(int i, int n){
         
            if(i%n==1){
                 return true;
            }
       
                if(i%n==0){
                return false;
            }
            return coPrimos(n,i%n);
          
        }

	public static void main(String[] args){
	Scanner reader = new Scanner(System.in);

        int n = reader.nextInt();
        int contador=0;
        
        for (int i = 1; i <= n; i++) {
            if(coPrimos(i,n)){
                contador++;
            }
        }

        System.out.println(contador);

       
    }
	
}