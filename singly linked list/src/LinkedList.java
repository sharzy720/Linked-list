/**
 * A linked list that holds generic nodes
 * @param <T>
 */
public class LinkedList<T> {
    private Node head;
    private Node tail;

    /**
     * Constructor to create an empty LinkedList
     */
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Inserts a new node at the end of the linked list
     * @param data Value that the new node will hold
     */
    private void insertEnd(T data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            this.tail.next = newNode;
        }
        this.tail = newNode;
    }

    /**
     * Creates generic nodes for the linked list
     */
    private class Node {
        private T data;
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

