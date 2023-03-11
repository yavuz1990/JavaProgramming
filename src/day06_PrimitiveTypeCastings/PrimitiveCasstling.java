package day06_PrimitiveTypeCastings;

public class PrimitiveCasstling {
    public static void main(String[] args) {

        byte a = 100;
        short b = a; //implicit casting
        // short b = (short)a;

        int c = b; //implicit casting
        // int c = (int)b;

        long d = c; //implicit casting
        // long d = (long)c;

        float e = d; //implicit casting
        // float e = (float)d;

        System.out.println("-------------------------------------------------");

        int x = 55;
        short y = (short)x;// explicit casting

        System.out.println(x + ":" + y);

        long j = 1_000_000;
        short k = (short)j;// explicit casting

        System.out.println(j + ":" + k);

        double l = 2.5;
        float m = (float)l;// explicit casting

        System.out.println(l + ":" + m);

        double n = 10.5;
        int s =(int)n;// 10    // explicit casting

        System.out.println(n + ":" + s);

        System.out.println("--------------------------------------------");

        double d1 = 3.5;
        short s1 = (short) d1;  // Shortcut: ALT + ENTER
                                // explicit casting

        System.out.println(d1 + ":" +s1);

        float f1 = 30.5F;
        long l1 = (long) f1;

        System.out.println( f1 + ":" + l1);

    }
}
