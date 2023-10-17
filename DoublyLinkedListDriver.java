import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class DoublyLinkedListDriver<T extends Comparable<T>> {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter list type (i - int, d - double, s - string): ");
    String listType = scanner.nextLine();


    String fileName;
    switch(listType) {
    case "i":
    fileName = "int-input.txt";
    break;
    case "d":
    fileName = "double-input.txt";
    break;
    case "s":
    fileName = "string-input.txt";
    break;
    default:
    System.out.println("Invalid choice!");
    return;
    } 
    DoublyLinkedList<Integer> intList = new DoublyLinkedList<>();
    DoublyLinkedList<Double> doubleList = new DoublyLinkedList<>();
    DoublyLinkedList<String> stringList = new DoublyLinkedList<>();

    DoublyLinkedList<?> list;
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
    String line;
    switch(listType) {

    //creating list for integers    
    case "i":
    while ((line = br.readLine()) != null) {
        for(String item : line.split("\\s+")) {
            intList.insertItem(Integer.parseInt(item));
        } //for
    } //while
    list = intList;
    break;

    //creating list for doubles
    case "d":
    while ((line = br.readLine()) != null) {
        for(String item : line.split("\\s+")) {
            doubleList.insertItem(Double.parseDouble(item));
        } //for
    } //while
    list = doubleList;
    break;

    //creating list for Strings
    case "s":
    while ((line = br.readLine()) != null) {
        for(String item : line.split("\\s+")) {
            stringList.insertItem(item);
        } //for
    } //while
    list = stringList;
    break;

    default:
    System.out.println("Invalid choice!");
    return;
    } //switch

    } catch(IOException e) {
    System.out.println("Error reading file: " + e.getMessage());
    return;
    }

    list.print();

    //list of commands for user
    System.out.println("\nCommands: \n(i) - Insert value\n(d) - Delete value\n(p) - Print list\n(l) - Length\n(t) - Print reverse\n(r) - Reverse list\n(b) - Delete Subsection\n(s) - Swap Alternate\n(q) - Quit program");

        System.out.print("Enter a command: ");

        String command = scanner.next();

        boolean running = true;

        while (running) {
            if (command.equals("i")) {
                System.out.print("The list is: ");
                list.print();
                System.out.print("\nEnter an item to insert: ");
                
                if (listType.equals("s")) {
                    String item = scanner.next();
                    stringList.insertItem(item);
                    list = stringList;

                } else if (listType.equals("i")) {
                    int item = scanner.nextInt();
                    intList.insertItem(item);
                    list = intList;

                } else if (listType.equals("d")) {
                    double item = scanner.nextDouble();
                    doubleList.insertItem(item);
                    list = doubleList;

                } //distinguishing between item types

                System.out.print("\nThe list is: ");
                list.print();
                System.out.print("\nThe reverse list: ");
                list.printReverse();

            } //insert value

            else if (command.equals("d")) {

                System.out.print("\nThe list is: ");
                list.print();
                System.out.print("\nEnter an item to delete: ");

                if (listType.equals("s")) {
                    String item = scanner.next();
                    stringList.deleteItem(item);

                } else if (listType.equals("i")) {
                    int item = scanner.nextInt();
                    intList.deleteItem(item);

                } else if (listType.equals("d")) {
                    double item = scanner.nextDouble();
                    doubleList.deleteItem(item);
                } //distinguishing between item types

                System.out.print("The list is: ");
                list.print();
                System.out.print("\nThe reverse list: ");
                list.printReverse();

            } //delete value

            else if (command.equals("p")) {
                System.out.print("\nThe list is: ");
                list.print();
            }  //print list

            else if (command.equals("l")) {
                System.out.println("The length of the list is " + list.length());

            } //length

            else if (command.equals("t")) {
                System.out.print("The reverse list: ");
                list.printReverse();
            } //print reverse

            else if (command.equals("r")) {
                System.out.print("\nThe original list: ");
                list.print();
                System.out.print("\nThe reversed list: ");
                list.reverseList();
                list.print();

            } //reverse list

            else if (command.equals("b")) {

            } //delete subsection

            else if (command.equals("s")) {

            } //swap alternate

            else if (command.equals("q")) {
                running = false;
            } //quit program

            else {
                System.out.println("Invalid choice! Please try again.");
            } //invalid input

        } //while
System.out.println("Exiting program...\n");
scanner.close();
System.exit(0);

}
}
