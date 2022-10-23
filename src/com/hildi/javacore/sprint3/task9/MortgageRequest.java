package com.hildi.javacore.sprint3.task9;

public class MortgageRequest {

    private final String name;
    private final byte age;
    private final int amount;
    private final boolean employed;

    public MortgageRequest(String name, byte age, int amount, boolean employed) {
        this.name = name;
        this.age = age;
        this.amount = amount;
        this.employed = employed;
    }

    public void validate() {
        print("Проверка заявки...");

        boolean result = true;

        AgeValidationRule ageValidationRule = new AgeValidationRule(age);
        if (!ageValidationRule.isValid()) {
            result = false;
            print(ageValidationRule.getErrorMessage());
        }

        MortgageAmountValidationRule amountValidationRule = new MortgageAmountValidationRule(amount);
        if (!amountValidationRule.isValid()) {
            result = false;
            print(amountValidationRule.getErrorMessage());
        }

        EmploymentValidationRule employmentValidationRule = new EmploymentValidationRule(employed);
        if (!employmentValidationRule.isValid()) {
            result = false;
            print(employmentValidationRule.getErrorMessage());
        }

        if (result) {
            print(name + ", вам одобрена заявка на ипотеку!");
        } else {
            print(name + ", ваша заявка отклонена");
        }
    }

    private static <T> void print(T t) {
        System.out.println(t);
    }

}
