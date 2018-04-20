import java.util.Scanner;
public class sol1839{
	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
    	int cases,n, aux;

    cases = reader.nextInt();
    for(int i=0;i<cases;i++){
        n = reader.nextInt();
        aux = n;
        for(int j = 0; j < 3; j++){
            aux += 3;
            aux *= 2;
        }
        System.out.println(aux);
    }
  }
}