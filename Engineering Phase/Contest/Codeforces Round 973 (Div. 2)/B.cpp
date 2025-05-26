#include<bits/stdc++.h>
using namespace std;

void solution() {
    long long a;
    cin >> a;
	long long ans=0;
	
	for(long long i=0;i<a-2;i++){
		long long  t;
		cin>>t;
		ans=ans-t;
	}
	//cout<<ans<<endl;
	
	long  sl;
	cin>>sl;
	ans=sl+ans;
	//cout<<ans<<endl;
	long long l;
	cin>>l;
	ans=l-ans;
	cout<<ans<<endl;
	//cout<<"new"<<endl;
}

int main() {
    long long t;
    cin >> t;

    while (t--) {
        solution();
    }
    return 0;
}
