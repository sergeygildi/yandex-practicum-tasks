package com.hildi.javacore.sprint3.task8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<MediaItem> mediaItems = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int command = scanner.nextInt();

            if (command == 1) {
                print("Введите название фильма:");
                String title = scanner.next();
                print("Введите длительность фильма в минутах:");
                int runtime = scanner.nextInt();

                Movie movie = new Movie(title, runtime);
                mediaItems.add(movie);
            } else if (command == 2) {
                print("Введите название сериала:");
                String title = scanner.next();
                print("Введите количество серий:");
                int seriesCount = scanner.nextInt();
                print("Введите среднюю длительность серии в минутах");
                int runtime = scanner.nextInt();

                // Создайте сериал и добавьте его в список просмотренных
                Series serial = new Series(title, runtime, seriesCount);
                mediaItems.add(serial);
            } else if (command == 0) {
                printMediaItemsList(mediaItems);
                double totalRuntime = Calculator.calculate(mediaItems);
                print("Всего вы потратили на просмотр фильмов и сериалов, в днях: " + totalRuntime);
                break;
            }
        }

    }

    private static <T> void print(T t) {
        System.out.println(t);
    }

    public static void printMenu() {
        print("1 - Добавить фильм");
        print("2 - Добавить сериал");
        print("0 - Посчитать суммарное время и выйти");
    }

    public static void printMediaItemsList(List<MediaItem> mediaItems) {
        print("Вы посмотрели фильмов и сериалов: " + mediaItems.size());

        for (MediaItem mediaItem : mediaItems) {
            print(mediaItem.getTitle());
        }
    }

}
