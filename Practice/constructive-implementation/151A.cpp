#include<bits/stdc++.h>
using namespace std;


void solution(){
	int n, k, l, c, d, p, nl, np;
	cin>>n>>k>>l>>c>>d>>p>>nl>>np;
	
	int totaldring=k*l;
	int limepices=c*d;
	
	int noset=min({totaldring/nl,limepices,p/np});
	cout<<noset/n<<endl;
	return;
}
int main(){
	
	solution();
	return 0;
}