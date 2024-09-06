// Base class
class Animal {
    // Method in the base class
    public void sound() {
        System.out.println("Animals make sounds");
    }
}

// Derived class
class Dog extends Animal {
    // Overriding the method from the base class
    @Override
    public void sound() {
        System.out.println("Dogs bark");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Create an object of the derived class
        Dog dog = new Dog();
        
        // Call the method of the derived class
        dog.sound();  // Output: Dogs bark
        
        // Create an object of the base class
        Animal animal = new Animal();
        
        // Call the method of the base class
        animal.sound();  // Output: Animals make sounds
    }
}
