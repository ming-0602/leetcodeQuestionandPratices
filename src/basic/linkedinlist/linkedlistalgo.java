package basic.linkedinlist;

class Node {
    int data;
    Node next;

    // Constructor
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {//loop untill last which next is null
            current = current.next;
        }
        current.next = newNode;
    }

    // Delete a node by value
    public void deleteNode(int key) {
        Node current = head, prev = null;

        // If the head node holds the key to be deleted
        if (current != null && current.data == key) {
            head = current.next; // Change head
            return;
        }

        // Search for the key to be deleted
        while (current != null && current.data != key) {
            prev = current;
            current = current.next;
        }

        // If the key was not present in the list
        if (current == null) {
            System.out.println("Key not found");
            return;
        }

        // Unlink the node
        prev.next = current.next;
    }

    // Print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Main method for testing
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtBeginning(3);
        list.insertAtEnd(5);
        list.insertAtBeginning(1);
        list.printList(); // Output: 1 -> 3 -> 5 -> null

        list.deleteNode(3);
        list.printList(); // Output: 1 -> 5 -> null
    }
}

