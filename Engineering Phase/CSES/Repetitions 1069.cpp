#include<bits/stdc++.h>
using namespace std;


void solution(){
	
	string s;
	cin>>s;
	
	long long ans=0;
	long long c=1;
	
	long long n=s.length();
	 
	for(int i=1;i<n;i++){
		
		if(s[i]!=s[i-1]){
			
			ans=max(ans,c);
			c=1;
		}else{
			c++;
		}
	}
	ans=max(ans,c);
	
	cout<<ans<<endl;
	
}
int main(){
	
	solution();
	return 0;
}