#include <stdio.h>
#include <string.h>
#include <math.h>

int main(){
  char player[100],thebest[100];
  int cases,PA,PJ,G,A,TA,TR,i;
  double factor,best=0;

  scanf("%d",&cases);
  for(i=0;i<cases;i++){
     scanf("%s %d %d %d %d %d %d", &player, &PA, &PJ, &G, &A, &TA, &TR);
      factor = log10(PA) + PJ + 2*G + A - (TA + 2*TR);
        if(factor>best){
          strcpy(thebest, player);
          best=factor;
        }
  }
     printf("%s\n", thebest);
  return 0;
}
