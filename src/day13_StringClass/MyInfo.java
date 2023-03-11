package day13_StringClass;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter your gender: ");
        String gender = input.next();

        input.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your phone number: ");
        Long phoneNumber = input.nextLong();

        input.nextLine();

        System.out.println("Enter your zip code: ");
        int zipCode = input.nextInt();

        input.nextLine();

        System.out.println("Enter your School name: ");
        String schoolName = input.nextLine();

        System.out.println("Enter your city name: ");
        String cityName = input.nextLine();

        System.out.println("Enter your state name: ");
        String stateName = input.next();

        input.nextLine();

        System.out.println("Enter your building number: ");
        int buildingNumber = input.nextInt();

        input.nextLine();

        System.out.println("Enter your Street name: ");
        String streetName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("Address: \n\t" + buildingNumber + " " + streetName + "\n\t " + cityName + "," + stateName + " " + zipCode);
        System.out.println("schoolName = " + schoolName);

        input.close();


    }
}

/*
1. Create a class called MyInfo. Write a program that can ask the user to:
			1. Enter your age ( int --> nextInt() )
			2. Enter your gender (String- One word ONLY --> next())  nextLine()
			3. Enter your full name (String- Multiple words --> nextLine())
			4. Enter your phone number (long --> nextLong())
			5. Enter your zip code (int --> nextInt())   nextLine()
			6. Enter your School name (String- Can be Multiple words --> nextLine())
			7. Enter your city name (String- Can be Multiple words--> nextLine() )
			8. Enter your state name (String- One word ONLY --> next())
			9. Enter your building number (int --> nextInt())  nextLine()
			10. Enter your Street name ( nextLine() )
		MAKE SURE USER CAN ENTER ALL THE INPUT
		Display all the inputs that user entered in following order in sperate lines:
			1. full name
			2. age
			3. gender
			4. phone number
			5. address:
						buildingNumber Street
						City, State ZipCode
			6. school name
 */