package day08_IfStatement;

public class SingleIfStatementIntro {

    public static void main(String[] args) {

        int number = 300;

        /*
        System.out.println("Odd Number");
        System.out.println("Even Number");
         */

        boolean evenNumber = number % 2 == 0;
        boolean oddNumber = ! evenNumber; // not even number
        if (evenNumber) { // if the condition(evenNumber) is true
            System.out.println(number + " is even number");
        }

        if (oddNumber){ // if the condition(evenNumber) is false
            System.out.println(number + " is odd number");
        }

        System.out.println("----------------------------------------------");

        int n = 200;



        // positive
        if (n > 0){ //if the n is greater than zero, then it's positive
            System.out.println(n + " is positive");
        }

        // negative
        if (n < 0){ //if the n is less than zero, then it's negative
            System.out.println(n + " is negative");
        }

        // zero
        if (n == 0){ //if the n is equal zero, then it's zero
            System.out.println(n + " is zero");
        }

        System.out.println("--------------------------------------------------");



    }
}
