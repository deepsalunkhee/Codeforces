#include<bits/stdc++.h>
using namespace std;

void solution(){
	long long n;
	cin>>n;
	
	string s=to_string(n);
	
	string ans="";
	
	
	for(char c:s){
		
		
		
		int p=min(c-'0',9-(c-'0'));
		//cout<<p<<endl;
		string t=to_string(p);
		ans=ans+t;
		
	
	}
	
	
	if(ans[0]=='0')
	ans[0]='9';
	
	
	cout<<ans<<endl;
}

int main(){
	
	
	solution();
	return 0;
}