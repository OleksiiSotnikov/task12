package task12;

public class SalaryException extends Exception {
    double salary;

    SalaryException(double salary) {
        this.salary = salary;
    }
}