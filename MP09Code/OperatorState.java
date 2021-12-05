public class OperatorState implements State{

    private CalcV1 calcV1;

    public OperatorState(CalcV1 calcV1) {
        this.calcV1 = calcV1;
    }

    @Override
    public void NumberProcess(int num) {
        calcV1.setOperand2(num);
        calcV1.setState(calcV1.getSecondState());
    }
}
