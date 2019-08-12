/*
Assignment 1.3

Part C

To answer this question, you will need to briefly review the String class (java.lang) and the Console class in the
java.io package (note, the Console class is not examinable on the Java Associate 8 exam).

The Console class allows for a password or passphrase to be read from the console with echoing disabled.

Create a program (utilising the Console class), which prompts the user to enter a ghosted password at the command prompt.

The password is enigma and the user should be given three opportunities to enter it.

Save the program as Assignment1_3C.java.

 */

import java.io.Console;

public class Assignment1_3C {

    static Console cons = System.console();
    static char[] input;
    static String password = "enigma";
    static int remainingAttempts = 3;
    static boolean validPwd = false;
    static String inputPwd;

    public static void main (String[] args) {

        enterPassword();
        validation();
    }

    static void enterPassword(){

        cons.printf("Enter password:");

        input = cons.readPassword();

        inputPwd = new String(input);
    }

    static void validation(){

        while(!validPwd){

            if(inputPwd.equals(password)){

                cons.format("Correct password entered.");

                validPwd = true;

            } else {

                remainingAttempts--;

                cons.format("Invalid password. " + remainingAttempts + " attempts remaining.");

                if(remainingAttempts > 0) {

                    enterPassword();

                } else {

                    break;
                }
            }
        }
    }
}
