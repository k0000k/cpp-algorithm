#include <bits/stdc++.h>

#define endl '\n'

using namespace std;

int main() {
    ios_base ::sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin >> n;

    char comma;
    for (int i = 0; i < n; i++) {
        int a, b;
        cin >> a >> comma >> b;
        cout << a + b << endl;
    }

    return 0;
}
