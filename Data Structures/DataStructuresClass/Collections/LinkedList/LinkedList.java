package Collections.LinkedList;

public class LinkedList<T> {
    private Node<T> first;
    private Node<T> last;
    private int size;
    //adding the first node
    public void addNode(T value){
        Node<T> cell = new Node<T>(value);
        if(size==0){
            this.first=cell;
        }else {
            this.last.setNext(cell);
        }
        this.last = cell;
        this.size++;
    }
    public void addInLast(T value){

    }
    @Override
    public String toString() {
        return "LinkedList [first=" + first + "]";
    }
    
}
