/*
Assignment 1.9

Part E
Create a simple class to model a Peach. The class should have one instance variable, price, of type float.

Create a class named, Assignment1_9E.java, which includes the main method. In the main method, instantiate three Peach objects as follows:

• Peach p1 = new Peach(3.40f);
• Peach p2 = new Peach(5.60f);
• Peach p3 = new Peach(3.00f);

In main, determine the number of Peach objects created and the average price of a Peach. Include class variables and class methods in class Peach to help solve the problem.
Save the program as Assignment1_9E.java.
 */
public class Assignment1_9E {

    public static void main (String[] args) {

        Peach p1 = new Peach(3.40F);
        Peach p2 = new Peach(5.60F);
        Peach p3 = new Peach(3.00F);

        System.out.println(Peach.getCount() + " Peach object(s) have been created.");
        System.out.println("The average price of a peach is: " + Peach.getAverageCost());
    }
}
