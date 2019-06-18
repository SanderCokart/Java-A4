package assignment4.View;

import javax.swing.*;

public class View extends JPanel {
    private JLabel displayName;

    public View() {
        displayName = new JLabel("");
        this.add(displayName);
    }

    public void setDisplayName(String text) {
        displayName.setText(text);
    }

}