#include <bits/stdc++.h>
using namespace std;
#define endl '\n'

struct Node {
    int val;
    Node* left;
    Node* right;
    int height;

    Node(int _val) : val(_val), left(NULL), right(NULL), height(1) {
    }
};

class AVL {
   public:
    int depth(Node* node) {
        if (node == NULL) {
            return 0;
        } else {
            return node->height;
        }
    }

    int get_balance_factor(Node* node) {
        if (node == NULL) {
            return 0;
        } else {
            return depth(node->left) - depth(node->right);
        }
    }

    Node* left_rotate(Node* node) {
        Node* right_child = node->right;
        Node* right_left_child = right_child->left;

        right_child->left = node;
        node->right = right_left_child;

        node->height = 1 + max(depth(node->left), depth(node->right));
        right_child->height = 1 + max(depth(right_child->left), depth(right_child->right));

        return right_child;
    }

    Node* right_rotate(Node* node) {
        Node* left_child = node->left;
        Node* left_right_child = left_child->right;

        left_child->right = node;
        node->left = left_right_child;

        node->height = 1 + max(depth(node->left), depth(node->right));
        left_child->height = 1 + max(depth(left_child->left), depth(left_child->right));

        return left_child;
    }

    Node* insert(Node* node, int key) {
        if (node == NULL) {
            return new Node(key);
        }

        if (key < node->val) {
            node->left = insert(node->left, key);
        } else if (key > node->val) {
            node->right = insert(node->right, key);
        } else {
            return node;
        }

        node->height = 1 + max(depth(node->left), depth(node->right));

        int balance_factor = get_balance_factor(node);

        if (balance_factor > 1 and key < node->left->val) {
            return right_rotate(node);
        }

        if (balance_factor < -1 and key > node->right->val) {
            return left_rotate(node);
        }

        if (balance_factor > 1 and key > node->left->val) {
            node->left = left_rotate(node->left);
            return right_rotate(node);
        }

        if (balance_factor < -1 and key < node->right->val) {
            node->right = right_rotate(node->right);
            return left_rotate(node);
        }

        return node;
    }

    void dfs(Node* root) {
        if (root == NULL) {
            return;
        }
        cout << root->val << " ";
        dfs(root->left);
        dfs(root->right);
    }
};

void solve() {
    AVL tree;
    Node* root = NULL;
    int key = 1;
    while (key) {
        cin >> key;
        root = tree.insert(root, key);
        cin >> key;
    }
    tree.dfs(root);
    cout << endl;
}

signed main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);

    // clang-format off
    int _t; cin >> _t; while (_t--)
    solve();
    // clang-format on

    return 0;
}