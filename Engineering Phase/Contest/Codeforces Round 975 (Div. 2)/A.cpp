#include<bits/stdc++.h>
using namespace std;


void solution(){
	int n;
	cin>>n;
	vector<int>arr(n,0);
	for(int i=0;i<n;i++){
		int t;
		cin>>t;
		arr[i]=t;
	}
	
	int s1=0;
	int min1=INT_MAX;
	int max1=0;
	int c1=0;
	
	
	
	for(int i=0;i<n;i+=2){
		s1=s1+arr[i];
		min1=min(min1,arr[i]);
		max1=max(max1,arr[i]);
		c1++;
	}
	
	
	int s2=0;
	int min2=INT_MAX;
	int max2=0;
	int c2=0;
	
	
	for(int i=1;i<n;i+=2){
		s2=s2+arr[i];
		min2=min(min2,arr[i]);
		max2=max(max2,arr[i]);
		c2++;
	}
	
	cout<<max(max1+c1,max2+c2)<<endl;
	
	
	
	
	
}
int main(){
	int t;
	cin>>t;
	while(t--)
	solution();
	return 0;
}