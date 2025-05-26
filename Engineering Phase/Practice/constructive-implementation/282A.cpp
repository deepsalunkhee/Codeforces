#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    int count=0;
    cin>>n;
    while(n--)
    {
        string s;
        cin>>s;
        if(s[0]=='X')
        {
            if((s[1]=='+'))
            {
                count++;
            }
            else{
                count--;
            }

        }
        if(s[2]=='X')
        {
            if((s[1]=='+'))
            {
                ++count;
            }
            else{
                --count;
            }


        }
    }



    cout<<count;
}