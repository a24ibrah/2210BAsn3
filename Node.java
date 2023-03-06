public class Node {
    private Node left;
    private Node right;
    private int height;
    private Object key;
    private Object value;
    // Node constructor
    public <K extends Comparable<K>, V> Node(K key, V value) {
        this.key = key;
        this.value = value;
        this.height = 0;
    }

    // Getters and setters
    public Node getLeft() {
        return left;
    }
    public void setLeft(Node left) {
        this.left = left;
    
    public Node getRight() {
        return right;
    }
    public void setRight(Node right) {
        this.right = right;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public Object getKey() {
        return key;
    }
    public void setKey(Object key) {
        this.key = key;
    }
    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
}
