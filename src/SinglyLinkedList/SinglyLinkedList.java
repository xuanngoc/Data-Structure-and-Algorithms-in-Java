package LinkedList;
import LinkedList.LinearList;
import LinkedList.Node;


public class SinglyLinkedList implements LinearList{
    private Node head;
    private int size;

    public SinglyLinkedList() {
        head = null;
        size = 0;
    }

    
    @Override
    public void add(Object element) {
        Node node = new Node(element);
        if(head == null){ // If list is empty
            head = node;
        }else{
            Node p = head;
            while(p.next != null){
                p = p.next;
            }
            p.next = node;
        }
        size++;
    }

    
    @Override
    public void remove(int index) {
        if(index == 0){
            Node p = head;
            head = head.next;
            p.next = null;
        }else{
            Node p = head;
            for(int i = 0; i < index - 1; i++){
                p = p.next;
            }

            Node delNode = p;
            p.next = p.next.next;
            delNode = null;
        }
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Object get(int index) {
        if(index == 0){
            return head.element;
        }else{
            Node p = head;
            for(int i = 0; i < index ; i++){
                p = p.next;
            }

            return p.element;
        }
        
    }
    

    @Override
    public void printList(){
      Node node = head;
      while(node != null){
          System.out.println(node.element.toString());
          node = node.next;
      }
    }
}