/*
Assignment 1.1
Part A:
Create a Java program, which displays the message, “Hello World!” in the console. Compile and run the program from the command prompt.

Part B:
Write a brief description of the words contained in the main() method’s signature.
Save the program as Assignment1_1.java.
 */

//Part A
public class Assignment1_1 {

    public static void main (String[] args) {

        System.out.println("Hello World!");
    }
}

/*
Part B

Assignment 1.1
public: public is an access modifier and allows the main method to be accessed from anywhere.

static: the static modifier is used to declare class fields and methods. static methods can be called even if they class
they are in has not been instantiated.

void: if a method has a return type of void that means it does not return any value when it is called.

String[] args: This is the main method's parameter list, represented as an array of java.lang.String objects.
Values can be passed to the args array from the command prompt.
 */

