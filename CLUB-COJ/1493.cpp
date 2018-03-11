#include <cstdlib>
#include <iostream>

#define PI 3.14
using namespace std;

int main(){
    string name;
    double a,b;  
    
    cin>>name;
    if(name=="circle"){
       cin>>a;
       printf("%.2f\n",PI*(a*a));
    } 
    if(name=="triangle"){
      cin>>a>>b;
      printf("%.2f\n",(a*b)/2);
    }
    if(name=="rhombus"){
      cin>>a>>b;
      printf("%.2f\n",(a*b)/2);
    }
    return 0;
}
