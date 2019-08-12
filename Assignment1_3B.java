/*
Assignment 1.3

Part B

Briefly review the Collections class in the java.util package (note, the Collections class is not examinable on the Java Associate 8 exam).

Create an ArrayList named members, to store the following strings:

• "John"
• "Paul",
• "George"
• "Ringo"

Sort the collection in ascending order and display the contents in the console.

Save the program as Assignment1_3B.java.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Assignment1_3B {

    public static void main (String[] args) {

        ArrayList<String> members = new ArrayList<String>(4);
        members.add("John");
        members.add("Paul");
        members.add("George");
        members.add("Ringo");

        Collections.sort(members);

        System.out.print(members);
    }
}
