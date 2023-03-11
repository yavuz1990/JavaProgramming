package day14_String;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "    2  batch 25    ";

        str1 = str1.trim(); //"2 batch 25"
        System.out.println(str1);

        System.out.println("----------------------------------");

        String str2 = "Cydeo School";

        int n1 = str2.indexOf("h"); //8
        System.out.println("n1 = " + n1);

        int n2 = str2.indexOf("ool"); //9: başladığı index i verir
        System.out.println("n2 = " + n2);

        System.out.println("---------------------------------");

        String str3 = "Java Programming Language";

        int n3 = str3.indexOf("a");// gives you the first matching // ilk "a" nın index ini verir
        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("amm");// gives you the first matching // "amm" in geçtiği ilk index başını verir
        System.out.println("n4 = " + n4);

        int n5 = str3.indexOf("gu");
        System.out.println("n5 = " + n5);

        System.out.println("-----------------------------------");

        int n6 = str3.lastIndexOf("g"); // gives you last matching index number
        System.out.println("n6 = " + n6);

        System.out.println("---------------------------------------------");
        System.out.println("----------------------------------------------");

        String s = "Java Nova Cava Wawa orange";
                  //0123456789
        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        //int fourthA = s.indexOf("ava W");
        //int fourthA = s.lastIndexOf("av");// tersten geliyor dikkat et
        int fourthA = s.indexOf("Ca") + 1;
        //int fifthA = s.lastIndexOf("va") + 1;
        int fifthA = s.lastIndexOf("a W");
        int sixthA = s.lastIndexOf("aw");
        //int seventhA = s.indexOf("a o");
        int seventhA = s.lastIndexOf("a ");

        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);

    }
}
