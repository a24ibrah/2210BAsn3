public class AVLTree<K extends Comparable<K>, V> {
    private Node root;
    // AVLTree constructor
    AVLTree() {
        root = null;
    }
    // height() returns the height of the tree
    int height(Node node) {
        return 0;
    }
    // updateHeight() updates the height of the node
    void updateHeight(Node node) {
        return;
    }
    // getBalance() returns the balance factor of the node
    int getBalance(Node node) {
        return 0;
    }
    // rotateLeft() performs a left rotation on the node
    Node rotateLeft(Node node) {
        return null;
    }
    // rotateRight() performs a right rotation on the node
    Node rotateRight(Node node) {
        return null;
    }
    // insert() inserts a new node into the tree
    void insert(K key, V value) {
        root = insert(root, key, value);
    }
    Node insert(Node node, K key, V value) {
        return node;
    }
    // find() returns the value of the node with the given key
    V find(K key) {
        return find(root, key);
    }
    V find(Node node, K key) {
        return null;
    }
    // delete() deletes the node with the given key
    void delete(K key) {
        root = delete(root, key);
    }
    Node delete(Node node, K key) {
        return null;
    }
}
