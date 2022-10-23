package com.hildi.javacore.sprint3.task2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TransactionValidator.print("Пожалуйста, введите сумму перевода в рублях.");
        BigDecimal amount = scanner.nextBigDecimal();

        boolean isValid = TransactionValidator.isValidAmount(amount); // добавьте вызов метод isValidAmount
        if (isValid)
            TransactionValidator.print("Спасибо! Ваш перевод на сумму " + amount + " грн. успешно выполнен.");
    }

}
