package day20;
    // 내부클래스의 베어자와 접근성 예제1

public class object26 {
    class InstanceInner {
        int iv = 100;
//      static int cv = 100;            // 에러 > static은 변수를 선언할 수 없다.
        final static int CONST = 100;   // final은 상수이므로 허용
    }
    
    static class StaticInner {
        int iv = 200;
        static int cv  = 200;       // static클래스만 static맴버를 정의할 수 있다.
    }

    void myMethod() {
        class LocalInner {
            int iv = 300;
//          static int cv = 300;
            final static int CONST = 300;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
    
}
