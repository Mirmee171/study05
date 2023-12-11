package hello.core.solidSample.d;

public interface Database {
    //Dependency Inversion Principle, 의존 역전 원칙
    void save(String data);
}
