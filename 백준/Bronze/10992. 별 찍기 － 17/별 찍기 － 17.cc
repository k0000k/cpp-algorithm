#include <bits/stdc++.h>

#define endl '\n'

using namespace std;

int main() {
    ios_base :: sync_with_stdio(false);
    cin.tie(NULL);

    int n;
    cin >> n;

    for (int i = 1; i <= n - 1; ++i) {
        cout << " ";
    }
    cout << "*" << endl;

    for (int i = 2; i <= n - 1; i++) {
        for (int j = 1; j <= n - i; j++) {
            cout << " ";
        }
        cout << "*";
        for (int j = 1; j <= 2 * i - 3; j++) {
            cout << " ";
        }
        cout << "*" << endl;
    }

    if (n != 1) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            cout << "*";
        }
    }

    return 0;
}
