package day24;
// 예외의 발생과 catch블럭
public class exception03 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4);  // 실행되지않는다.
        } catch (Exception e) {
            System.out.println(5);
        } // try-catch 끝

        System.out.println(6);
    }
}