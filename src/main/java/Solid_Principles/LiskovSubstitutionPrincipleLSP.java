package Solid_Principles;


/*
Subtypes must be substitutable for their base types without altering the
correctness of the program.
    Objects of a superclass should be replaceable with objects of a subclass without
    affecting the correctness of the program. This principle ensures that a subclass
    can stand in for its superclass without any issues in functionality or behavior.
*/

// Before applying LSP:

class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Duck extends Bird {}

class Ostrich extends Bird {
    // Ostrich cannot fly but it's forced to implement fly method
    public void fly() {
        throw new UnsupportedOperationException();
    }
}

// After applying LSP:

class Bird2 {}

class FlyingBird extends Bird2 {
    public void fly() {
        System.out.println("Bird is flying");
    }
}

class Duck2 extends FlyingBird {}

class Ostrich2 extends Bird2 {
    // Ostrich no longer needs to implement flying behavior
}









public class LiskovSubstitutionPrincipleLSP {
}
