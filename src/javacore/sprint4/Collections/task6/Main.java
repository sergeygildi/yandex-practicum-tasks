package javacore.sprint4.Collections.task6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static List<String> passengerNames = List.of(
            "Игорь Серов",
            "Василий Петров",
            "Виктория Сотова",
            "Анна Ягирская",
            "Людмила Ульянова"
    );

    public static void main(String[] args) {
        Map<String, Integer> seats = assignSeats(passengerNames);
        System.out.printf("Места пассажиров: %s", seats);
    }

    public static Map<String, Integer> assignSeats(List<String> passengerNames) {
        Map<String, Integer> seats = new HashMap<>();
        int seat = 1;
        for (String passengerName : passengerNames) {
            seats.put(passengerName, seat);
            seat++;
        }
        return seats;
    }

}
