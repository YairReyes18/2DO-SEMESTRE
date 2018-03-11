#include <iostream>
#include <string>

using namespace std;

int main(){   
    string nombre;
    int a,b;
    while(cin>>nombre){
       if(nombre=="square"){
          cin>>a;
          cout<<a*a<<endl;
       }else{
          cin>>a>>b;
          cout<<a*b<<endl;
       }
    }
    
    return 0;
}