package day03;

public class operator05 {
    public static void main(String[] args) {
        System.out.println(5/2);
        System.out.println(5/(float)2);


        byte a = 10;
        byte b = 30;
        byte c = (byte)(a * b);
        System.out.println(c);


        int d = 1_000_000;
        int e = 2_000_000;

        long f = d * e;
        System.out.println(f);


        long g = 1_000_000 * 1_000_000;
        long h = 1_000_000 * 1_000_000L;
        System.out.println("g = " + g);
        System.out.println("h = " + h);

    }
}
