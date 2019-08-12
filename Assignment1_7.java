/*
Assignment 1.7
Create a class named Balloon. It should contain the following:
• An instance variable named, pressure (of type float). Assign it a value of 100.56. Use public as the access modifier.
• An instance initializer block, in which the value of the instance variable is assigned a value of 200.56.
• A no-argument constructor, in which the value of the instance variable is assigned a value of 300.56.
Create a separate class named, Assignment1_7. This class should contain the main method. Instantiate a Balloon object, and use the object reference created to access the instance variable, pressure. What value to you expect to see displayed in the console?
• 100.56
• 200.56
• 300.56
 */
public class Assignment1_7 {

    public static void main(String[] args) {

        Balloon b = new Balloon();
        System.out.println("pressure= " + b.pressure);
    }
}
