package hello.core.interfaceSample;

public class Dog implements Animal {
    @Override
    public void move() {
        System.out.println("찹찹찹찹");
    }

    @Override
    public void bark() {
        System.out.println("멍멍!");
    }
}
