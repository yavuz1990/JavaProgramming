package day10_NestedIf;

public class NameOfMonth2 {

    public static void main(String[] args) {
        int number = 5;


        /*
           if (number == 1) {
                result = "January";
            } else if (number == 2) {
                result = "February";
            } else if (number == 3) {
                result = "March";
            } else if (number == 4) {
                result = "April";
            }else if (number == 5) {
                result = "May";
            } else if (number == 6) {
                result = "June";
            } else if (number == 7) {
                result = "July";
            } else if (number == 8) {
                result = "August";
            } else if (number == 9) {
                result = "September";
            } else if (number == 10) {
                result = "October";
            } else if (number == 11) {
                result = "November";
            } else  {
                result = "December";
            }
         */


        String name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March"
                : (number == 4) ? "April" : (number == 5) ? "May" : (number == 6) ? "June"
                : (number == 7) ? "July" : (number == 8) ? "August" : (number == 9) ? "September"
                : (number == 10) ? "October" : (number == 11) ? "November" : "December";

        System.out.println(name);
    }
}
