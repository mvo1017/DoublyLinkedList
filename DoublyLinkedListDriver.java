import java.util.Scanner;
public class DoublyLinkedListDriver {
    public public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter a list type (i - int, d - double, s - string): ");
        String type = user.next()

        if (type.equals("i") || type.equals("d") || type.equals("s"))

        System.out.println("/nCommands: /n(i) - Insert value/n(d) - Delete value/n(p) - Print list/n(l) - Length/n(t) - Print reverse/n(r) - Reverse list/n(b) - Delete Subsection/n(s) - Swap Alternate/n(q) - Quit program");

        System.out.print("Enter a command: ");

        String command = user.next();

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
    } //main
} //class
