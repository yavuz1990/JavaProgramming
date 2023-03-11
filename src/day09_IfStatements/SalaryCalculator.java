package day09_IfStatements;

public class SalaryCalculator {

    public static void main(String[] args) {
        double salary = 75_000;
        boolean isMarried = true;

        double taxRate = 0;

        if (salary >= 130_000) {
            taxRate = 0.35;
        } else if (salary >= 100_000) {
            taxRate = 0.30;
        } else if (salary >= 80_000) {
            taxRate = 0.25;
        } else {
            taxRate = 0.20;
        }

        if (isMarried) {
            taxRate -= 0.05;
        }

        double salaryAfterTax = salary - (salary * taxRate);

        System.out.println("Salary aAfter Tax = " + salaryAfterTax);
    }

    /*
    2. Write a program that can calculate the salary after tax based on the following requirements
                    the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 130K (excluded)
                        25% for salary of 80K to 100K (excluded)
                        20% for salary less than 80K

                    in addition, if the person is married, he/she will pay 5% less tax
     */
}
