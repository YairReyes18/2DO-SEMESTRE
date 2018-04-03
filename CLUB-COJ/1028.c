#include <stdio.h>
#include <string.h>
 
int main()
{
  char a[1000],b[1000];

  int la,lb,i,cont;
  
  while(scanf("%s %s",a,b)!=EOF){
    
  la=strlen(a);
  lb=strlen(b);  
  cont=0;
  for(i=0;i<lb;i++){
     if(cont<la){
        if(a[cont]==b[i]){
          cont++;
      }
     } 
  }

  if(cont==la){
    printf("Yes\n");
  }
  else{
    printf("No\n");
  } 
  }

   return 0;
}