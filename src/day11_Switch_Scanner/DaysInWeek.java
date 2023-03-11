package day11_Switch_Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        int cookies = 10;
        String day="tuesday";
        /*
        if (number==1){
            System.out.println("Monday");
        }

         */

        // <= >= ... You can NOT use in the switch statement
        switch (day) { //1,2,3,4,5,6,7  eşit ise;

            case "sunday": // It MUST be unique
                cookies++; // exits the switch after executing the case block
            case "monday": // It MUST be unique
                cookies +=5;
                break;// exits the switch after executing the case block
            case "tuesday": // It MUST be unique
                // exits the switch after executing the case block
            case "wednesday": // It MUST be unique
                cookies +=10; // exits the switch after executing the case block
            case "thursday": // It MUST be unique
                cookies +=5;
                break; // exits the switch after executing the case block
            case "Friday": // It MUST be unique
                break; // exits the switch after executing the case block
            case "saturday": // It MUST be unique
                cookies--;
                break; // exits the switch after executing the case block
            default: // only gets executed if none of the case blocks are matching
                cookies =0;
        }

        System.out.println(cookies);

    }
}
