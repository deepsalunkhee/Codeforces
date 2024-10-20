#include<bits/stdc++.h>
#define ll long long
using namespace std;


void solution(){
	ll n;
	cin>>n;
	
	ll mins;
	ll ans=0;
	
	cin>>mins;
	
	for(ll i=1;i<n;i++){
		ll t;
		cin>>t;
		mins=max(mins,t);
		
		if(t<mins){
			ans+=mins-t;
		}
	}
	
	cout<<ans<<endl;
}
int main(){
	
	solution();
	return 0;
}