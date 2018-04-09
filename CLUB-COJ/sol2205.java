import java.util.Scanner;
public class sol2205 {
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();

        for (int i=0;i<n;i++) {
          int cont=0;
            int a = reader.nextInt();
            int b = reader.nextInt();
            for (int j=a;j<=b;j++) {
                String bin = Integer.toBinaryString(j);
                for (int k=0;k<bin.length();k++) {
                    if(bin.charAt(k) == '1') {
                        cont++;
                    }
                }
            }
            System.out.println(cont);
        }
    }
}
