package Doubly_Linked_List;

/**
 * A linked list that holds generic nodes
 * @param <T>
 */
public class DoublyLinkedList<T> {
    private Node head;
    private Node tail;

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
    private void add(T data) {
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
    private void delete(T data) {
        Node current = this.head;
        Node prev = current;
        while (current != null) {
            if (current.data == data) {
                prev.next = current.next;
            } else {
                prev = current;
                current = current.next;
            }
        }
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


