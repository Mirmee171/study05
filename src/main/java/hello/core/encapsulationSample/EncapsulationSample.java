package hello.core.encapsulationSample;

public class EncapsulationSample {
    public static void main(String[] args) {
        Member cap = new Member();

        cap.setId(123);
        cap.setName("memberA");

        System.out.println(cap.getId());
        System.out.println(cap.getName());
    }
}
