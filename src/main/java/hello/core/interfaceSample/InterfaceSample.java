package hello.core.interfaceSample;

public class InterfaceSample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.move();
        dog.bark();

        cat.move();
        cat.bark();
    }
}
