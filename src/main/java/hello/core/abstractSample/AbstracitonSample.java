package hello.core.abstractSample;

import java.util.Arrays;
import java.util.List;

public class AbstracitonSample {
    public static void main(String[] args) {
        final List<Car> cars = Arrays.asList(new SuperCar(), new SnowCar(), new FastCar());
        for (final Car car : cars) {
            car.move();
        }
    }
}
