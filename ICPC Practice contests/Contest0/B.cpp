#include<bits/stdc++.h>
using namespace std;
bool isInfinity(const string& s){
    string lower=s;
    for(char& c:lower)c=tolower(c);
    return lower=="inf"||lower=="+inf"||lower=="-inf";
}
bool isNaN(const string& s){
    string lower=s;
    for(char& c:lower)c=tolower(c);
    return lower=="nan";
}
int main(){
    int n;
    cin>>n;
    cout<<fixed<<setprecision(6);
    for(int i=0;i<n;i++){
        string input;
        cin>>input;
        if(isNaN(input)){
            cout<<"NaN"<<endl;
            continue;
        }
        if(isInfinity(input)){
            cout<<"0"<<endl;
            continue;
        }
        double num=stod(input);
        if(num==0){
            cout<<"inf"<<endl;
        }else{
            cout<<1.0/num<<endl;
        }
    }
    return 0;
}