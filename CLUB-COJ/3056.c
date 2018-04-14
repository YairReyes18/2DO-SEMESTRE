#include <stdio.h>

int compatible(int a[], int b[]){
  int i;
  for(i=0;i<5;i++){
    if(a[i]==b[i]){
      return 0;
			break;
    }
		else{
			return 1;
		}
  }
}

int main(){
  int a[5],b[5],i;

	for(i=0;i<5;i++){
	   scanf("%d",&a[i]);
	}
	for(i=0;i<5;i++){
    scanf("%d",&b[i]);
  }
	compatible(a,b)==1;
  if(compatible(a,b)){
				printf("Y\n");
			}
    else{
      printf("N\n");
    }
  return 0;
}
