#include<bits/stdc++.h>
using namespace std;
#define ll long long 

static bool comp(vector<ll>a,vector<ll>b){
	return a[0]<b[0];
}

void solution(){
   	ll n,m;
	cin>>n>>m;
	
	vector<vector<ll>>r,b;
	for(ll i=0;i<n;i++){
		ll t1,t2;
		cin>>t1>>t2;
		r.push_back({t1,t2});
	}
	for(ll i=0;i<m;i++){
		ll t1,t2;
		cin>>t1>>t2;
		b.push_back({t1,t2});
	}
	
	sort(r.begin(),r.end(),comp);
	sort(b.begin(),b.end(),comp);
	ll ans=0;
	
	for(ll i=0;i<n;i++){
		
		ll xl=r[i][0];
		ll xs=r[i][1];
		
		if(xl==-1) continue;
		for(ll j=0;j<m;j++){
			
			ll yl=b[j][0];
			ll ys=b[j][1];
			if(yl==-1) continue;
			
			double t_to_x_yl=(double)yl/xs;
			
			if(t_to_x_yl*ys==xl){
				ans++;
				b[j][0]=-1;
				r[i][0]=-1;
				break;
				
			}
			
			
		}
	}
	
	cout<<ans<<endl;
	
	
}
int main(){
	solution();
	return 0;
}