#include <stdio.h>

int main(){
  int n,a,b,c,i,r;
  scanf("%d",&n);
  for(i=0;i<n;i++){
    scanf("%d %d %d",&a,&b,&c);
      r=(b*b)-(4*a*c);
      if(r>0){
        printf("SI\n");}
          else{
            printf("NO\n");
          }
      }
  return 0;
}
