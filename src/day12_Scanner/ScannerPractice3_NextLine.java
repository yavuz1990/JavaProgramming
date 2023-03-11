package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        // 123Enter
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine(); // Wooden SpoonEnter

        System.out.println("Enter your Programming Language: ");
        String programming = input.nextLine();//Java Programming LanguageEnter

        System.out.println("Enter your age: ");
        int age = input.nextInt(); // 24

        input.nextLine(); // Capture the Enter key that user pressed for nextInt()  // Buraya kadar olanı memory e alır. Bunu  yapmazsan SchoolName i print etmez, ve School name i keyboard dan yazamazsın.

        System.out.println("Enter your school name: ");
        String scchoolName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("scchoolName = " + scchoolName);

        input.close();


    }
}
