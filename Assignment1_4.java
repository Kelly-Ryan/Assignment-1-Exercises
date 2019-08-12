/*
Assignment 1.4

In this program, you are asked to create a simple desktop calculator. The program should be compiled and run from the command prompt (cmd).

• Create a class named Calculator, to be stored in a package named, com.javadevelopers.code.

• The class should have the following instance variables.

    o private float no1;
    o private float no2;
    o private String operator;

• Accessor (‘setter and getter’) methods should be created to allow the instance variables to be set and retrieved.

• Create a method named, performCalculation(), which performs the appropriate calculation (addition, subtraction,
multiplication, division and modulus) and returns the result.

    o Create a class named, Assignment1_4.java, which contains the main method.

    o Use a Scanner object to prompt the user to enter two operands and an operator.

    o The user must not be allowed to enter invalid data. For example, the operands must be numeric and the operator must be
     one of the following (+,-,*,/,%). For each data input, the program should not proceed, until the user has entered valid data.

o Finally, class Assignment1_4 should use the Calculator class, to perform the calculation, and display the result.

 */
import com.javadevelopers.code.Calculator;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Assignment1_4 {

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);
        boolean validOp = false;
        boolean validNum1 = false;
        boolean validNum2 = false;

        ArrayList<String> operands = new ArrayList<String>(5);
        operands.add("+");
        operands.add("-");
        operands.add("*");
        operands.add("/");
        operands.add("%");

        //Input first operand and validate
        while(!validNum1) {
            try{

                System.out.println("Enter the first number: ");
                calc.setNo1(input.nextFloat());
                validNum1 = true;

            } catch (InputMismatchException e) {

                System.out.println("Numbers must be numeric!");
                input.nextLine();
            }
        }

        //Input operator and validate
        while(!validOp){

            System.out.println("Enter the operator + - * / %: ");
            String s = input.next();

            if(operands.contains(s)){
                calc.setOperator(s);
                validOp = true;

            } else {

                System.out.println("Invalid operator!");
                //input.nextLine();
            }
        }

        //Input second operand and validate
        while(!validNum2){

            try{

                System.out.println("Enter the second number: ");
                calc.setNo2(input.nextFloat());
                validNum2 = true;

            } catch (InputMismatchException e) {

                System.out.println("Numbers must be numeric!");
                input.nextLine();
            }
        }

        //perform calculation on validated operands and operator
        System.out.println("Result: " + calc.performCalculation());
    }
}
