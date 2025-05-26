#include<bits/stdc++.h>
using namespace std;


void solution(){
	int n;
	cin>>n;
	vector<int>v(n);
	for(int i=0;i<n;i++)
	cin>>v[i];
	
	if(n>2){
		cout<<"NO"<<endl;
		return;
	} 
	
	if(abs(v[0]-v[1])!=1) cout<<"YES"<<endl;
	else
	cout<<"NO"<<endl;
}

int main(){
	
	int t;
	cin>>t;
	while(t--)
	solution();
	return 0;
}