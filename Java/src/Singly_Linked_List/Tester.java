package Singly_Linked_List;

public class Tester {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
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
