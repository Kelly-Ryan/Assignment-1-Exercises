/*
Assignment 1.3

An important skill for a Java programmer, is the ability to read and understand the Java API.

Part A

Briefly review the Arrays class in the java.util package (note, the Arrays class is not examinable on the Java Associate 8 exam).

• Create an array to store the following integers: 7,6,5,4,3,2,1.
• Sort the contents of the array in ascending numerical order.
• Output the contents of the array using an enhanced for loop.

Save the program as Assignment1_3A.java.
 */
import java.util.Arrays;

public class Assignment1_3A {

    public static void main(String[] args) {

        int[] array = {7, 6, 5, 4, 3, 2, 1};

        //sorts elements of array into ascending numerical order
        Arrays.sort(array);

        for(int a : array) {
            System.out.print(a + " ");
        }
    }
}
