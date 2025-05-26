#include<bits/stdc++.h>
using namespace std;

void solution() {
    long long a, b, c;
    cin >> a >> b >> c;
    int mi=min(b,c);

    

    cout << ((a+mi-1)/mi) << endl;
}

int main() {
    int t;
    cin >> t;

    while (t--) {
        solution();
    }
    return 0;
}
