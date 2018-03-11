#include <stdio.h>

int main(){
    int vec[1001];
    int i,j,n,aux;

    scanf("%d", &n);
    for (i = 0; i < n; i++){
        scanf("%d", &vec[i]);
    }
    //ordenamos
    for (i=0;i<n;i++){
        for (j=0;j<(n-i-1);j++){
             if (vec[j]>vec[j+1]){
                aux=vec[j];
                vec[j]=vec[j+1];
                vec[j+1]=aux;
            }
        }
    }

    for (i=0;i<n;i++){
        printf("%d\n", vec[i]);
    }

    return 0;

}