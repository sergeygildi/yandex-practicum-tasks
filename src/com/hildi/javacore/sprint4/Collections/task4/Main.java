package com.hildi.javacore.sprint4.Collections.task4;

public class Main {
    public static void main(String[] args) {
        RentedFilm film = new RentedFilm(
                "Терминатор",
                new DateTime(20, 11, 2021, 10, 0, 0),
                new DateTime(27, 11, 2021, 23, 58, 58)
        );
        print("Фильм Терминатор взят в аренду: " + film.getTimeOfRent());
        print("Фильм должен быть вернут до: " + film.getTimeOfReturn());

        DateTime today = new DateTime(27, 11, 2021, 23, 58, 59);

        print("Сегодняшнее число: " + today);

        DateTimeComparator comparator = new DateTimeComparator();
        boolean shouldAlreadyBeReturned = comparator.compare(today, film.getTimeOfReturn()) > 0;

        print("Прошло ли время возврата? " + (shouldAlreadyBeReturned ? "Да!" : "Нет!"));
    }

    private static void print(String film) {
        System.out.println(film);
    }

}
