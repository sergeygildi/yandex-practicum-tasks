package javacore.sprint3.task2;

import java.math.BigDecimal;
import java.util.Scanner;

import static javacore.sprint3.task2.TransactionValidator.print;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        print("Пожалуйста, введите сумму перевода в рублях.");
        BigDecimal amount = scanner.nextBigDecimal();

        boolean isValid = TransactionValidator.isValidAmount(amount); // добавьте вызов метод isValidAmount
        if (isValid)
            print("Спасибо! Ваш перевод на сумму " + amount + " грн. успешно выполнен.");
    }

}
