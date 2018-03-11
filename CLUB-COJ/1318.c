#include <stdio.h>
#include <string.h>

int main()
{   int a,b,c,aux;
    char cad[4];
    scanf("%d %d %d\n",&a,&b,&c);

//ORDENAMOS
    if(a>b)
        {
        aux=a;  
        a=b;
        b=aux;
        }
          
           if(a>c)
              {
              aux=a;
              a=c;
              c=aux;
              }

                if(b>c)
                  {
                  aux=b;
                  b=c;
                  c=aux;

                  } 

                  fgets(cad,4,stdin);
    if(strcmp(cad,"ABC")==0) {printf("%d %d %d\n",a,b,c);}
    if(strcmp(cad,"ACB")==0) {printf("%d %d %d\n",a,c,b);}
    if(strcmp(cad,"BAC")==0) {printf("%d %d %d\n",b,a,c);}
    if(strcmp(cad,"BCA")==0) {printf("%d %d %d\n",b,c,a);}
    if(strcmp(cad,"CAB")==0) {printf("%d %d %d\n",c,a,b);}
    if(strcmp(cad,"CBA")==0) {printf("%d %d %d\n",c,b,a);}        
    return 0;
}