/*
* author: akashzsh
* language: cpp
* created: 13-08-2024
*/


#include<bits/stdc++.h>
using namespace std;

struct Pair {
    int x;
    string name;
};

int main() {
    
    vector<Pair> vec;

    vec.push_back({1, "Ruchitha"});
    vec.push_back({2, "Akash"});
    vec.push_back({0, "Krishna"});

    // suppose want to take local variables
    /*
    auto compare = [&mp] (Pair& p1, Pair& p2) {
        // body of comparator
    }
    */

    auto compare = [] (Pair& p1, Pair& p2) {
        return p1.x < p2.x;
    };

    sort(vec.begin(), vec.end(), compare);

    for (auto& it : vec) {
        cout << it.x << " and " << it.name << "\n";
    }

    return 0;
}
