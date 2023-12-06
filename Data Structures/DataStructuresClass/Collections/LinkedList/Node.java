package Collections.LinkedList;

public class Node<T> {
    private T value;
    private Node<T>next;
    //constructors 
    public Node(T value) {
        this.value = value;
        this.next = null;
    }
    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }
    
    //getters and setters
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public Node<T> getNext() {
        return next;
    }
    public void setNext(Node<T> next) {
        this.next = next;
    }
    //To string 
    @Override
    public String toString() {
        return "Node [value=" + value + ", next=" + next + "]";
    }
    
    
}
