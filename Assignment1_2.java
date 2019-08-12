/*
Assignment 1.2

Part A:
Create a Java program, which is passed two arguments at the command prompt. The arguments should represent the names of your favourite fruits and be stored in the args array.
Using the arguments stored in the args array, display a message in the console like "Apples and Oranges are good for you!"

Part B:
What is the name of the runtime exception that occurs, if you don’t pass the required number of arguments to the main method? Is it a checked or an unchecked exception?

An Array Index Out of Bounds Exception is thrown if the required number of arguments is not passed to the main method. This is an unchecked exception.

Save the program as Assignment1_2.java.
 */
public class Assignment1_2 {

    public static void main(String[] args) {

        System. out.println(args[0] + " and " + args[1] + " are good for you!");
    }
}
