#include <stdio.h>

int main(){
	double a,b,c;
	
	scanf("%lf %lf %lf",&a,&b,&c);
	double d = (b*b)-(4*a*c);
	if(d>=0){
		printf("YES\n");
	}
	else{
		printf("NO\n");
	}

	return 0;
}