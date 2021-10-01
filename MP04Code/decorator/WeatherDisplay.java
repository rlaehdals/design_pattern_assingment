package decorator;

import display.LabelPanel;

import javax.swing.*;
import java.awt.*;

public class WeatherDisplay extends DisplayDecorator{
    Display display;
    LabelPanel labelPanel;
    JPanel jPanel;
    public WeatherDisplay(Display display, int width, int height) {
        super(display, width, height);
        this.display= display;
        labelPanel=new LabelPanel();
        jPanel=display.create();

    }

    @Override
    public JPanel create() {
        System.out.println(3);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setMinimumSize(new Dimension(getWidth(), getHeight()));
        panel.setPreferredSize(new Dimension(getWidth(), 100));
        labelPanel = new LabelPanel();
        panel.add(jPanel);
        panel.add(labelPanel.createPanel(getWidth(), getHeight()));
        return  panel;
    }

    @Override
    public void show() {
        display.show();
        labelPanel.updateText("weather");
    }

    @Override
    public int getHeight(){
        return display.getHeight()+100;
    }


}
