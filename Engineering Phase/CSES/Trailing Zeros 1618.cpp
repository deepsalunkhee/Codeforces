#include<bits/stdc++.h>
using namespace std;

#define ll long long

void solution(){
	ll n;
	cin>>n;
	
	//yep i was correct it depens on the number of 5
	
	ll pof5=5;
	ll ans=0;
	
	while(n>=pof5){
		ans+=n/pof5;
		pof5*=5;
	}
	cout<<ans<<endl;
}

int main(){
	solution();
	return 0;
}