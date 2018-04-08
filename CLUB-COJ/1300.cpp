#include <iostream>
#include <set>
using namespace std;

int main(){
	set<int> mods; // Sets are containers that store "unique" elements following a specific order easy;
	int n;
	for(int i=0;i<10;i++){
		cin>>n;
		mods.insert(n%42);
	}

	cout<<mods.size()<<endl;
}
