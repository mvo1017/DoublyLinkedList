
public class DoublyLinkedList<T extends Comparable<T>> {

    private NodeType<T> head;
    private NodeType<T> tail;
    private int length;


/** Constructor for a Doubly Linked List.
 * able to access the element in front and behind current element
 */
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    } //DoublyLinkedList
/**
 * 
 * @param item
 */
    public void insertItem(T item) {
        NodeType<T> newNode = new NodeType<>(item);

        // If the list is empty
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        // If the newNode's info is less than or equal to head's info
        if (newNode.info.compareTo(head.info) <= 0) {
            newNode.next = head;
            head.back = newNode;
            head = newNode;
            return;
        }

        NodeType<T> current = head;
        while (current.next != null && current.next.info.compareTo(newNode.info) < 0) {
            current = current.next;
        }

        newNode.next = current.next;
        if (current.next != null) {
            newNode.next.back = newNode;
        }
        current.next = newNode;
        newNode.back = current;

        // Adjust tail if necessary
        if (newNode.next == null) {
            tail = newNode;
        }
    } //insert

    public void deleteItem(T item) {

    } //deleteItem

    public int length() {
    return length;  
    } //length

    public void print() {
        NodeType<T> current = head;
        while (current != null) {
            System.out.print(current.info + " ");
            current = current.next;
        }
    } //print

    public void printReverse() {

    } //printReverse

    public void deleteSubsection() {

    } //deleteSubsection

    public void reverseList() {

    } //reverseList

    public void swapAlternate() {

    } //swapAlternate
}