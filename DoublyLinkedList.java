
public class DoublyLinkedList<T extends Comparable<T>> {

    private NodeType<T> head;
    private int length;


    /** Constructor for a Doubly Linked List.
    * able to access the element in front and behind current element
    */
    //MONG
    public DoublyLinkedList() {
        this.head = null;
        this.length = 0;
    } //DoublyLinkedList

    /**
    *  Item is inserted into list, maintaining sorted order.
    * @param item
    */
    //MONG
    public void insertItem(T item) {
        NodeType<T> newNode = new NodeType<>(item);

        NodeType<T> insert = new NodeType<>();
        insert.info = item;
        NodeType<T> temp = head;

        if (length == 0) {
            head = insert;
            length++;
            return;
        } //initialize head for empty list

        if (item.compareTo(head.info) < 0) {
            temp.back = insert;
            insert.next = temp;
            head = insert;
            length++;
            return;
        } //if item is less than head

        while (temp.next != null && item.compareTo(temp.info) > 0) {
            temp = temp.next;
        } //while

        if (item.compareTo(temp.info) == 0) {
            System.out.println("Item already exists");
            return;
        } //checking for duplicates

        if (temp.next == null && item.compareTo(temp.info) > 0) {
            temp.next = insert;
            insert.back = temp;
            length++;
            return;
        } //if item should be at end of list

        //inserting in the middle of list
        insert.next = temp;
        insert.back = temp.back;
        temp.back = insert;


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