package hello.core.polymorphismSample;

public class YoonMi implements Person{
    @Override
    public void eat() {
        System.out.println("빵을 먹는다.");
    }

    @Override
    public void sleep() {
        System.out.println("8시간 잔다.");
    }
}
