package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 50,
                b = 80,
                c = 40;
        // if we have three different numbers, one MUST maximum, one Must be minimum and one MUST be Median

        /*
        //yine de sor emin olmak için

        if(a < b && a> c){
        System.out.println(a + " is the median number");
        }

        if(b < a && b > c){
        System.out.println(a + " is the median number");
        }

        if(c < a && c> b){
        System.out.println(a + " is the median number");
        }
         */

        /*
        // yine de sor emin olmak için
    boolean aIsMedian = ((b + c) / 2) == a;
    boolean bIsMedian = ((a + c) / 2) == b;
    boolean cIsMedian = ((a + b) / 2) == c;

        if (aIsMedian) {
                System.out.println(a + " is the median number");
                }

                if (bIsMedian){
                System.out.println(b + " is the median number");
                }

                if (cIsMedian) {
                System.out.println(c + " is the median number");
                }
*/

        //              a= 15, b = 10 c = 20    a = 15, c = 10, b = 20
        boolean aIsmedian = (a > b && a < c) || (a > c && a < b);
            /*
            in order for a to be the median number:
                    1. if c is the maximum number & b is the minimum number, then a is the median number
                    2. if b is the maximum number & c is the minimum number, then a is the median number
             */


        //              b = 15, a =10, c = 20   b = 15, a = 20, c = 10
        boolean bIsMedian = (b > a && b < c) || (b < a && b > c);
            /*
            in order for b to be the median number:
                    1. if c is the maximum number & a is the minimum number, then b is the median number
                    2. if a is the maximum number & c is the minimum number, then b is the median number
             */


        boolean cIsMedian = !aIsmedian && !bIsMedian;
            /*
            in order for c to be the median number:
                    1. if a is the Median number & b is the Median number, then c is the Median number
             */


        if (aIsmedian) { // if a is the median number
            System.out.println(a + " is the median number");
        }

        if (bIsMedian) { // if b is the median number
            System.out.println(b + " is the median number");
        }

        if (cIsMedian) { // if c is the median number
            System.out.println(c + " is the median number");
        }


    }
}

/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number

 */