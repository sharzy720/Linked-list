# Class for a node in a doubly linked list
class Node:
    # Constructor for a node in a doubly linked list
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None

# Class for a doubly linked list
class DLinkedList:
    # Constructor for a doubly linked list
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    # Add a new node to the end of the linked list
    def add(self, data):
        new_node = Node(data)
        if self.head is None:
            self.head = new_node
        else:
            new_node.prev = self.tail
            self.tail.next = new_node
        self.tail = new_node
        self.size += 1

    # Add a new node at a specific index in the linked list
    def insert_at_index(self, index, data):
        if index > self.size:
            print("Index outside bounds")
        else:
            new_node = Node(data)
            current = self.head
            for node in range(index-1):
                current = current.next

            new_node.next = current.next
            current.next = new_node
            new_node.prev = current
            self.size += 1

    # Delete a node holding specific data in the linked list
    def delete(self, data):
        current = self.head
        while current is not None:
            if current.data == data:
                current.prev.next = current.next
                break
            else:
                current = current.next
        self.size -= 1

    # Delete a node at a specific index in the linked list
    def delete_at_index(self, index):
        if index > self.size:
            print("index out of bounds")
        else:
            current = self.head
            for node in range(index):
                current = current.next
            current.prev.next = current.next
            self.size -= 1

    # Stylize the linked list for printing
    def to_string(self):
        printout = ""
        current = self.head
        while current is not None:
            printout += str(current.data) + " "
            current = current.next
        return printout


linked_list = DLinkedList()
linked_list.add(1)
linked_list.add(2)
linked_list.add(3)
linked_list.add(4)
linked_list.add(5)

print("Original List, List Size: " + str(linked_list.size) + "\n" + str(linked_list.to_string()))

linked_list.delete(4)
print("Remove node holding 4, List Size: " + str(linked_list.size) + "\n" + str(
    linked_list.to_string()))

linked_list.delete_at_index(2)
print("remove node at index 2, List Size: " + str(linked_list.size) + "\n" + str(
    linked_list.to_string()))

linked_list.insert_at_index(2, 10)
print("Insert node at index 2, List Size: " + str(linked_list.size) + "\n" + str(
    linked_list.to_string()))
