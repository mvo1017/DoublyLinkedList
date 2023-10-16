import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class DoublyLinkedListDriver {
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


    DoublyLinkedList<?> list;
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
    String line;
    switch(listType) {

    //creating list for integers    
    case "i":
    DoublyLinkedList<Integer> intList = new DoublyLinkedList<>();
    while ((line = br.readLine()) != null) {
        for(String item : line.split("\\s+")) {
            intList.insertItem(Integer.parseInt(item));
        } //for
    } //while
    list = intList;
    break;

    //creating list for doubles
    case "d":
    DoublyLinkedList<Double> doubleList = new DoublyLinkedList<>();
    while ((line = br.readLine()) != null) {
        for(String item : line.split("\\s+")) {
            doubleList.insertItem(Double.parseDouble(item));
        } //for
    } //while
    list = doubleList;
    break;

    //creating list for Strings
    case "s":
    DoublyLinkedList<String> stringList = new DoublyLinkedList<>();
    while ((line = br.readLine()) != null) {
    stringList.insertItem(line);
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
    System.out.println("/nCommands: /n(i) - Insert value/n(d) - Delete value/n(p) - Print list/n(l) - Length/n(t) - Print reverse/n(r) - Reverse list/n(b) - Delete Subsection/n(s) - Swap Alternate/n(q) - Quit program");

        System.out.print("Enter a command: ");

        String command = scanner.next();

        boolean running = true;

        while (running) {
            if (command.equals("i")) {

            } //insert value

            if (command.equals("d")) {

            } //delete value

            if (command.equals("p")) {

            }  //print list

            if (command.equals("l")) {

            } //length

            if (command.equals("t")) {

            } //print reverse

            if (command.equals("r")) {

            } //reverse list

            if (command.equals("i"))


        } //while
System.out.println("Exiting program.\n");
scanner.close();
System.exit(0);

}
}
