package day15_ForLoop;

public class FormatFullName {

    public static void main(String[] args) {
        String firstName = "cyDEo",
        lastName = "SCHOOL",
                fullName = "";


        // firstName = firstName.substring(0, 1).toUpperCase() +firstName.substring(1).toLowerCase();
                //C           +     ydeo    ==> "Cydeo"
        firstName = ("" + firstName.charAt(0) ).toUpperCase() + firstName.substring(1).toLowerCase();
                //      "C"


        //lastName = lastName.substring(0, 1) + lastName.substring(1).toLowerCase();
        lastName = ("" + lastName.charAt(0) ) + lastName.substring(1).toLowerCase();

        fullName = firstName + " " + lastName;

        System.out.println(fullName);

    }
}
