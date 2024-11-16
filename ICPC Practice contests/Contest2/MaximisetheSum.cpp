#include<bits/stdc++.h>
using namespace std;
#define ll long long 



void solution(){
   	ll n;
   	cin>>n;
   	vector<ll>in(n);
   	for(ll i=0;i<n;i++){
   		cin>>in[i];
   	};
   	sort(in.begin(),in.end());
   	
   	ll s=0;
   	ll e=n-1;
   	ll ans=0;

   	while(s<e){
   		ans+=abs(in[s]-in[e]);
   		s++;
   		e--;	
   	}
   	cout<<ans<<endl;
}
int main(){
	ll t;
	cin>>t;
	while(t--)
	solution();
	return 0;
}