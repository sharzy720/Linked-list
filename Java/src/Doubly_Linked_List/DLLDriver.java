package Doubly_Linked_List;

/**
 * Driver for DoublyLinkedList
 */
public class DLLDriver {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("Original List\n" +linkedList);

        linkedList.delete(4);

        System.out.println("Remove node holding 4\n" + linkedList);
    }
}
