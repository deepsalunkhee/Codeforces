#include<bits/stdc++.h>
using namespace std;

void solution(){
	long long k;
	cin>>k;
	
	//find the total way possible to place them 
	for(long long km=1;km<=k;km++){
	long long tp=(km*km*(km*km-1))/2;
	
	
	//total attackng pair
	long long attack=0;
	
	if(km>=3){
		attack=4*(km-1)*(km-2);
	}
	cout<<tp-attack<<endl;
	}
	
	
}
int main(){
	solution();
	return 0;
}