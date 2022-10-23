package com.hildi.javacore.sprint4.Collections.task7;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private final Map<String, Integer> orders = new HashMap<>();

    public static void main(String[] args) {
        Main pizzeria = new Main();
        pizzeria.openPizzeria();
        pizzeria.printStatistics();
    }

    private void openPizzeria() {
        newOrder("Донателло");
        newOrder("Леонардо");
        newOrder("Рафаэль");
        newOrder("Микеланджело");
        newOrder("Леонардо");
        newOrder("Донателло");
        newOrder("Шреддер");
    }

    private void newOrder(String clientName) {
        int count = orders.getOrDefault(clientName, 0);
        orders.put(clientName, ++count);
    }

    private void printStatistics() {
        int sum = 0;
        for (Map.Entry<String, Integer> order : orders.entrySet()) {
            print("Заказов от " + order.getKey() + ": " + order.getValue());
            sum += order.getValue();
        }
        print("Всего заказов: " + sum);
    }

    private static void print(String order) {
        System.out.println(order);
    }
}

