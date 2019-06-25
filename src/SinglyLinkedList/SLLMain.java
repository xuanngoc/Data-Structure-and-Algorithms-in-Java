import LinkedList.SinglyLinkedList;

public class SLLMain{
    // public static void class main(){
    //     SinglyLinkedList list = new SinglyLinkedList();

    //     list.add(1, 1999);
    //     list.add(2, 32007);
    //     list.add(3, 32014);

        
    //     list.printList();

    //     System.out.print(list.size() + "\n");
    // }

    public static void main(String args[]){
        SinglyLinkedList list = new SinglyLinkedList();

        list.add(1999);
        list.add(32007);
        list.add(32014);

        list.add(320122);
        list.add(320111);


        System.out.print(list.size() + "\n");
        list.printList();

        


        System.out.println("Value = " + list.get(3));
        
    }
}