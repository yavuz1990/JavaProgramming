package day10_NestedIf;

public class FieldTrip {

    public static void main(String[] args) {
        int grade = 2;
        String location = "";
        int groupNumber = 0;
        String teacher = "";

        /*
         if (grade >= 1 && grade <= 6) {

            if (grade == 1) {
                System.out.println("location -  Apple orchard");
                System.out.println("number of groups - 3");
                System.out.println("teacher in charge - Ms. Smith");
            } else if (grade == 2) {
                System.out.println("location - Zoo");
                System.out.println("number of groups - 7");
                System.out.println("teacher in charge - Mr. Lee");
            } else if (grade == 3) {
                System.out.println("location - Aquarium");
                System.out.println("number of groups - 5");
                System.out.println("teacher in charge - Ms. Wilson");
            } else if (grade == 4) {
                System.out.println(" location - Movie theater ");
                System.out.println("number of groups - 2");
                System.out.println("teacher in charge - Ms. Reyes");
            } else if (grade == 5) {
                System.out.println("location - Museum ");
                System.out.println("number of groups - 5");
                System.out.println("teacher in charge - Ms. Lela ");
            } else if (grade == 6) {
                System.out.println("location - Six Flags");
                System.out.println("number of groups - 8");
                System.out.println("teacher in charge - Mr. Watt");
            }

        } else {
            System.out.println("Invalid Grade");
        }
         */

        if (grade >= 1 && grade <= 6) {

            if (grade == 1) {
                location = "Apple orchard";
                groupNumber = 3;
                teacher = "Ms. Smith";
            } else if (grade == 2) {
                location = "Zoo";
                groupNumber = 7;
                teacher = "Mr. Lee";
            } else if (grade == 3) {
                location = "Aquarium";
                groupNumber = 5;
                teacher = "Ms. Wilson";
            } else if (grade == 4) {
                location = "Movie theater ";
                groupNumber = 2;
                teacher = "Ms. Reyes";
            } else if (grade == 5) {
                location = "Museum ";
                groupNumber = 5;
                teacher = "Ms. Lela ";
            } else if (grade == 6) {
                location = "Six Flags";
                groupNumber = 8;
                teacher = "Mr. Watt";
            }
        } else {
            System.out.println("Invalid Grade");
        }

        System.out.println("location - " + location + "\nnumber of groups - " + groupNumber + "\nteacher in charge - " + teacher);

    }
}
