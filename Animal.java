

public class Animal {
    // Static variable to track number of animals created
    static int numOfAnimals = 0;

    // Constructor increments the count each time a new object is created
    public Animal() {
        numOfAnimals++;
    }

    // Method to display the number of animals created
    public static void displayAnimalCount() {
        System.out.println("Current number of animal objects: " + numOfAnimals);
    }
}

 class Cat extends Animal {
    // Cat-specific attributes
    String name;

    // Constructor that calls the superclass constructor
    public Cat(String name) {
        super();  // Calls the constructor of Animal (increments numOfAnimals)
        this.name = name;
        System.out.println("A new cat named " + name + " has been created.");
        Animal.displayAnimalCount();  // Display current count of animals
    }

    // Method specific to Cat (optional)
    public void meow() {
        System.out.println(name + " says meow!");
    }
}


class Dog extends Animal {
    // Dog-specific attributes
    String name;

    // Constructor that calls the superclass constructor
    public Dog(String name) {
        super();  // Calls the constructor of Animal (increments numOfAnimals)
        this.name = name;
        System.out.println("A new dog named " + name + " has been created.");
        Animal.displayAnimalCount();  // Display current count of animals
    }

    // Method specific to Dog (optional)
    public void bark() {
        System.out.println(name + " says woof!");
    }
}


 class Driver {
    public static void main(String[] args) {
        // Create new Cat and Dog objects
        Cat cat1 = new Cat("Whiskers");
        Dog dog1 = new Dog("Rex");
        Cat cat2 = new Cat("Luna");
        Dog dog2 = new Dog("Max");

        // You can call displayAnimalCount at any point to see the current count
        Animal.displayAnimalCount();
    }
}
