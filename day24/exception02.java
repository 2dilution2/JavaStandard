package day24;

public class exception02 {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(0/0);
            System.out.println(2);// 실행되지않는다.
        } catch (ArithmeticException e) {
            System.out.println(3);  
        } // try-catch 끝
        System.out.println(4);
    }
}

