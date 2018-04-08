#include <stdio.h>

int main(){
  int h1,m1,h2,m2,aux;

  while(1){
      scanf("%d %d %d %d", &h1,&m1,&h2,&m2);
      if(h1==0 && m1==0 && h2==0 && m2==0){
        break;
      }

      aux = (h2-h1)*60 +(m2-m1);
      if(aux>0){
        printf("%d\n",aux);
      }
      else{
        aux = aux + 1440;
        printf("%d\n",aux);
      }
  }


}
