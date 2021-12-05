public class FirstOperandState implements State{

    private CalcV1 calcV1;
    public FirstOperandState(CalcV1 calcV1) {
        this.calcV1= calcV1;
    }

    @Override
    public void OperatorProcess(char ch) {
        calcV1.setOperator(ch);
        calcV1.setState(calcV1.getOperatorState());
    }
}
