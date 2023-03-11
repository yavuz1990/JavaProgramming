package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Yavuz";
        String lastName = "HUYUK";
        int age = 32;
        String jobTitle = "Pilot";
        String companyName = "Airfly";
        double salary = 100_000.58;

        String fullName = firstName + " " + lastName;

        // Full name of the person is .....
        System.out.println("Full name of the person is " + fullName + ".");

        // .... is ..... years old
        System.out.println(fullName + " is " + age + " years old.");

        // fullName is jobTittle, works at companyName, fullname' salary is salary
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName + ", " + fullName + "' salary is $" + salary + ".");

    }
}
