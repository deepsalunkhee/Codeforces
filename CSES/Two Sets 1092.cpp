#include<bits/stdc++.h>
using namespace std;

#define ll long long 


void solution(){
	ll k;
	cin>>k;
	
	ll sum=(k*(k+1))/2;
	
	if(sum%2==1){
		cout<<"NO"<<endl;
		return;	
	}
	
	//oberservation the diff between the first n even and odd number is n
	 
	cout<<"YES"<<endl;
	vector<ll>taken(k+1,0);
	ll inc=0;
	ll c=0;
	for(ll i=k;i>=1;i--){
		if(inc+i==sum/2){
			taken[i]=1;
			c++;
			inc+=i;
			break;
		}
		
		if(inc+i<sum/2){
			taken[i]=1;
			inc+=i;
			c++;
		}
	}
	
	cout<<c<<endl;
	for(ll i=1;i<=k;i++){
		if(taken[i]==1)
		cout<<i<<' ';
	}
	cout<<endl;
	cout<<k-c<<endl;
	for(ll i=1;i<=k;i++){
		if(taken[i]==0)
		cout<<i<<' ';
	}
	cout<<endl;
	
	
	
	
	
	
}

int main(){
	solution();
	return 0;
}