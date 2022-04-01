package day11;

public class object03 {
    // 변수의 종류                          ┐
    int iv;         // 인스턴스 변수            클래스 영역
    static int cv;  // 클래스 변수          ┘

    void meethod(){
        int lv = 0; // 지역 변수            ─   매서드 영역
        System.out.println(lv);
    }
}
