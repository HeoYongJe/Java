public class Operator {
    public static void main(String[] args) {
        int a = 10 % 2;
        
        a = 5;

        int b = 5;
        b += 5;
    //    ststem.out.printLn(b);

        b %= 5;
        System.out.println(b);
        
        int c = 5;
        int d;
        d = c++;
        System.out.println(d);

        int e = 5;
        int f;
        f = --e;
        System.out.println(f);

        int g = 10;
        int h = 5;
        boolean result;

        result = g > h;
        System.out.println(result);
        
        boolean fact1 = true;
        boolean fact2 = false;
        boolean result2;

        result2 = fact1 == fact2;
        System.out.println(result2);

        result2 = fact1 != fact2;
        System.out.println(result2);

        result2 = fact1 && fact2;
        System.out.println(result2);

        result2 = fact1 || fact2;
        System.out.println(result2);

    }
}
