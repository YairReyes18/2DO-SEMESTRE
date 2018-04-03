#include <stdio.h>

int main(){
	int c,i,j,n,a,odd,even;
	
	scanf("%d",&c);
	for(i=1;i<=c;i++){
		odd=0;
		even=0;
		scanf("%d",&n);
		for(j=1;j<=n;j++){
			scanf("%d",&a);
				if(a%2==0){
					even++;	
				}
					else{
						odd++;
					}
		}
		printf("%d even and %d odd.\n",even,odd);
	
	}	

	return 0;
}
