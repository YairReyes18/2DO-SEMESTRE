import java.util.Scanner;
public class sol1840 {    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int n = reader.nextInt();
        
        for (int i=0;i<n;i++){
            String pass = reader.next();                                    

            char[] vecAux = pass.toCharArray(); 
            int[] broken = {0, 0, 0, 0, 0, 0};
            
            for (int k=0;k<pass.length();k++){
                char c = vecAux[k];
                switch(c) {
                    case 'B':
                        broken[0]++;
                        break;
                    case 'R':
                        broken[1]++;
                        break;
                    case 'O':
                        broken[2]++;
                        break;
                    case 'K':
                        broken[3]++;
                        break;
                    case 'E':
                        broken[4]++;
                        break;
                    case 'N':
                        broken[5]++;
                        break;
                }                                
                
            }
            
            boolean secure=false;
            
            for (int j=1;j<5;j++) {
                if(broken[j]!=broken[j-1]) {
                    secure=true;
                }
            }

            if(!secure){ System.out.println("No Secure");
        }
            else{ 
                System.out.println("Secure");
            }
        }
        
    }
    
}