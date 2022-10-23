package com.hildi.javacore.sprint3.task9;


/**
 *  Класс для проверки суммы ипотеки пользователя
 */
public class MortgageAmountValidationRule extends ValidationRule<Integer> {

    public MortgageAmountValidationRule(Integer value) {
        super(value, "Минимальный размер ипотеки - 1.000.000, а максимальный - 10.000.000");
    }

    @Override
    public boolean isValid() {
        return (value >= 1_000_000 && value <= 10_000_000);
    }

}
