public class EqualButton extends CommendButton{

    private Calculator calculator;
    private CalcGUIV1 display;
    public EqualButton(Calculator calculator, CalcGUIV1 calcGUIV1) {
        super(calculator);
        this.calculator=getCalculator();
        this.display= calcGUIV1;
    }

    @Override
    public void execute() {


    }
}
