#include <bits/stdc++.h>
using namespace std;

void solution(){
	int n;
	cin>>n;
	vector<vector<char>>in(n,vector<char>(4));
	
	for(int i=0;i<n;i++){
		for(int j=0;j<4;j++){
			cin>>in[i][j];
		}
	}
	
	for(int i=n-1;i>=0;i--){
		for(int j=0;j<4;j++){
			if(in[i][j]=='#')
			cout<<j+1<<" ";
		}
		
	}
	cout<<endl;
	
	return;
	
	
        
}
int main() {
    int t;
    cin>>t;
    while(t--){
        solution();
    }
    return 0;
}
