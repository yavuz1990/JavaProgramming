package day10_NestedIf;

public class IfStatementsWithoutCurlyBraces {
    // pre condition: if there is only one statement in the block
    public static void main(String[] args) {
        int number = 1;
        String result = ""; // temporary

        if (number == 1) { // hello yazdırıp sonra hangi ay olduğunu yazdırmak istiyorsan curly braces kullanmak zorundasın.
            result = "January";
            System.out.println("hello");
        } else if (number == 2)
            result = "February";
        else if (number == 3)
            result = "March";
        else if (number == 4)
            result = "April";
        else if (number == 5)
            result = "June";
        else if (number == 6)
            result = "July";
        else if (number == 7)
            result = "August";
        else if (number == 8)
            result = "September";
        else if (number == 9)
            result = "October";
        else if (number == 10)
            result = "November";
        else
            result = "December";


        System.out.println(result);

    }
}
