#include <stdio.h>

int main(){
    int a, b, c;
    scanf("%d %d %d",&a,&b,&c);

    if (a + b + c != 180){
      printf("Error\n");
      }
    else if( a == b && c == b){
        printf("Equilateral\n");
    }
    else if ( (a == b && c != b ) || (a == c && b != c) || (b == c && c != a) ){
        printf("Isosceles\n");
    }
    else if ( (a != b && b != c && a != c ) ){
        printf("Scalene\n");
    }

    return 0;
}
