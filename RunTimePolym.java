class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class RunTimePolym {

    //The makeSound() method is overridden in the Dog and Cat classes.
    //The specific method to be executed is determined at runtime, based on the actual object type of the reference variable.

    public static void main(String[] args) {
        Animal animal1 = new Dog();
        animal1.makeSound(); // Output will be woof

        Animal animal2 = new Cat();
        animal2.makeSound(); // Output will be meow
    }
}
