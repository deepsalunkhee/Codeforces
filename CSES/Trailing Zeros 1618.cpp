#include<bits/stdc++.h>
using namespace std;

#define ll long long

void solution(){
	ll n;
	cin>>n;
	
	ll tens=n/10;
	ll fives=n/5;
	
	
	ll ans=tens+(fives-tens);
	cout<<ans<<endl;
}

int main(){
	solution();
	return 0;
}