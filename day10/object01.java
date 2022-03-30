package day10;

public class object01 {
    // 객체 지향 프로그래밍
    public static void main(String[] args) {
        Tv t;               // Tv인스턴스를 참조하기 위한 변수 t를 선언
        t = new Tv();       // Tv인스턴스를 생성한다.
        t.channel = 7;      // Tv인스턴스의 맴버변수 channel의 값을 7로 한다.
        t.channelDown();    // Tv인스턴스의 매서드 channelDown()을 호출한다.
        System.out.println("현재채널은 " + t.channel + "입니다.");
    }
}

class Tv {
    // Tv의 속성
    String color;           // 색상
    boolean power;          // 전원 상태
    int channel;            // 채널

    // Tv의 기능
    void power() { power = !power; }        // Tv를 키고 끈다.
    void channelUp() { ++channel; }         // Tv의 채널을 높힌다.
    void channelDown() { --channel; }       // Tv의 채널을 낮춘다.
}