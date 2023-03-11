package day15_ForLoop;

public class StrinMethods {

    public static void main(String[] args) {

        String str = "      ";

        boolean r = str.isEmpty();

        System.out.println(r);
        boolean r1 = str.isBlank();

        System.out.println(r1);

        String str2 = "Cydeo     ";

        System.out.println(str2.isBlank());

        System.out.println("----------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));// false
        System.out.println(s1.equalsIgnoreCase(s2)); // true

        //Yes, YES, yEs, yES, yEs....

        System.out.println("yEs".equals("Yes"));// false
        System.out.println("yEs".equalsIgnoreCase("Yes"));//true

        System.out.println("----------------------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");// false
        boolean hasJava = sentence.contains("Java");//true
        boolean hasJava2 = sentence.contains("java");//false
        boolean hasJava3 = sentence.toLowerCase().contains("java");//true
        boolean r3 = sentence.contains("java") || sentence.contains("Java");//true

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);
        System.out.println(r3);

        System.out.println("----------------------------------------");

        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equalsIgnoreCase(input2));//false

        System.out.println(input1.contains("Java"));;//true
        System.out.println(input1.contains("java"));//false
        System.out.println(input2.contains("Java"));//true

        System.out.println(input1.toLowerCase().contains("java"));//true
        System.out.println(input1.toUpperCase().contains("JAVA"));//true

        System.out.println("--------------------------------------");

        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.startsWith("wooden");
        boolean z1 = a.toLowerCase().startsWith("wooden");
        // in order to ignore the case sensitivity we first create the lower case/upper case version of string and then compare it with lowercase/uppercase

        System.out.println(x);//true
        System.out.println(y);//true
        System.out.println(z);//false
        System.out.println(z1);//true



    }
}
