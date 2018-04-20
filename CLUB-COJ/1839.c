#include <stdio.h>

int main()
{
    int cases,n, aux, i,j;

    scanf("%d",&cases);
    for(i=0;i<cases;i++){
        scanf("%d", &n);
        aux = n;
        for(j = 0; j < 3; j++){
            aux += 3;
            aux *= 2;
        }
        printf("%d\n", aux);
    }
    return 0;
}