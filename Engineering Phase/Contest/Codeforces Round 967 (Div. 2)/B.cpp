#include <iostream>
#include <vector>
using namespace std;

void solution() {
    int n;
    cin >> n;
    int m=n;
    int i=0;
    int j=n-1;
    vector<int>t(n);
    
    

    if (n == 1) {
        cout << "1\n";
    } else if (n%2 == 0) {
        cout << "-1\n";
    } else {
       
       while(i<=j){
       	t[i]=n--;
       	t[j]=n--;
       	i++;
       	j--;
       }
       
       t[m/2]=1;
       
       for(int x:t)
       cout<<x<<" ";
       
       cout<<endl;
    }
    
}

int main() {
    int t;
    cin >> t;

    while (t--) {
        solution();
    }

    return 0;
}
