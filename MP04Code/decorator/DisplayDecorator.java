package decorator;

import display.LabelPanel;

import javax.swing.*;
import java.awt.*;

public abstract class DisplayDecorator extends Display {



    DisplayDecorator(Display display, int width, int height) {
        super(width, height);
    }

}

