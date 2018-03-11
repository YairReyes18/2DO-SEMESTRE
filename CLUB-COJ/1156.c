#include <stdio.h>

int main(){	
	int n,i=0;
	
	while((scanf("%d",&n)) && (n>=0 && n<100) && n!=42){ //mine :V
	if(n==42 || i>0){
		i++;
	}
		else{
		printf("%d\n",n);
			}
	
	}

	return 0;
}
