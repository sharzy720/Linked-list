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

        System.out.println("Original List, List Size: " + linkedList.getSize() + "\n" +linkedList);

        linkedList.delete(4);

        System.out.println("Remove node holding 4, List Size: " + linkedList.getSize() + "\n" +linkedList);

        linkedList.deleteAtIndex(2);

        System.out.println("Remove node at index 2, List Size: " + linkedList.getSize() + "\n" +linkedList);

        linkedList.insertAtIndex(2, 10);

        System.out.println("Insert node at index 2, List Size: " + linkedList.getSize() + "\n" +linkedList);
    }
}
