import java.io.*;
import java.nio.file.*;
import java.util.Scanner;
<<<<<<< HEAD


public class DoublyLinkedListDriver {
=======
public class DoublyLinkedListDriver<T extends Comparable<T>>{
    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        boolean validType = false;
        while (!(validType)) {
            System.out.print("Enter a list type (i - int, d - double, s - string): ");
            String type = user.next();

            if (type.equals("i") || type.equals("d") || type.equals("s")) {
                validType = true;
            } else {
                System.out.println("Invalid list type. Please try again.");
            }
        } //keeps going until user enters a valid list type   

        System.out.println("/nCommands: /n(i) - Insert value/n(d) - Delete value/n(p) - Print list/n(l) - Length/n(t) - Print reverse/n(r) - Reverse list/n(b) - Delete Subsection/n(s) - Swap Alternate/n(q) - Quit program");

        System.out.print("Enter a command: ");

        String command = user.next();

        boolean running = true;

        while (running) {
            if (command.equals("i")) {
                System.out.print("The list is: ");
                System.out.print("/nEnter an item to insert: ");

                if (type.equals("i")) {
                    int item = user.nextInt();
                } else if (type.equals("d")) {
                    double item = user.nextDouble();
                } else if (type.equals("s")) {
                    String item = user.next();
                }

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
>>>>>>> acdad49 (insertItem, printReverse, reverseList)


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
case "i":
DoublyLinkedList<Integer> intList = new DoublyLinkedList<>();
while ((line = br.readLine()) != null) {
for(String item : line.split("\\s+")) {
intList.insertItem(Integer.parseInt(item));
}
}
list = intList;
break;


case "d":
DoublyLinkedList<Double> doubleList = new DoublyLinkedList<>();
while ((line = br.readLine()) != null) {
for(String item : line.split("\\s+")) {
doubleList.insertItem(Double.parseDouble(item));
}
}
list = doubleList;
break;


case "s":
DoublyLinkedList<String> stringList = new DoublyLinkedList<>();
while ((line = br.readLine()) != null) {
stringList.insertItem(line);
}
list = stringList;
break;


default:
System.out.println("Invalid choice!");
return;
}
} catch(IOException e) {
System.out.println("Error reading file: " + e.getMessage());
return;
}


list.print();
System.out.println("Exiting program.\n");
scanner.close();
System.exit(0);

}
}
