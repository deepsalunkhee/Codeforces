#include<bits/stdc++.h>
using namespace std;


void solution(){
	
	long long n;
	cin>>n;
	long long sum=0;
	for(int i=0;i<n-1;i++){
		long long in;
		cin>>in;
		sum+=in;
	}
	
	cout<<(n*(n+1))/2-sum<<endl;
	
}
int main(){
	
	solution();
	return 0;
}