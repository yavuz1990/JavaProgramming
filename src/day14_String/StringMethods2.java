package day14_String;

import javax.swing.text.SimpleAttributeSet;

public class StringMethods2 {

    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String str2 = str.replace("Java", "Python"); //Python is fun, I love learning Python

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";
        String email2 = email.replace("yahoo", "gmail");//JohnSmith@gmail.com

        System.out.println("email = " + email);
        System.out.println("email2 = " + email2);

        String sentence = "Java Java Pyhton Pyhton C# C# C++ C++ Pyhton Pyhton Pyhton Pyhton ";
        sentence = sentence.replace("Pyhton", "").replace("   ", " ")
                .replace("   ", "");//"Java Java   C# C# C++ C++ " //Sırayla yapıyor;)

        System.out.println("sentence = " + sentence);

        String s = "Dog Dog Dog Dog Dog Dog";
        s = s.replace("Dog", "Cat"); //"Cat Cat Cat Cat Cat Cat"

        System.out.println(s);

        String s2 = "C# is fun, C# is cool";
        s2 = s2.replace(" C#", " Java");

        System.out.println(s2);

        String s3 = "Java";

        s3 = s3.replace("a", "e"); //"Jeve"

        System.out.println(s3);

        System.out.println("-------------------------------------");

        String result = "Java Java Java";

        //result = result.replace("Java","Typhon");
        result = result.replaceFirst("Java", "Pyhton");
        System.out.println(result);

        String result2 = "C# is fun, C# is cool";

        result2 = result2.replaceFirst("C#", "Java");

        System.out.println(result2);

        String result3 = "Java";
        result3 = result3.replaceFirst("va", "vo");//"Javo"

        System.out.println(result3);


    }
}
