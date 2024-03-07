package Solid_Principles;


/*
Clients should not be forced to depend on interfaces they do not use.
    No client should be forced to depend on methods it does not use.
    This principle encourages breaking down large interfaces into smaller,
    more specific ones so that implementing classes don't need to implement
    interfaces they don't use, leading to a cleaner, decoupled design.
*/

//Before applying ISP:

interface Worker {
    void work();
    void eat();
}

class HumanWorker implements Worker {
    public void work() {
        // working
    }
    public void eat() {
        // eating during break
    }
}

class RobotWorker implements Worker {
    public void work() {
        // working much more efficiently
    }
    public void eat() {
        // Robots do not eat, so this method is unnecessary
        throw new UnsupportedOperationException();
    }
}

//After applying ISP:

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class HumanWorker2 implements Workable, Eatable {
    public void work() {
        // working
    }
    public void eat() {
        // eating during break
    }
}

class RobotWorker2 implements Workable {
    public void work() {
        // working much more efficiently
    }
}









public class InterfaceSegregationPrincipleISP {
}
