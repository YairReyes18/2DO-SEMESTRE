#include <stdio.h>

int main(){
	int i;
	float n,sum;


	for(i=1;i<=12;i++){
	scanf("%f",&n);
	sum+=n;	
	}

	printf("$%.2f",sum/12);

	return 0;
}
