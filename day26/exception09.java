package day26;
// 메서드에 예외 선언하기 예제1
public class exception09 {
    public static void main(String[] args) throws Exception {
        method1();  // 같은 클래스내의 static맴버이므로 객체생성없이 직접 호출가능.
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception();
    }   
}


