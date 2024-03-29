package decorator;

import display.LabelPanel;

import javax.swing.*;
import java.awt.*;

public class SpeedometerDisplay extends DisplayDecorator{

    Display display;
    LabelPanel labelPanel;
    JPanel jPanel;
    public SpeedometerDisplay(Display display, int width, int height) {
        super(display, width, height);
        this.display= display;
        labelPanel=new LabelPanel();
        jPanel= display.create();
    }

    @Override
    public JPanel create() {
        System.out.println(4);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setMinimumSize(new Dimension(getWidth(), getHeight()));
        panel.setPreferredSize(new Dimension(getWidth(), getHeight()));
        labelPanel = new LabelPanel();
        panel.add(jPanel);
        panel.add(labelPanel.createPanel(getWidth(), 100));
        return  panel;
    }

    @Override
    public void show() {
        display.show();
        labelPanel.updateText("speed");
    }
    @Override
    public int getHeight(){
        return display.getHeight()+super.getHeight();
    }

}
