package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {

        // age: 38 years old
        byte age = 38;

        // weight : 160 pounds
        // byte weight = 160; // 160 is out of byte range
        // byte num = -129;// -129 is out of byte range
        short weight = 160;

        // salary : 100000 $
        // short salary = 100000;// 100000 is out of byte range
        int salary = 100000;// int is the preferred data type for integer numbers

        long asset = 3_333_333_333L;

        // taname : = 0.26
        float taname = 0.26F;

        double PI = 3.14;


        // #
        char ch1 = '#';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

        char gender = 'F';
        System.out.println("gender = " + gender);

        char grade = 'F';
        System.out.println("grade = " + grade);

        char YesNo = 'Y';
        System.out.println("YesNo = " + YesNo);

        //char ch5 = 'AB'; doğru değil hata verir iki karakter var 'AB'.


        boolean isEmployeed = true;
        boolean isMarried = false;

        boolean result = 100 > 300;

        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        String city = "Mclean";
        String state = "Virginia";
        String country = "USA";

        //String name = "Selim";

        System.out.println("name = " + name);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("country = " + country);

        String first_name$ = "Yavuz";// doğru
        int num1 =100;// doğru
        int num2 = 200;// doğru

        //int private = 300;

        double salaryAfterTaname = 2.5;
        //int salaryAfterTaname = 3.5;


    }
}
