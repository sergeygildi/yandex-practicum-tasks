package javacore.sprint3.task1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<MountainHare> hares = List.of(
                new MountainHare(4, 4.4, 120),
                new MountainHare(7, 3.6, 150),
                new MountainHare(1, 2.3, 100)
        );

        Forest summerForest = new Forest(hares);
        print("В лесу лето!");

        Forest.setSeason("лето");
        print("Список зайцев:");
        summerForest.printHares();

        print("В лесу зима!");
        print("Список зайцев:");
        Forest.setSeason("зима");

        summerForest.printHares();
    }

    private static void print(String s) {
        System.out.println(s);
    }

}