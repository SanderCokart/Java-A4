package version3_subscriptionOnChange.View;

import javax.swing.*;

public class View extends JPanel {
    private JLabel numberCounter;

    public View(){
        numberCounter = new JLabel("0");
        this.add(numberCounter);
    }

    public void setNumberCounter(String text){
        numberCounter.setText(text);
    }
}
