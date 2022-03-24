package day02;

public class constant {
    // 상수는 변수와 마찬가지로 값을 저장하는 공간이지만 한번 저장하면 다른값으로 변경할 수 없다.
    // 변수 앞에 final을 붙여준다
    public static void main(String[] args) {
        final int MAX_VALUE;
        MAX_VALUE = 100;    //상수에 처음 저장된 값
        // MAX_VALUE = 200; //error 변경불가
        System.out.println(MAX_VALUE);
    }
    
}
