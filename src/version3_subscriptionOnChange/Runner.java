package version3_subscriptionOnChange;

import version3_subscriptionOnChange.Controller.Controller;

import javax.swing.*;

public class Runner {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.add(new Controller());
    }
}
