#include<bits/stdc++.h>
using namespace std;


void solution(){
	vector<int>i(3);
	cin>>i[0]>>i[1]>>i[2];
	
	sort(i.begin(),i.end());
	
	cout<<(i[1]-i[0])+(i[2]-i[1])<<endl;
	return;
	
}
int main(){
	solution();
	return 0;
}