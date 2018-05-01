#include <stdio.h>

int main() {
    int n,i,a,b;
    scanf("%d", &n);
    for(i=0;i<n;i++){
        scanf("%d %d", &a, &b);
            if(a==b){
                if(a%2==0){
                  printf("%s\n","L");}
                  else{ printf("%s\n","R");}
            }
              else{
                if(a>b){
                    if(b%2==0){
                      printf("%s\n","U");}
                      else{printf("%s\n","D");}
                }
                  else{
                    if(a%2==0){
                        printf("%s\n","L");}
                      else{ printf("%s\n","R");}
                }
         }
    }
    return 0;
}
