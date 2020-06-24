package com.company;

public class Main {
    public static String staticName = "This is static name";
    public String nonStaticName = "This is non static variable";

    public static void main(String[] args) {

        // static method ( main is static ) can access static variable directly
        System.out.println(staticName); // This is static name
        System.out.println(nonStaticName); // non-static variable cannot be from static method but:

        Main m = new Main();
        System.out.println(m.nonStaticName); // This is non static variable

        // Invoking nonstatic method
        m.nonStaticMethod(); // his is non static variable, means non static method can access to non static variable because non static variable is instance variable which is available in each instance of class

        // now let's invoke static variable from non static method
        m.nonStaticMethod2();  // This is static name
    }

    // now let's call both from non static method:
    public void nonStaticMethod() {
        System.out.println(nonStaticName);
    }

    public void nonStaticMethod2() {
        System.out.println(staticName);
    }
}
