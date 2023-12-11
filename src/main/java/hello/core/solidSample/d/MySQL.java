package hello.core.solidSample.d;

public class MySQL implements Database {
    @Override
    public void save(String data) {
        System.out.println(data + "를 저장합니다");
    }
}
