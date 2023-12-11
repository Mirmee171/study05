package hello.core.extendsEncapsulationSample;

public class People {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printMyself() {
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}
