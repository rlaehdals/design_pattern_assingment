public class OperatorButton extends CommendButton{

    private Calculator calculator;
    private CalcGUIV1 display;
    public OperatorButton(Calculator calculator, CalcGUIV1 calcGUIV1) {
        super(calculator);
        this.calculator=getCalculator();
        this.display= calcGUIV1;
    }


    @Override
    public void execute() {

    }
}
