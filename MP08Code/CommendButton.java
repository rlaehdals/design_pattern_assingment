import javax.swing.*;

public abstract class CommendButton extends JButton implements Commend{

    private Calculator calculator;

    public CommendButton(Calculator calculator) {
        this.calculator = calculator;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public abstract void execute();
}
