/*
Assignment 1.5

Create a class named, ClassA. The class should be stored in a package, named packageA. The class should be able to track
and return, the number of objects instantiated of its type (how many ClassA objects have been created).

Create another class named, ClassB. The class should be stored in a package, named packageB. The class should be able to
track and return, the number of objects instantiated of its type (how many ClassB objects have been created).

Finally, create a class named, Assignment1_5. This class should contain the main method. In main:

 • Create two ClassA objects and one ClassB object.
 • Display the number of ClassA and ClassB objects created, in the console.

Compile and run the program from the command prompt (cmd).
 */

import packageA.ClassA;
import packageB.ClassB;

public class Assignment1_5 {

    public static void main(String[] args) {

        ClassA a1 = new ClassA();
        ClassA a2 = new ClassA();
        ClassB b1 = new ClassB();

        System.out.println(ClassA.getCount() + " ClassA object(s) created.");
        System.out.println(ClassB.getCount() + " ClassB object(s) created.");

    }
}
