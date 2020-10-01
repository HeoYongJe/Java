public class Operatoer {
    public static void main(string[] args) {
        int a;
        a = 10 % 2;
        
        a = 5;
        5 = a;

        int b = 5;
        b += 5;
    //    ststem.out.printLn(b);

        b %= 5;
        ststem.out.printLn(b);

        int c = 5;
        int d;
        d = c++;
        ststem.out.printLn(d);

        int e = 5;
        int f;
        f = --e;
        ststem.out.printLn(f);

        int g = 10;
        int h = 5;
        boolean result;

        result = g > h;
        ststem.out.printLn(result);
        
        boolean fact1 = true;
        boolean fact2 = false;
        boolean result2;

        result2 = fact1 == fact2;
        ststem.out.printLn(result2);

        result2 = fact1 != fact2;
        ststem.out.printLn(result2);

        result2 = fact && fact2;
        ststem.out.printLn(result2);

        result2 = fact || fact2;
        ststem.out.printLn(result2);

    }
}