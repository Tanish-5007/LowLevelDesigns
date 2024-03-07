package Solid_Principles;


/*
High-level modules should not depend on low-level modules. Both should depend on abstractions.
    High-level modules should not depend on low-level modules, but both should depend
    on abstractions. Additionally, abstractions should not depend on details, but details
    should depend on abstractions. This principle aims to reduce the direct dependencies
    between different parts of the code to increase modularity and flexibility.
*/

/*
    By adhering to these principles, developers can create systems that are easier to
    maintain, scale, and understand. These principles help manage dependencies,
    reduce coupling, and ultimately lead to more robust and scalable software architecture.
*/

// Before applying DIP:

class DatabaseRepository {
    public void saveUser(String user) {
        // Logic for saving user to database
    }
}

class UserService {
    private final DatabaseRepository repository;

    public UserService() {
        this.repository = new DatabaseRepository();
    }

    public void registerUser(String user) {
        repository.saveUser(user);
        // Additional logic for user registration
    }
}

// After applying DIP:

interface UserRepository{
    void saveUser(String user);
}

class DatabaseRepository2 implements UserRepository{
    @Override
    public void saveUser(String user) {
        // write the logic to save user.
    }
}

class UserService2{
    private final UserRepository repository;

    public UserService2(UserRepository repository) {
        this.repository = repository;
    }

    public void registerUser(String user) {
        repository.saveUser(user);
        // Additional logic for user registration
    }
}















public class DependencyInversionPrincipleDIP {
}
