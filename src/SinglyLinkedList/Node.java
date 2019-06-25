package LinkedList;

public class Node {
    public Object element;
    public Node next;


    public Node(Object element, Node next) {
        this.element = element;
        this.next = next;
    }
    public Node(Object element){
        this.element = element;
        this.next = null;
    }
    public Node(){
        this.element = 0;
        this.next = null;
    }

    
}