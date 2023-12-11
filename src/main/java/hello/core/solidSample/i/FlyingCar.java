package hello.core.solidSample.i;

public class FlyingCar implements Car, Airplane {
    //Interface Segregation Principle, 인터페이스 분리 원칙

    @Override
    public void fly() {
        System.out.println("날았습니다");
    }

    @Override
    public void drive() {
        System.out.println("운전합니다");
    }
}
