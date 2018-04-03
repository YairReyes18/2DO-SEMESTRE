#include <stdio.h>

int main(){
	int t,n,c,sum,i,j;
	
	scanf("%d",&t);

	for(j=0;j<t;j++){
		sum=0;
		scanf("%d",&n);
		for(i=0;i<n;i++){
			scanf("%d",&c);
			sum = sum + c;

		}
		if(sum%n==0){
			printf("YES\n");
		}
		else{
			printf("NO\n");
		}
	}


	return 0;
}