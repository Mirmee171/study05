package hello.core.extendsEncapsulationSample;

public class ExtendsSample {
    public static void main(String[] args) {
        People people = new Student(100, 50, 70);
        people.setAge(20);
        people.setName("name");
        people.printMyself();
    }
}
