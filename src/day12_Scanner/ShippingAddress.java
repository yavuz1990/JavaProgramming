package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//Enter

        System.out.println("Enter your fuull name:  ");
        String fullName = scan.nextLine();  //Java ProgrammingEnter

        System.out.println("Enter your building number: ");
        String building = scan.next();//7925A

        scan.nextLine();//Enter

        System.out.println("Enter your Street name: ");
        String streetName = scan.nextLine(); //Jones Branch DriveEnter

        System.out.println("Enter your city name: ");
        String cityName = scan.nextLine(); // McLeanEnter

        System.out.println("Enter your state: ");
        String state = scan.nextLine(); //VA

        System.out.println("Enter your zip code: ");
        String zipCode = scan.next(); //22012Enter

        scan.nextLine();

        System.out.println("Enter your country name: ");
        String country = scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("building = " + building);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
        System.out.println("country = " + country);

        scan.close();

    }
}

/*
1. Enter your full name ( nextLine() )
2. Enter your building number ( next() )
3. Enter your Street name ( nextLine() )
4. Enter your city name ( nextLine() )
5. Enter your state ( nextLine() )
6. Enter your zip code ( next() )
Display the shipping address
John Smith
7925 Jones Branch Dr
McLean, VA 22012
 */