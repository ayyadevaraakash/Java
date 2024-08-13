/*
* author: akashzsh
* language: cpp
* created: 13-08-2024
*/


#include<bits/stdc++.h>
using namespace std;

int main() {

    unordered_map<string, int> mp;
    mp["ruchitha"] = 100;
    mp["akash"] = 60;
    mp["krishna"] = 120;

    auto compare = [&mp] (string& s1, string& s2) {
        return mp[s1] < mp[s2];
    };

    priority_queue<string, vector<string>, decltype(compare)> pq(compare);

    pq.push("ruchitha");
    pq.push("akash");
    pq.push("krishna");

    while (!pq.empty()) {
        cout << pq.top() << "\n";
        pq.pop();
    }

    return 0;
}
