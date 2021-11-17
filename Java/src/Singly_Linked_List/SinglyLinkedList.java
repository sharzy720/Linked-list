package Singly_Linked_List;

/**
 * A linked list that holds generic nodes
 * @param <T>
 */
public class SinglyLinkedList<T> {
    private Node head;
    private Node tail;

    /**
     * Constructor to create an empty test.LinkedList
     */
    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Adds a new node at the end of the linked list
     * @param data Value that the new node will hold
     */
    public void add(T data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            this.tail.next = newNode;
        }
        this.tail = newNode;
    }

    /**
     * Deletes node that contains given data
     * @param data Data to search list for
     */
    public void delete(T data) {
        Node current = this.head;
        Node prev = current;
        while (current != null) {
            if (current.data == data) {
                prev.next = current.next;
                break;
            } else {
                prev = current;
                current = current.next;
            }
        }
    }

    /**
     * Styles the list for printing
     * @return Stylized version of data in linked list
     */
    public String toString() {
        StringBuilder printout = new StringBuilder();
        Node current = this.head;
        while (current != null) {
            printout.append(" ").append(current.data);
            current = current.next;
        }
        return printout.toString();
    }

    /**
     * Creates generic nodes for the linked list
     */
    private class Node {
        private final T data;
        private Node next;

        /**
         * Constructor of a new Node
         * @param data Value that the node will hold
         */
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }
}


