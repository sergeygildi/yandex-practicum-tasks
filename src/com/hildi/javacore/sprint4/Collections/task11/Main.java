package com.hildi.javacore.sprint4.Collections.task11;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Main {
    private static final List<String> allPurchases = List.of(
            "яблоки",
            "молоко",
            "колбаса",
            "огурцы",
            "сок",
            "хлеб",
            "виноград",
            "молоко",
            "йогурт",
            "хлеб",
            "пельмени"
    );

    public static void main(String[] args) {
        Set<String> uniquePurchases = findUniquePurchases(allPurchases);
        System.out.println("За месяц было куплено " + uniquePurchases.size() + " уникальных товаров.");
    }

    public static Set<String> findUniquePurchases(List<String> allPurchases) {
        return new HashSet<>(allPurchases);
    }
}
