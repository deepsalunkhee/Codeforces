#include<bits/stdc++.h>
using namespace std;


void solution(){
	int n;
	cin>>n;
	
	string s=to_string(n);
	
	int si=s.length();
	vector<int>ans;
	for(int i=si-1;i>=0;i--){
		if(s[i]-'0'==0)
		continue;
		
		int temp=s[i]-'0';
		if(si-(i+1)>0){
		int m=si-(i+1);
		while(m--)
		temp=temp*10;	
		}
		
		
		ans.push_back(temp);
	}
	
	cout<<ans.size()<<endl;
	for(int x:ans){
		cout<<x<<" ";
	}
	cout<<endl;
	return;
	
}
int main(){
	int t;
	cin>>t;
	
	while(t--)
	solution();
	
	return 0;
}