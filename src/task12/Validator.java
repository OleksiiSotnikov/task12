package task12;

public class Validator {
    public static void checkSalary(double salary) throws SalaryException {
        if (salary <= 0) {
            throw new SalaryException(salary);
        }
    }

    public static void checkFio(String input) throws NameException {
        String regex = "[A-z]*";
        if (!input.matches(regex)) {
            throw new NameException(input);
        }
    }
}