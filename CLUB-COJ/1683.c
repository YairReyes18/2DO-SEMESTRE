#include <stdio.h>

int main()
{
	int t,i;
	scanf("%d",&t);
	while(t--){
		int sum = 0, aux;
		scanf("%d",&aux);	
		for(i = 1; i < aux; i++){
			if(aux % i == 0){
				sum += i;
			    }
		}

		if(sum < aux){
			printf("Deficient\n");
			}
		
		else
		if(sum == aux){
			printf("Perfect\n");
			}
		
		else
			printf("Abundant\n");
	}
	return 0;
}