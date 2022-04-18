package day19;

class Product2 {
    int price;
    int bonusPoint;

    Product2(int price) {
        this.price = price;
        this.bonusPoint = (int)(price/10.0);
    }

    Product2(){}    // 기본 생성자
}

class Tv2 extends Product2 {
    Tv2() { super(100); }
    public String toString() {return "Tv";}
}

class Computer2 extends Product2 {
    Computer2(){ super(200); }

    public String toString() { return "Computer"; }
}

class Audio2 extends Product2 {
    Audio2(){ super(50); }

    public String toString() { return "Audio"; }
}


class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;
    Product2[] cart = new Product2[10];
    int i = 0;

    void buy (Product2 p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;               // 가진돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint;     // 제품의 보너스 점수를 추가한다.
        cart[i++] = p;                  // 제품을 Product[] cart에 저장한다. 
        System.out.println(p + "를 구입하였습니다.");
    }


    void summary(){
        int sum = 0;
        String itemList = "";

        // 반복문을 이용 해서 구입한 물품의 총가격과 목록을 만든다.
        for(int i = 0; i<cart.length; i++){
            if (cart[i]==null) break;
            sum += cart[i].price;
            if (i==0) {
                itemList += cart[i];
            } else {
                itemList += ", " + cart[i];
            }
        }
        System.out.println("구입한 물품의 총금액은 " + sum + "만원 입니다.");
        System.out.println("구입한 제품은 " + itemList + "입니다.");
    }
}

class object23 {
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();

        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Audio2());
        b.summary();
    }
}