package decorator;

import display.LabelPanel;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeDisplay extends DisplayDecorator{

    Display display;
    LabelPanel labelPanel;
    JPanel jPanel;
    public TimeDisplay(Display display, int width, int height) {
        super(display, width, height);
        this.display= display;
        labelPanel=new LabelPanel();
        jPanel=display.create();

    }

    @Override
    public JPanel create() {
        System.out.println(2);
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setMinimumSize(new Dimension(getWidth(), getHeight()));
        panel.setPreferredSize(new Dimension(getWidth(), getHeight()));
        labelPanel = new LabelPanel();
        panel.add(jPanel);
        panel.add(labelPanel.createPanel(getWidth(), 100));
        return panel;
    }

    @Override
    public void show() {
        display.show();
        labelPanel.updateText("time" + LocalDateTime.now());
    }
    @Override
    public int getHeight(){
        return display.getHeight()+super.getHeight();
    }

}
