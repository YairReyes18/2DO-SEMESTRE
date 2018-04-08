#include <stdio.h>

int main(){
    int n, i, pos;
    float m, mmax=0;

    scanf("%d", &n);
    for(i=1;i<=n;i++){
        scanf("%f", &m);
        if(m>=mmax){
            mmax=m;
            pos = i;
        }
    }
    printf("%d\n", pos);

    return 0;
}
