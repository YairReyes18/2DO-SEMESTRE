#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int n,j=0,v[10005];

    cin>>n;
    for(int i=0;i<n;i++){
    cin>>v[i];
    sort(v, v + n);
  }

 for(int i = n-1; i >= 0; i--){
         cout << v[i] << " ";
}
    return 0;
}
