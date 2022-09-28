package javacore.sprint3.task9;


/**
 * Класс для проверки трудоустроен ли пользователь
 */
public class EmploymentValidationRule extends ValidationRule<Boolean> {

    public EmploymentValidationRule(Boolean value) {
        super(value, "Ипотека выдается только трудоустроенным");
    }

    @Override
    public boolean isValid() {
        return value;
    }
}
