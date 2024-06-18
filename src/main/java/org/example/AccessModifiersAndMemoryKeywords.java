package org.example;

class Person {
    // Access modifiers
    public String name; // Accessible from anywhere
    protected int age;  // Accessible within the same package and subclasses
    String email;       // Default access: Accessible within the same package
    private String ssn; // Accessible only within this class

    // Memory keywords
    public static final String NATIONALITY = "American"; // Constant value shared across all instances

    // Constructor
    public Person(String name, int age, String email, String ssn) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.ssn = ssn;
    }

    // Public method to access private member
    public String getSSN() {
        return ssn;
    }

    // Static method
    public static void printNationality() {
        System.out.println("Nationality: " + NATIONALITY);
    }

    // Protected method
    protected void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
    }
}

public class AccessModifiersAndMemoryKeywords {

    public static void main(String[] args) {
        // Creating an instance of the Person class
        Person person = new Person("John Doe", 30, "john.doe@example.com", "123-45-6789");

        // Accessing public member
        System.out.println("Name: " + person.name);

        // Accessing protected member
        System.out.println("Age: " + person.age);

        // Accessing default (package-private) member
        System.out.println("Email: " + person.email);

        // Accessing private member via public method
        System.out.println("SSN: " + person.getSSN());

        // Calling a static method
        Person.printNationality();

        // Calling a protected method
        person.displayInfo();
    }
}
