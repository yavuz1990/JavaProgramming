package day08_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Josh";
        String citizen = "USA";
        int age = 38;

        boolean isEligible = age >= 21 && citizen == "USA"; // true

        //Eligible
        if (isEligible){ // True
            System.out.println("Eligible");
        }

        //Not Eligible
        if (!isEligible){ // !True ==> not True ==> False
            System.out.println("Not Eligible");
        }

    }
}
