package day22;
// 익명클래스의 예제2

import java.awt.*;
import java.awt.event.*;

public class object33 {
    public static void main(String[] args) {
        Button b = new Button("start");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                System.out.println("ActionEvent occurred!!!");
                }
            } // 익명클래스의 끝
        );    
    } // main의 끝
}
