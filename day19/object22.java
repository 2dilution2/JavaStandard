package day19;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        this.bonusPoint = (int)(price/10.0);
    }
}

class Tv1 extends Product {
    Tv1() {
        // 조상클래스의 생성자 Product(int price)를 호출한다.
        super(100); // Tv의 가격을 100만원으로 한다.
    }

    // object클래스의 toString()을 오버라이딩 한다.
    public String toString() {return "Tv";}
}

class Computer extends Product {
    Computer(){ super(200); }

    public String toString() { return "Computer"; }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy (Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println(p + "를 구입하였습니다.");
    }
}

public class object22 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv1());
        b.buy(new Computer());

        System.out.println("현재 남은돈은 " + b.money + "입니다.");
        System.out.println("현재 남은포인트점수는 " + b.bonusPoint + "입니다.");
    }
}