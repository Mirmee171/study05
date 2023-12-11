package hello.core.solidSample.s;

public class Car {
    //Single Responsibility Principle, 단일 책임 원칙
    public void start() {
        System.out.println("시동을 겁니다");
    }

    public void stop() {
        System.out.println("차가 멈췄습니다");
    }
}
