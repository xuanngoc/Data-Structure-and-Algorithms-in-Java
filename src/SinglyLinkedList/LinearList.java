package LinkedList;

public interface LinearList {
    public void add(Object element);
    public void remove(int index);
    public int size();
    public boolean isEmpty();
    public Object get(int index);
    public void printList();
}