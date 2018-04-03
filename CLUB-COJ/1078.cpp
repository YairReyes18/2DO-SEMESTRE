#include <iostream>

using namespace std;

int main(){
    int t,c,n,sum;
    cin>>t;

    for (int j=0;j<t;j++){
        sum=0;
        cin>>n;
        for(int i=0;i<n;i++){
            cin >> c;
            sum = sum + c;
        }

        if (sum%n==0){
            cout<<"YES"<<endl;
        }
        else{
            cout<<"NO"<<endl;
        }
    }

    return 0;
}