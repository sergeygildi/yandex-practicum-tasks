package javacore.sprint3.task1;

import java.util.List;

public class Forest {
    private final List<MountainHare> hares;

    public Forest(List<MountainHare> hares) {
        this.hares = hares;
    }

    public static void setSeason(String newSeason) {
        if (newSeason.equals("зима")) {
            MountainHare.setColor("белый");
        } else if (newSeason.equals("лето")) {
            MountainHare.setColor("серо-рыжий");
        }
    }

    public void printHares() {
        for (MountainHare hare : hares) {
            System.out.println(hare);
        }
    }

}
