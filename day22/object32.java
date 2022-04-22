package day22;
// 익명클래스의 예제1

import java.awt.*;
import java.awt.event.*;

public class object32 {
    public static void main(String[] args) {
        Button b = new Button("start");
        b.addActionListener(new EventHandler());
    }
}

class EventHandler implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent occurred!!!");        
    }
}