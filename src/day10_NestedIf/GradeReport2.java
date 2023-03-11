package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {
        int s = 135;


        /*

          if (s >= 0 && s <= 100) { // if the s is valid (0 ~ 100)
            // 5 possibilities. A, B, C, D, F
            if (s >= 90) { // false: s < 90
                result = "Excellent";
            } else if (s >= 80) {// false: s < 80
                result = "Great";
            } else if (s >= 70) {// false: s < 70
                result = "Good";
            } else if (s >= 60) {// false: s < 60
                result = "Passed";
            } else if (s >= 0) {
                result = "Failed";
            }

        } else { // if the s is NOT valid
            result = "Invalid score";
        }
             System.out.println(result);
         */

        /*

        // solution2: use ternaries ONLY
        String result2 = (s >= 0 && s <= 100) ? (s >= 90) ? "Excellent" : (s >= 80) ? "Great"
                : (s >= 70) ? "Good" : (s >= 60) ? "Passed" : "Failed" : "Invalid Score";

        System.out.println(result2);

         */

        System.out.println("----------------------------------------------------------------------");

        // solution3:
        String result3 = "";

        if (s >= 0 && s <= 100) { // if the s is valid (0 ~ 100)
            result3 = (s >= 0 && s <= 100) ? (s >= 90) ? "Excellent" : (s >= 80) ? "Great"
                    : (s >= 70) ? "Good" : (s >= 60) ? "Passed" : "Failed" : "Invalid Score";
        } else { // if the s is NOT valid

            result3 = "Invalid score";
        }

        System.out.println(result3);
    }
}