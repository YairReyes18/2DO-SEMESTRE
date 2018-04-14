#include <iostream>
#include <vector>
using namespace std;

int main(){
	vector<int> a;
	vector<int> b;

  for(int i=0;i<5;i++){
		int n;
		cin>>n;
		a.push_back(n);
	}
	for(int i=0;i<5;i++){
		int n;
		cin>>n;
		b.push_back(n);
	}

	bool compatible = true;
	for(int i=0;i<5;i++){
		if(a[i] == b[i]){
			compatible = false;
			break;
		}
	}

  if(compatible){
		cout<<'Y'<<'\n';
	}
	else{
		cout<<'N'<<'\n';
	}

	return 0;
}
