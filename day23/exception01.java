package day23;

public class exception01 {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(2);
            System.out.println(3);
        } catch (Exception e) {
            System.out.println(4);  // 실행되지않는다.
        } // try-catch 끝
        System.out.println(5);
    }
}
