package version1_manager.View;

import javax.swing.*;

public class MainMenu extends JPanel {
    private JLabel display;
    public MainMenu(){
        display = new JLabel("0");
        this.add(display);
    }
    public void setDisplay(String text){
        display.setText(text);
    }
}

