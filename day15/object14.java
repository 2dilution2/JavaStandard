package day15;
    // 생성자에서 다른 생성자 호출하기
class Car2{
    String color;       // 색상
    String gearType;    // 변속기 종류
    int door;           // 문의 갯수

    Car2(){
        this("white", "auto", 4);
    }

    Car2(String color){
        this(color, "auto", 4);
    }

    Car2 (String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class object14 {
    public static void main(String[] args) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("blue");

        System.out.println("c1의 color = " + c1.color + ", c1.gearType = " + c1.gearType + ", c1.door = " + c1.door);
        System.out.println("c2의 color = " + c2.color + ", c2.gearType = " + c2.gearType + ", c2.door = " + c2.door);
    }
}
