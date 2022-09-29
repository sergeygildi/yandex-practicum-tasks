package javacore.sprint4.task2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int target = random.nextInt(1000) + 1;
        print("Я загадал число. Попробуйте угадать!");

        Scanner s = new Scanner(System.in);
        int userGuess = -1;

        while (target != userGuess) {
            userGuess = s.nextInt();
            if (userGuess < target) {
                print("Ваше число меньше");
            } else if (userGuess > target) {
                print("«Ваше число больше»");
            }
        }
        print("Правильный ответ");
    }

    private static void print(String x) {
        System.out.println(x);
    }
}

