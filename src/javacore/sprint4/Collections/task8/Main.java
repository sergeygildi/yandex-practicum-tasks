package javacore.sprint4.Collections.task8;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Comparator<Car> carComparator = Comparator.comparingInt(car -> car.priceInRubles);
        Map<Car, Integer> cars = new TreeMap<>(carComparator);

        cars.put(new Car("Honda CR-V ", 2_500_000), 3);
        cars.put(new Car("Audi A6", 3_760_000), 2);
        cars.put(new Car("Volkswagen Tiguan", 1_935_000), 5);
        cars.put(new Car("KIA Cerato", 1_300_000), 8);

        for (Car car : cars.keySet()) {
            System.out.println(car);
        }
    }
}

class Car {
    String model;
    Integer priceInRubles;

    public Car(String model, Integer priceInRubles) {
        this.model = model;
        this.priceInRubles = priceInRubles;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return model.equals(car.model);
    }

    public int hashCode() {
        return model.hashCode();
    }

    public String toString() {
        return "Car{model=" + model + ", priceInRubles=" + priceInRubles + "}";
    }
}
