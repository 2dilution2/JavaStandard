package day02;

public class overflow {
    public static void main(String[] args) {
        // 부호없는 정수와 부호있는 정수는 표현범위 즉, 최대값과 최소값이 다르기 때문에 오버플로우가 발생하는 시점이 다르다.
        // 부호없는 정수는 2진수로 '0000'이 될때 오버플로우가 발생하고, 부호있는 정수는 부호비트가 0에서 1이 될 때 오버플로우가 발생한다.

        short sMin = -32768,    sMax = 32767;
        char cMin = 0,          cMax = 65535;

        System.out.println("sMin    = " + sMin);
        System.out.println("sMin-1  = " + (short)(sMin-1) );
        System.out.println("sMax    = " + sMax);
        System.out.println("sMax+1  = " + (short)(sMax+1) );
        System.out.println("cMin    = " + (int) cMin);
        System.out.println("cMin-1  = " + (int) -- cMin);
        System.out.println("cMax    = " + (int) cMax);
        System.out.println("cMax+1  = " + (int) ++ cMax);

    }
}
