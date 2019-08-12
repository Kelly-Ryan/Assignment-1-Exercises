/*

Assignment 1.9

Part C
Write a program, which declares a variable (of type int), named width. The variable should be declared in the main method.
• The variable should be assigned the decimal literal value 3. Print the value stored in the variable to the console.
• Re-assign the variable with the binary literal value 3. Print the value stored in the variable to the console.
• Re-assign the variable with the octal literal value 3. Print the value stored in the variable to the console.
• Re-assign the variable with the hexadecimal literal value of 3. Print the value stored in the console.
Save the program as Assignment1_9C.java.

 */
public class Assignment1_9C {

    public static void main (String[] args) {

        int width = 3;  //decimal value 3

        System.out.println("Decimal literal: " + width);

        width = 0b11;   //binary value 3

        System.out.println("Binary literal: " + width);

        width = 003;    //octal value 3

        System.out.println("Octal literal: " + width);

        width = 0x3;    //hexadecimal value 3

        System.out.println("Hexadecimal literal: " + width);

    }
}
