package day05;

public class control02 {
    // 조건식의 다양한 예
    public static void main(String[] args) {
        int x = 0;
        System.out.printf("x=%d 일때, 참인 것은?%n", x);

        if(x==0) System.out.println("x == 0");
        if(x!=0) System.out.println("x != 0");
        if(!(x == 0)) System.out.println("!(x == 0)");
        if(!(x != 0)) System.out.println("!(x != 0)");
        
        x = 1;
        System.out.printf("x=%d 일때, 참인 것은?%n", x);

        if(x==0) System.out.println("x == 0");
        if(x!=0) System.out.println("x != 0");
        if(!(x == 0)) System.out.println("!(x == 0)");
        if(!(x != 0)) System.out.println("!(x != 0)");

    }
}
