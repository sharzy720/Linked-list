package Doubly_Linked_List;

/**
 * A linked list that holds generic nodes
 * @param <T>
 */
public class DoublyLinkedList<T> {
    private Node head;
    private Node tail;
    private int size;

    /**
     * Constructor to create an empty test.LinkedList
     */
    public DoublyLinkedList() {
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
            newNode.prev = this.tail;
            this.tail.next = newNode;
        }
        this.tail = newNode;
        this.size++;
    }

    /**
     * Insert at a given index
     * @param index Place to insert data
     * @param data Data to be inserted
     */
    public void insertAtIndex(int index, T data) {
        Node newNode = new Node(data);
        Node current = this.head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        newNode.prev = current;
        this.size++;
    }

    /**
     * Deletes node that contains given data
     * @param data Data to search list for
     */
    public void delete(T data) {
        Node current = this.head;
        while (current != null) {
            if (current.data == data) {
                current.prev.next = current.next;
                break;
            } else {
                current = current.next;
            }
        }
        this.size--;
    }

    /**
     * Deletes node at a given index
     * @param index Place to remove Node
     */
    public void deleteAtIndex(int index) {
        Node current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.prev.next = current.next;
        this.size--;
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
     * Get the size of the linked list
     * @return Size of list
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Creates generic nodes for the linked list
     */
    private class Node {
        private final T data;
        private Node next;
        private Node prev;

        /**
         * Constructor of a new Node
         * @param data Value that the node will hold
         */
        public Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
}
