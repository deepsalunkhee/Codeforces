#include<bits/stdc++.h>
using namespace std;
void solution(){
	int n,m;
	cin>>n>>m;
	vector<vector<char>>ans(n,vector<char>(m,'#'));
	
	for(int i=1;i<n;i=i+4){
		for(int j=0;j<m-1;j++){
			ans[i][j]='.';
		}
	}
	
	for(int i=3;i<n;i=i+4){
		for(int j=1;j<m;j++){
			ans[i][j]='.';
		}
	}
	
	for(int i=0;i<n;i++){
		for(int j=0;j<m;j++){
			cout<<ans[i][j];
		}
		cout<<endl;
	}
	return ;
}

int main(){
	
	solution();
	return 0;
}