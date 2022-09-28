package javacore.sprint3.task9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        print("Заполните данные для ипотечной заявки и узнайте статус одобрения");
        print("Введите ФИО:");
        String name = scanner.nextLine();

        print("Ваш возраст:");
        byte age = scanner.nextByte();

        print("Планируемая сумма ипотеки:");
        int mortgageAmount = scanner.nextInt();
        scanner.nextLine();
        print("Трудоустроены ли вы сейчас?");
        boolean employed = scanner.nextBoolean();

        MortgageRequest mortgageRequest = new MortgageRequest(name, age, mortgageAmount, employed);
        mortgageRequest.validate();
    }

    private static void print(String x) {
        System.out.println(x);
    }

}
