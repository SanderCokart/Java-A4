package assignment4;

import assignment4.Controller.Controller;

import javax.swing.*;
import java.awt.*;

public class Runner {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(200,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(new Controller());
    }
}
