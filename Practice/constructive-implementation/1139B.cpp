#include<bits/stdc++.h>
using namespace std;




void solution(){
	
	long long  n;
	cin>>n;
	vector<long long >in(n);
	for(int i=0;i<n;i++) cin>>in[i];
	long long  ans=in[n-1];
	long long pre=in[n-1];
		
	for(long long  i=n-2;i>=0;i--){
		//cout<<pre<<endl;
		if(in[i]<pre){
			ans=ans+in[i];
			pre=in[i];	
		}else{
			ans=ans+max((long long)0,pre-1);
			pre=max((long long)0,pre-1);
		
		}
		
	}
	
	cout<<ans<<endl;
}
int main(){
	
	solution();
	return 0;
}