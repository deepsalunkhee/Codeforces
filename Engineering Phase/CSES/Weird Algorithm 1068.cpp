#include<bits/stdc++.h>
using namespace std;


void solution(){
	long long n;
	cin>>n;
	
	cout<<n<<" ";
	
	while(n!=1){
		
		if(n%2==0){
			n=n/2;	
		}
		else{
			n=n*3+1;	
		} 
		
		cout<<n;
		if(n!=1)
		cout<<" ";
	}
	
}
int main(){
	
	solution();
	return 0;
}