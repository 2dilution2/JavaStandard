package day11;

public class object04 {
    // 클래스변수와 인스턴스변수 예제
    public static void main(String[] args) {
        System.out.println("Card.weidth =  " + Card.width);
        System.out.println("Card.height =  " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;
        
        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
        System.out.println("c2은 " + c2.kind + c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
        System.out.println("c1의 weidth와 height를 각각 50, 80으로 변경 합닏다.");

        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " + c1.kind + c1.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
        System.out.println("c2은 " + c2.kind + c2.number + "이며, 크기는 (" + Card.width + ", " + Card.height + ")");
    }
}

class Card{
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}