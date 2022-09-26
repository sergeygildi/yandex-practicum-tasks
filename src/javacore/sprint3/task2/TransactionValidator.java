package javacore.sprint3.task2;

import java.math.BigDecimal;

class TransactionValidator {
    private static final BigDecimal MIN_AMOUNT = BigDecimal.ONE;
    private static final BigDecimal MAX_AMOUNT = new BigDecimal(5000);

    public static boolean isValidAmount(BigDecimal amount) {
        if (amount.compareTo(MIN_AMOUNT) < 0) {
            print("Минимальная сумма перевода: " + MIN_AMOUNT + " грн. Попробуйте ещё раз!");
            return false;
        } else if (amount.compareTo(MAX_AMOUNT) > 0) {
            print("Максимальная сумма перевода: " + MAX_AMOUNT + " грн. Попробуйте ещё раз!");
            return false;
        } else {
            return true;
        }
    }

    public static void print(String s) {
        System.out.println(s);
    }

}
