#include <stdio.h>

int main(){
    int nP,nE,i,j;
    double cal;
    char examen[100], respuesta[100];

    scanf("%d", &nP);
    scanf("%s", &respuesta);
    scanf("%d", &nE);
    for(i=0;i<nE;i++){
        scanf("%s", examen);
        cal = 0;
        for(j=0;j<nP;j++){
            if(examen[j] == respuesta[j]){
                cal += 1;
              }
            else if(examen[j]!='#'){
                cal -= 0.25;
              }
        }
        printf("%0.2lf\n", cal);
    }
    return 0;
}
