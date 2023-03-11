package day08_IfStatement;

public class SwapTwoVariables_WithTemporaryVariable {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;
//---------------------------------------------
        int c = b;// c = 15 //Temporary Variable
        b = a; //b = 10
        a = c; //a = 15

//----------------------------------------------

        System.out.println("a = " + a);// 15
        System.out.println("b = " + b);// 10


    }
}

/*
1. Write a program that can swipe two variables' value by using a temporary variable

            Ex:
                if a = 10, b = 15;
            Output:
                a = 15;
 */