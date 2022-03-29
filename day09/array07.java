package day09;

public class array07 {
    // 커맨ㄷ드 라인을 통해 입력 받기
    public static void main(String[] args) {
        System.out.println("매개변수의 개수 : " +args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = \"" + args[i] + "\"");
        }
    }
}
