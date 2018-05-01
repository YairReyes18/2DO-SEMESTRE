#include <stdio.h>

int main(){
  int i,cases,a,b,c,d,e,f;
  scanf("%d",&cases);
  for(i=0;i<cases;i++){
    scanf("%d %d %d %d %d %d",&a,&b,&c,&d,&e,&f);
    printf("%d %d %d %d %d %d\n",1-a,1-b,2-c,2-d,2-e,8-f);
  }
  return 0;
}
