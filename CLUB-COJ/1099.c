#include <stdio.h>

int main(){
	int a,b,c;

		while(1){
			scanf("%d",&a);
			if(a==0) break;
		
		scanf("%d %d",&b,&c);
		
		 if((a*a)+(b*b)==(c*c)) printf("right\n");
        else if((b*b)+(c*c)==(a*a)) printf("right\n");
        else if((a*a)+(c*c)==(b*b)) printf("right\n");
        else if(a<=0 || b<=0 || c<=0) printf("wrong\n");
        else printf("wrong\n");
	}

	return 0;
}