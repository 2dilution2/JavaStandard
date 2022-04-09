
package day16;
    // 상속 예제

class Tv{
    boolean power;
    int channel;

    void power()        { power = !!power; }
    void channelUp()    { ++channel; }
    void channelDown()  { --channel; }
}

class smartTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if (caption)
        System.out.println(text);
    }
}

public class object17 {
    public static void main(String[] args) {
        smartTv stv = new smartTv();
        stv.channel = 10;
        stv.channelUp();
        System.out.println(stv.channel);
        stv.displayCaption("Hello World");
        stv.caption = true;
        stv.displayCaption("Hello World");
    }
}
