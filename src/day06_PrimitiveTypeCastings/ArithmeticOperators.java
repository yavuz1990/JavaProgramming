package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println("12" + 1);//121
        System.out.println(100 + 50);// 150 addition
        System.out.println(100 - 50);//50 substraction
        System.out.println(10 * 6);//50 multiplication

        System.out.println(100 / 3);// integer result : 33
        System.out.println(100.0 / 3);// decimal result : 33.333333333333336
        System.out.println((double)100 / 3);// decimal result : 33.333333333333336
        System.out.println(10 / 4.0);//decimal result : 2.5
        System.out.println(10d / 4);//decimal result : 2.5

        int a = 100;
        double b = a/6;// decimal result : 16.0
        //double b = a/6d;// decimal result : 16.666666666666668
        //double b = a/6.0;// decimal result : 16.666666666666668
        //double b = (double)a/6;// decimal result : 16.666666666666668
        System.out.println(b);

        System.out.println(100D);// 100.0


    }
}

/*
    + : Addition
    - : Substraction
    * : Multiplication
    / : Division

            integer / integer ==> integer
            integer / decimal ==> decimal
            decimal / integer ==> decimal
            decimal / decimal ==> decimal

        in Math:
            10/2 = 4.5
        in Java:
            10/2 = 2
            10.0/2 = 2.5
 */