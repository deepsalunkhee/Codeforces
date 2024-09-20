#include<bits/stdc++.h>
using namespace std;


bool isChangeable(string s){
	
	bool allcaps=true;
	bool fsrc=true;
	
	for(char x:s){
		if(x!=toupper(x)){
			allcaps=false;
			break;
		}
	}
	
	int n=s.length();
	for(int i=0;i<n;i++){
		if(i==0 && s[i]!=tolower(s[i])){
			fsrc=false;
			break;
			
		}else if(i!=0 && s[i]!=toupper(s[i])){
			fsrc=false;
			break;
		}
		
		
	}
	return allcaps||fsrc;
}

void solution(){
	
	string s;

	cin>>s;
	
	if(isChangeable(s)){
		
		int n=s.length();
		for(int i=0;i<n;i++){
		
			if(s[i]==toupper(s[i])){
				s[i]=tolower(s[i]);
			}else{
				s[i]=toupper(s[i]);
			}
		
		}
		
	}
	
	cout<<s<<endl;;
}
int main(){
	
	solution();
	return 0;
}