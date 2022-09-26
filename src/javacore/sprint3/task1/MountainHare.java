package javacore.sprint3.task1;

public class MountainHare {

    private final Integer age;
    private final Double weight;
    private final Integer jumpLength;
    private static String color;

    public MountainHare(Integer age, Double weight, Integer jumpLength) {
        this.age = age;
        this.weight = weight;
        this.jumpLength = jumpLength;
    }

    public static void setColor(String color) {
        MountainHare.color = color;
    }

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }

}
