public class NumberButton extends CommendButton{


    private Calculator calculator;

    private CalcGUIV1 display;
    public NumberButton(Calculator calculator, CalcGUIV1 calcGUIV1) {
        super(calculator);
        this.calculator=getCalculator();
        this.display=calcGUIV1;
    }

    @Override
    public void execute() {
        if(calculator.isOperand1Set() && calculator.isOperatorSet()){
            calculator.setOperand2();
        }
    }
}
