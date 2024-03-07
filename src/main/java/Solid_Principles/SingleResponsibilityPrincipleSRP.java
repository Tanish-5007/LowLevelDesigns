package Solid_Principles;

/*
    SRP emphasizes that a class should have only one reason to change,
    focusing it on a single functionality.
    Single Responsibility Principle (SRP): A class should have one, and only one,
    reason to change. This means that a class should have a single, well-defined
    responsibility and should not take on additional responsibilities.
*/

/*
    Example Context: A class that handles user information and user data persistence.
    Violating SRP:
*/
class Student{
    private String name;
    private String email;
    private int rollNumber;

    // Methods for managing student data

    // Method for calculating the grade
    public double calculateGrade(int[] marks) {
        // Logic for calculating grade
        return 0;
    }

    // Method for printing student details
    public void printStudentDetails() {
        // Logic for printing student details
    }
}

/*
In this example, the Student class has two responsibilities: managing student data
and calculating grades. To adhere to the SRP, we can separate these responsibilities
into two different classes:
*/

class Student2 {
    private String name;
    private String email;
    private int rollNumber;

    // Methods for managing student data
}

class GradeCalculator {
    public double calculateGrade(int[] marks) {
        // Logic for calculating grade
        return 0;
    }
}


public class SingleResponsibilityPrincipleSRP {
}
