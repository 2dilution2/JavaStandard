package day22;
// 내부클래스의 제어자와 접근성 예제5

class Outer3 {
    int value = 10;

    class Inner {
        int value = 20;

        void method1() {
            int value = 30;
            System.out.println("            value : " + value);
            System.out.println("       this.value : " + this.value);
            System.out.println("Outer3.this.value : " + Outer3.this.value);
        }
    } // Inner클래스의 끝 
} // Outer클래스의 끝

public class object30 {
    public static void main(String[] args) {
        Outer3 outer = new Outer3();
        Outer3.Inner inner = outer.new Inner();
        inner.method1();
    }    
}
