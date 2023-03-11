package day24_CustomMethod_Return;
public class Test {

    public static void main(String[] args) {

        String str = "aaaaaaaaaaaaaaaabbbbbbbbbbb";
        str = day24_CustomMethods_Return.ReturnMethodPractice4.removeDuplicates(str);

        System.out.println(str);


        String name = "Java Programming";

        String reversedName = day24_CustomMethods_Return.ReturnMethodIntro.reverse(name);

        System.out.println("reversedName = " + reversedName);


    }
}
