/*
* author: akashzsh
* language: cpp
* created: 08-06-2024
*/


#include<bits/stdc++.h>
using namespace std;

bool is_operator(char ch) {
    return ch == '^' || ch == '/' || ch == '*' || ch == '+' || ch == '-' || ch == '(';
}

string infix_to_prefix(string s) {
    unordered_map<char, int> mp {
        {'+', 1}, {'-', 1},
        {'*', 2}, {'/', 2},
        {'^', 3}
    };

    stack<char> st;

    reverse(s.begin(), s.end());

    string res = "";

    for (int i = 0, n = s.size(); i < n; i++) {
        if (is_operator(s[i]) == false) {
            if (s[i] == ')') {
                st.push(s[i]);
            } else {
                res = res + s[i];
            }
        } else {
            if (s[i] == '(') {
                while (!st.empty() && st.top() != ')') {
                    res = res + st.top(); st.pop();
                }
                st.pop();
            } else {
                while (!st.empty() && mp[s[i]] < mp[st.top()]) {
                    res = res + st.top(); st.pop();
                }
                st.push(s[i]);
            }
        }
    }

    while (!st.empty()) {
        res = res + st.top(); st.pop();
    }

    reverse(res.begin(), res.end());

    return res;
}

int main() {
    // string s = "x+y*z/w+u";
    string s = "K+L-M*N+(O^P)*W/U/V*T+Q";
    // string s = "(A+B)*(C+D)";
    string res = infix_to_prefix(s);
    cout << res;
    return 0;
}
