import java.util.Scanner;
public class sol2746{
  public static void main(String[] args){
    Scanner reader = new Scanner(System.in);
    String cad;
    int contVoc=0,contCon=0;
    cad = reader.next();

    for(int i=0;i<cad.length();i++){
      if(cad.charAt(i)=='A' || cad.charAt(i)=='E' || cad.charAt(i)=='I' || cad.charAt(i)=='O' || cad.charAt(i)=='U'){
        contVoc++;}
        else{
          contCon++;
        }
      }
       System.out.println(contVoc + " " + contCon);
    }
  }
