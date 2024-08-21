#include<bits/stdc++.h>
using namespace std;



void solution(){
	int n;
	cin>>n;
	map<int,int>m;
	int maxf=0;
	for(int i=0;i<n;i++){
		int t;
		cin>>t;
		m[t]++;
		maxf=max(maxf,m[t]);
	}
	
	cout<<n-maxf<<endl;
	return ;
}
int main(){
	
	int t;
	cin>>t;
	
	while(t--)
	solution();
	
	return 0;
}