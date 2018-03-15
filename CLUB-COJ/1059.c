#include <stdio.h>
int contadorp; //variable global
void binary(int n){
  if(n!=0){ //caso base
    binary(n/2); //recursivo
    printf("%d",n%2);
    if (n%2==1) {
      contadorp++; //contador de 1 para la pariedad
    }
  }
}
int main(){
  int n;

  while(scanf("%d",&n) && n!=0){
    contadorp=0;
    printf("The parity of ");
    binary(n);
    printf(" is %d (mod 2).\n",contadorp);
  }


  return 0;
}
