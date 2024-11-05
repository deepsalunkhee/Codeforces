#include<bits/stdc++.h>
using namespace std;


void solution(){
	long long n;
	cin>>n;
	if(n>=2 && n<=3){
		cout<<"NO SOLUTION";
		return;	
	}
	
	if(n==4){
		cout<<"2 4 1 3 "<<endl;
		return ;
	}
	
	
	vector<int>ans(n);
	long long v=1;
	for(int i=0;i<n;i+=2){
		ans[i]=v++;
	}
	
	for(int i=1;i<n;i+=2){
		ans[i]=v++;
	}
	
	for(int i=0;i<n;i++){
		cout<<ans[i]<<" ";
	}
	
	return;
	
}
int main(){
	solution();
	return 0;
}