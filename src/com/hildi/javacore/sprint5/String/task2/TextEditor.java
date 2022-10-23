package com.hildi.javacore.sprint5.String.task2;

public class TextEditor {

    private boolean isCapsLock(String str) {
        if (str.isEmpty() || str.isBlank()) {
            throw new NullPointerException();
        }
        return str.equals(str.toUpperCase());
    }

    public void check(String str) {
        if (isCapsLock(str)) {
            getPrintln(str.toUpperCase());
        } else {
            getPrintln(str.toLowerCase());
        }
    }

    private static void getPrintln(String str) {
        System.out.println(str);
    }
}
