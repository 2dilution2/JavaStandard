package day26;
// 예외 발생시키기
public class exception06 {
    public static void main(String[] args) {
        try {
            Exception e = new Exception("고의로 발생 시켰음");
            throw e;
        //  throw new Exception("고의로 발생 시켰음");  - 둘다 가능 
        } catch (Exception e) {
            System.out.println("에러메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었음.");
    }
}
