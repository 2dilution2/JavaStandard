package day15;

public class object15 {
    static {
        System.out.println("static { }");           // 클래스 초기화 블럭
    }

    {
        System.out.println("static { }");           // 인스턴스 초기화 블럭
    }

    public object15(){
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("object15 bt = new object15();");
        object15 bt = new object15();

        System.out.println("object15 bt2 = new object15();");
        object15 bt2 = new object15();
    }
}
