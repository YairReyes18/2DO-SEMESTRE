#include <stdio.h>
#include <string.h>
#define MAX 100000

int main(){
	char a[MAX], b[MAX];
	int i, j,longia, longib;
	while(scanf("%s %s",a,b) != EOF){
		longia = strlen(a);
		longib = strlen(b);
    j=0;
		for(i=0;i<longib;i++){
			if(b[i]==a[j]){
				j++;
			}
		}
		if(j==longia)
			printf("Yes\n");
		else
			printf("No\n");
	}
	return 0;
}
