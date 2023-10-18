
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

        //inserting in the middle of list. general case
        insert.next = temp;
        insert.back = temp.back;
        temp.back.next = insert;
        temp.back = insert;
        length++;


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
    * Items in the list are printed to standard output.
    */
    public void print() {
        NodeType<T> current = head;
        while (current != null) {
            System.out.print(current.info + " ");
            current = current.next;
        }
    } //print

    /**
    * Items in list are printed to standard output in reverse order.
    */
    //MONG
    public void printReverse() {

        NodeType<T> temp = head;
        for (int i = 0; i < length - 1; i++) {
            temp = temp.next;
        } //traverse to last node

        for (int i = 0; i < length; i++) {
            System.out.print(temp.info + " ");

            if (temp.back != null) {
            temp = temp.back;
            } //if there is a node back (for error avoidance)

        } //print in reverse

    } //printReverse

    /**
    * Takes input from user for a lower and upper bound (inclusive)
    * for a range of values to be deleted from the list.
    * @param lower
    * @param upper
    */
    public void deleteSubsection() {

    } //deleteSubsection

    /** Reverses the original list.
    * Cannot take elements from original list and create a new list in reverse order.
    */
    //MONG
    public void reverseList() {
        if (length == 1) {
            return;
        } //do nothing if only one item in list

        NodeType<T> temp = head;

        for (int i = 0; i < length - 1; i++) {
            temp = temp.next;
        } //traverse to end of list

        head = temp; //set end of list to head

        for (int i = 0; i < length; i++) {
            if (temp.back != null) {
                temp.next = temp.back;
                temp.back.back = temp;
                temp = temp.next;
            }
        }

    } //reverseList

    /**
    * Swaps every other node in the list.
    */
    //MONG
    public void swapAlternate() {
        if (length <= 1) {
            return;
        } //do nothing for list of size 1 or 0
        
        NodeType<T> temp = head;

        /*if (temp.next != null) {
            temp = temp.next;
            temp.next.next = temp.next;
            temp.next = temp.back;
            temp.next.back = temp;
            temp.next.next.back = temp.next;
            //swap nodes

            if (temp.next.next != null) {
                temp = temp.next.next;
            } //continue swapping rest of nodes
        } //if
        */
        boolean done = false;
        while (temp.next != null && !done) {
            if (temp.next != null) {
                T tempInfo = temp.info;
                temp.info = temp.next.info;
                temp.next.info = tempInfo;
            }
            if (temp.next.next != null) {
                 temp = temp.next.next;
            } else {
                done = true;
            }
            
        }

    } //swapAlternate
}