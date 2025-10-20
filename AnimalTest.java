class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog → Bark");
    }
}


class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat → Meow");
    }
}
public class AnimalTest {
    public static void main(String[] args) {
        // Objects of subclasses
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Sample Output
        dog.makeSound();
        cat.makeSound();
    }
}
