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
