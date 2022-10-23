package com.hildi.javacore.sprint3.task7;

public class Main {
    public static void main(String[] args) {
        print("2 + 3 = " + Appender.add(2, 3));
        print("9.4 + 1.2 = " + Appender.add(9.4, 1.2));
        print("Кофе + машина = " + Appender.add("Кофе", "машина"));
        print("true + false = " + Appender.add(true, false));
    }

    private static <T> void print(T t) {
        System.out.println(t);
    }

}

class Appender {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + b;
    }

    public static boolean add(boolean a, boolean b) {
        return a || b;
    }

}