package day03_EscapeSequences;  //it's Package name of the class

public class Println_VS_Print2 {

    public static void main(String[] args) {   //main method

        System.out.println("Knock Knock");  // First it prints Knock Knock, then appends  a new line
        System.out.println("Who is this?");
        System.out.println("This is Java");

        System.out.println("---------------------------------------------------");

        System.out.print("Knock Knock");// First it prints Knock Knock, then not appends new line
        System.out.print("Who is this?");
        System.out.print("This is Java");

        System.out.println();
        System.out.println("------------------------------------------");
        System.out.println("Hello everyone? how are you all today? Today we will learn Escape sequence");

        System.out.println("--------------------------------------------------");

        System.out.print("Hello everyone? how are you all today?");
        System.out.print("Today we will learn Escape sequence");
        System.out.print(", and next week we will learn Variables");


    }

}
// Single Line Commend goes here
/*
Topics:
    println method
    print method
    comments
 */
