public class DoublyLinkedList<T extends Comparable<T>> {

    private NodeType<T> head;
    private int length;


    /** Constructor for a Doubly Linked List.
    * able to access the element in front and behind current element
    */
    public DoublyLinkedList() {
        head = new NodeType<>();
        length = 0;

    } //DoublyLinkedList
    /**
    *  Item is inserted into list, maintaining sorted order.
    * @param item
    */
    public void insertItem(T item) {

    } //insert

    /**
     * Node that contains item is removed from list.
     * If item is not present, print a message.
     * @param item
     */
    public void deleteItem(T item) {

    } //deleteItem

    /**
     * @return length of the list.
     */
    public int length() {
        return length;

    } //length

    /**
     * Items in list are printed to standard output.
     */
    public void print() {

    } //print

    /**
     * Items in list are printed to standard output in reverse order.
     */
    public void printReverse() {

    } //printReverse

    /**
     * Takes input from user for a lower and upper bound (inclusive) 
     * for a range of values to be deleted from the list.
     * @param lower
     * @param upper
     */
    public void deleteSubsection(T lower, T upper) {

    } //deleteSubsection

    /**
     * Reverses the original list.
     * Cannot take elements from original list and create a new list in reverse order.
     */
    public void reverseList() {

    } //reverseList

    /**
     * Swaps every other node in the list.
     */
    public void swapAlternate() {

    } //swapAlternate
}